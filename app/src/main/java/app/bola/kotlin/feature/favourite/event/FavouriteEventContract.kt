package app.bola.kotlin.feature.favourite.event

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.entity.EventEntity

class FavouriteEventContract {

    interface Presenter : BasePresenter {
        fun getListFavorite()
    }

    interface View : BaseView {
        fun setViewModel(data: EventEntity)

        fun notifyDataChange()
    }
}