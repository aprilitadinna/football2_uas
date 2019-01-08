package app.bola.kotlin.feature.event.match

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.response.Event
import app.bola.kotlin.model.response.League
import app.bola.kotlin.model.response.ListResponse

class MatchContract {

    interface Presenter : BasePresenter {

        fun getAllLeague()

        fun getLastMatch()

        fun getNextMatch()
    }

    interface View : BaseView {
        fun getSelectedLeagueId(): String?

        fun setLeagues(leagueResponse: ListResponse<League>?)

        fun setViewModel(eventResponse: ListResponse<Event>?)
    }
}