package com.xoxo.tictactoe.game.viewmodel.mapper

import com.xoxo.tictactoe.R
import com.xoxo.tictactoe.domain.usecase.model.TicTacToeGameStatus
import com.xoxo.tictactoe.domain.usecase.model.TicTacToePlayer
import com.xoxo.tictactoe.game.model.TicTacToeResultModel

fun TicTacToeGameStatus.toResultModel(): TicTacToeResultModel? {
    return when (this) {
        TicTacToeGameStatus.InProgress -> null
        TicTacToeGameStatus.Draw -> {
            TicTacToeResultModel(
                nameId = R.string.ticTacToeGameResult_draw,
                winnerId = null
            )
        }
        is TicTacToeGameStatus.Win -> {
            val playerViewId = when (winner) {
                TicTacToePlayer.X -> R.id.textView_ticTacToeGameResult_playerX
                TicTacToePlayer.O -> R.id.textView_ticTacToeGameResult_playerO
            }
            TicTacToeResultModel(
                nameId = R.string.ticTacToeGameResult_winner,
                winnerId = playerViewId
            )
        }
    }
}