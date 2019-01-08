package app.bola.kotlin.feature.favourite.team

import app.bola.kotlin.di.scope.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class FavouriteTeamModule {

    @ActivityScope
    @Binds
    abstract fun provideFavoriteTeamFragment(favouriteTeamFragment: FavouriteTeamFragment): FavouriteTeamContract.View

    @ActivityScope
    @Binds
    abstract fun provideFavoriteTeamPresenter(favouriteTeamPresenterImpl: FavouriteTeamPresenterImpl): FavouriteTeamContract.Presenter
}