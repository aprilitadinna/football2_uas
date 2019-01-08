package app.bola.kotlin.feature.team.list

import app.bola.kotlin.di.scope.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class TeamListModule {

    @ActivityScope
    @Binds
    internal abstract fun provideTeamListView(listTeamFragment : TeamListFragment) : TeamListContract.View

    @ActivityScope
    @Binds
    internal abstract fun provideTeamListPrenter(listTeamPresenterImpl: TeamListPresenterImpl) : TeamListContract.Presenter

}