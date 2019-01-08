package app.bola.kotlin.feature.event.detail

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.entity.TeamEntity

class TeamDetailContract {

    interface Presenter : BasePresenter {

        fun insertTeamToFavorite(teamEntity: TeamEntity)

        fun isExistFavoriteTeam(teamId: String?)

        fun deleteMatchFromFavorite(teamId: String?)
    }

    interface View : BaseView {

        fun isExistFavoriteTeam(isFavorite: Boolean)

        fun getTeamId(): String?
    }
}