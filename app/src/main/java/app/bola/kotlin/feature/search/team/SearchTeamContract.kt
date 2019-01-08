package app.bola.kotlin.feature.search.team

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.response.ListResponse
import app.bola.kotlin.model.response.Team

class SearchTeamContract {

    interface View : BaseView {
        fun setViewModel(data: ListResponse<Team>)

        fun search(query: String)
    }

    interface Presenter : BasePresenter {
        fun searchTeams(query: String)
    }
}