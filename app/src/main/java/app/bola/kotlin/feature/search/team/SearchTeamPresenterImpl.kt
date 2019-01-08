package app.bola.kotlin.feature.search.team

import app.bola.kotlin.feature.base.BaseIdleListener
import app.bola.kotlin.feature.base.BasePresenterImpl
import app.bola.kotlin.model.Constant
import app.bola.kotlin.model.response.ListResponse
import app.bola.kotlin.network.TheSportDBApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class SearchTeamPresenterImpl @Inject constructor(
        private val idleListener: BaseIdleListener,
        private val view: SearchTeamContract.View,
        private val apiService: TheSportDBApiService)
    : BasePresenterImpl(), SearchTeamContract.Presenter {

    override fun searchTeams(query: String) {
        super.addDisposable(apiService.searchTeams(query)
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
                .onErrorReturn { ListResponse() }
                .subscribe {
                    view.setViewModel(it)
                })
    }
}