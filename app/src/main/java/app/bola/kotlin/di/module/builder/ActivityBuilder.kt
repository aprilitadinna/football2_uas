package app.bola.kotlin.di.module.builder

import app.bola.kotlin.di.scope.ActivityScope
import app.bola.kotlin.feature.event.detail.MatchDetailActivity
import app.bola.kotlin.feature.event.detail.MatchDetailModule
import app.bola.kotlin.feature.event.detail.TeamDetailModule
import app.bola.kotlin.feature.event.match.MatchFragment
import app.bola.kotlin.feature.event.match.MatchModule
import app.bola.kotlin.feature.favourite.event.FavouriteEventFragment
import app.bola.kotlin.feature.favourite.event.FavouriteEventModule
import app.bola.kotlin.feature.favourite.team.FavouriteTeamFragment
import app.bola.kotlin.feature.favourite.team.FavouriteTeamModule
import app.bola.kotlin.feature.search.event.SearchEventFragment
import app.bola.kotlin.feature.search.event.SearchEventModule
import app.bola.kotlin.feature.search.team.SearchTeamFragment
import app.bola.kotlin.feature.search.team.SearchTeamModule
import app.bola.kotlin.feature.team.detail.TeamDetailActivity
import app.bola.kotlin.feature.team.list.TeamListFragment
import app.bola.kotlin.feature.team.list.TeamListModule
import app.bola.kotlin.feature.team.player.PlayerListFragment
import app.bola.kotlin.feature.team.player.PlayerListModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [TeamListModule::class])
    internal abstract fun provideTeamListActivity() : TeamListFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [MatchModule::class])
    abstract fun provideMatchFragment(): MatchFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [MatchDetailModule::class])
    abstract fun provideMatchDetailActvity(): MatchDetailActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [SearchEventModule::class])
    abstract fun provideSearchEvent(): SearchEventFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [SearchTeamModule::class])
    abstract fun provideSearchTeam(): SearchTeamFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [FavouriteTeamModule::class])
    abstract fun provideFavoriteTeam(): FavouriteTeamFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [FavouriteEventModule::class])
    abstract fun provideFavoriteEvent(): FavouriteEventFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [TeamDetailModule::class])
    abstract fun provideTeamDetailActivity(): TeamDetailActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [PlayerListModule::class])
    abstract fun providePlayerListFragment(): PlayerListFragment

}