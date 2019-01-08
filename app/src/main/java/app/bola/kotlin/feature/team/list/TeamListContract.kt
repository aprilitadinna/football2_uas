package app.bola.kotlin.feature.team.list

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.response.League
import app.bola.kotlin.model.response.ListResponse
import app.bola.kotlin.model.response.Team

class TeamListContract {

    interface Presenter : BasePresenter {

        fun getLeagueList()

        fun getTeamList(leagueName: String)
    }

    interface View : BaseView {

        fun leagueName() : String

        fun showTeamList(teamResponse: ListResponse<Team>?)

        fun getListLaugue(leagueResponse: ListResponse<League>?)
    }
}