package app.bola.kotlin.feature.search.event

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.response.Event
import app.bola.kotlin.model.response.ListResponse

class SearchEventContract {

    interface  View : BaseView {
        fun setViewModel(data: ListResponse<Event>)

        fun search(query: String)
    }

    interface Presenter : BasePresenter {
        fun searchMatches(query: String)
    }
}