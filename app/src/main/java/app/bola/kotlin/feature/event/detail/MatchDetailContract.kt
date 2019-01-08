package app.bola.kotlin.feature.event.detail

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.entity.EventEntity
import app.bola.kotlin.model.response.Event
import app.bola.kotlin.model.response.Team

class MatchDetailContract {

    interface Presenter : BasePresenter {

        fun getDetailEvent()

        fun insertMatchToFavorite(eventEntity: EventEntity)

        fun isExistFavoriteEvent(eventId: String?)

        fun deleteMatchFromFavorite(eventId: String?)
    }

    interface View : BaseView {

        fun isExistFavoriteEvent(isFavorite: Boolean)

        fun getEventId(): String?

        fun setEventDetailModel(event: Event)

        fun setTeamDetailModel(team: Team)
    }
}