package app.bola.kotlin.feature.team.player

import app.bola.kotlin.feature.base.BaseIdleListener
import app.bola.kotlin.feature.base.BasePresenterImpl
import app.bola.kotlin.feature.event.detail.TeamDetailPresenterImpl
import app.bola.kotlin.network.TheSportDBApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class PlayerListPresenterImpl @Inject constructor(
        private val idleListener: BaseIdleListener,
        private val view: PlayerListContract.View,
        private val apiService: TheSportDBApiService
) : BasePresenterImpl(), PlayerListContract.Presenter {

    override fun getListTeamPlayer(teamId: String) {
        super.addDisposable(apiService.getAllPlayers(teamId)
                .doOnSubscribe {
                    view.showLoading()
                    idleListener.increment()
                }
                .doAfterTerminate {
                    view.hideLoading()
                    idleListener.decrement()
                }
                .observeOn(AndroidSchedulers.mainThread())
                .doOnError { view.showMessage(TeamDetailPresenterImpl.FAILED_ADD_TO_FAVORITE) }
                .subscribe {
                    view.setPlayerViewModel(it)
                })
    }
}