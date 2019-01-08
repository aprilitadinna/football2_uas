package app.bola.kotlin.di.component

import android.app.Application
import app.bola.kotlin.di.AppController
import app.bola.kotlin.di.module.AppModule
import app.bola.kotlin.di.module.builder.ActivityBuilder
import app.bola.kotlin.di.scope.ApplicationScope
import app.bola.kotlin.network.TheSportDBApiService
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule



@ApplicationScope
@Component(modules = [
    AndroidInjectionModule::class,
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class])
interface AppComponent : AndroidInjector<AppController> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun theSportDBApiService(): TheSportDBApiService
}