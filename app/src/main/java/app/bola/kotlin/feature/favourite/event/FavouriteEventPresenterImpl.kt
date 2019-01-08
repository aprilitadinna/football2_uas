package app.bola.kotlin.feature.favourite.event

import app.bola.kotlin.feature.base.BaseIdleListener
import app.bola.kotlin.feature.base.BasePresenterImpl
import app.bola.kotlin.model.Constant
import app.bola.kotlin.model.entity.EventEntity
import app.bola.kotlin.repository.FavouriteMatchRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class FavouriteEventPresenterImpl @Inject constructor(
        private val idleListener: BaseIdleListener,
        private val view: FavouriteEventContract.View,
        private val favouriteRepository: FavouriteMatchRepository
) : BasePresenterImpl(), FavouriteEventContract.Presenter {

    override fun getListFavorite() {
        return super.addDisposable(favouriteRepository.findAll()
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {
                    view.showLoading()
                    idleListener.increment()
                }
                .doOnError { view.showMessage(Constant.FAILED_GET_DATA) }
                .onErrorReturn { EventEntity() }
                .doOnComplete {
                    view.hideLoading()
                    view.notifyDataChange()
                    idleListener.decrement()
                }
                .subscribe { view.setViewModel(it) })
    }

}