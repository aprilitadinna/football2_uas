package app.bola.kotlin.feature.favourite.team

import app.bola.kotlin.feature.base.BasePresenter
import app.bola.kotlin.feature.base.BaseView
import app.bola.kotlin.model.entity.TeamEntity

class FavouriteTeamContract {

    interface Presenter : BasePresenter {
        fun getListFavorite()
    }

    interface View : BaseView {
        fun setViewModel(data: TeamEntity)

        fun notifyDataChange()
    }
}