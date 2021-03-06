package app.bola.kotlin.feature.favourite.event

import app.bola.kotlin.di.scope.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class FavouriteEventModule {

    @ActivityScope
    @Binds
    abstract fun provideFavoriteTeamFragment(favouriteEventFragment: FavouriteEventFragment): FavouriteEventContract.View

    @ActivityScope
    @Binds
    abstract fun provideFavoriteEventPresenter(favouriteEventPresenterImpl: FavouriteEventPresenterImpl): FavouriteEventContract.Presenter
}