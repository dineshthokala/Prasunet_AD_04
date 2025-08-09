package com.xoxo.tictactoe.domain.usecase.model

class TicTacToeGame(
    val board: List<List<TicTacToePlayer?>>,
    val currentPlayer: TicTacToePlayer,
    val status: TicTacToeGameStatus
)
