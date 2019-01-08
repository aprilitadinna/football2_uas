package app.bola.kotlin.feature.team.player

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.response.ListResponse
import app.bola.kotlin.model.response.Player

class PlayerListContract {

    interface View : BaseView {

        fun setPlayerViewModel(players: ListResponse<Player>)
    }

    interface Presenter : BasePresenter {
        fun getListTeamPlayer(teamId: String)
    }
}