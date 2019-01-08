package app.bola.kotlin.feature.favourite.team

import app.bola.kotlin.feature.base.BaseIdleListener
import app.bola.kotlin.feature.base.BasePresenterImpl
import app.bola.kotlin.model.Constant
import app.bola.kotlin.model.entity.TeamEntity
import app.bola.kotlin.repository.FavoriteTeamRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class FavouriteTeamPresenterImpl @Inject constructor(
        private val idleListener: BaseIdleListener,
        private val view: FavouriteTeamContract.View,
        private val favoriteRepository: FavoriteTeamRepository
) : BasePresenterImpl(), FavouriteTeamContract.Presenter {

    override fun getListFavorite() {
        return super.addDisposable(favoriteRepository.findAll()
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {
                    view.showLoading()
                    idleListener.increment()
                }
                .doOnTerminate {
                    view.hideLoading()
                    idleListener.decrement()
                }
                .doOnError { view.showMessage(Constant.FAILED_GET_DATA) }
                .onErrorReturn { TeamEntity() }
                .doOnComplete {
                    view.hideLoading()
                    view.notifyDataChange()
                }
                .subscribe { view.setViewModel(it) })
    }

}