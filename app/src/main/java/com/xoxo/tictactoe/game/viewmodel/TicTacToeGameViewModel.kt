package com.xoxo.tictactoe.game.viewmodel

import com.xoxo.libs.base.viewmodel.BaseViewModel
import com.xoxo.tictactoe.domain.usecase.PlayTicTacToeUseCase
import com.xoxo.tictactoe.domain.usecase.PlayTicTacToeUseCase.GameIsOverException
import com.xoxo.tictactoe.domain.usecase.PlayTicTacToeUseCase.InvalidPositionException
import com.xoxo.tictactoe.domain.usecase.model.TicTacToeGame
import com.xoxo.tictactoe.game.model.TicTacToeGameState
import com.xoxo.tictactoe.game.viewmodel.mapper.toResultModel

class TicTacToeGameViewModel : BaseViewModel<TicTacToeGameState>() {

    override val initialState = TicTacToeGameState()
    private val playTicTacToeUseCase = PlayTicTacToeUseCase()

    init {
        state = initialState
        getInitialGameInfo()
    }

    private fun getInitialGameInfo() {
        val game = playTicTacToeUseCase.getGameInfo()
        setGameState(game)
    }

    fun makeMove(position: Pair<Int, Int>) {
        try {
            val game = playTicTacToeUseCase.makeMove(position)
            setGameState(game)
        } catch (e: GameIsOverException) {
        } catch (e: InvalidPositionException) {
        }
    }

    fun restartGame() {
        val game = playTicTacToeUseCase.restartGame()
        setGameState(game)
    }

    private fun setGameState(game: TicTacToeGame) {
        state = state.copy(
            playerTurn = game.currentPlayer.name,
            board = game.board.map { row -> row.map { it?.name ?: "" } },
            result = game.status.toResultModel()
        )
    }
}