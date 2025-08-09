package com.xoxo.tictactoe.domain.usecase.model

sealed class TicTacToeGameStatus {
    object InProgress : TicTacToeGameStatus()
    object Draw : TicTacToeGameStatus()
    data class Win(val winner: TicTacToePlayer) : TicTacToeGameStatus()
}