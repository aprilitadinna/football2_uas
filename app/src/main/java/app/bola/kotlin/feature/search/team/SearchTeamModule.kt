package app.bola.kotlin.feature.search.team

import app.bola.kotlin.di.scope.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class SearchTeamModule {

    @ActivityScope
    @Binds
    abstract fun provideSearchTeam(searchTeamFragment: SearchTeamFragment): SearchTeamContract.View

    @ActivityScope
    @Binds
    abstract fun provideSearchPresenter(searchTeamPresenterImpl: SearchTeamPresenterImpl): SearchTeamContract.Presenter
}