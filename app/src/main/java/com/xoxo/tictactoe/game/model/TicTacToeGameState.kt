package com.xoxo.tictactoe.game.model

import com.xoxo.libs.base.viewstate.BaseViewState

/**
 * State for TicTacToeGame View
 * Note that all fields must be "val" so the state is immutable.
 * This is the "Single Source of Truth" of TicTacToeGame View.
 */
data class TicTacToeGameState(
    val playerTurn: String = "",
    val board: List<List<String>> = emptyList(),
    val result: TicTacToeResultModel? = null
) : BaseViewState
