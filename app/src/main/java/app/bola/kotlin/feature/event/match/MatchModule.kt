package app.bola.kotlin.feature.event.match

import app.bola.kotlin.di.scope.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class MatchModule {

    @ActivityScope
    @Binds
    abstract fun provideMatchView(matchFragment: MatchFragment): MatchContract.View

    @ActivityScope
    @Binds
    abstract fun provideMatchPresenter(matchPresenterImpl: MatchPresenterImpl): MatchContract.Presenter
}