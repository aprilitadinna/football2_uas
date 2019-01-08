package app.bola.kotlin.di.module

import android.app.Application
import android.content.Context
import app.bola.kotlin.di.scope.ApplicationContext
import app.bola.kotlin.di.scope.ApplicationScope
import app.bola.kotlin.feature.base.BaseIdleListener
import app.bola.kotlin.feature.base.BaseIdleResource
import app.bola.kotlin.network.NetworkModule
import app.bola.kotlin.repository.RepositoryModule
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module(includes = [NetworkModule::class, RepositoryModule::class])
class AppModule {

    @ApplicationScope
    @Provides
    @ApplicationContext
    internal fun provideApplication(application: Application) : Application {
        return application
    }

    @ApplicationScope
    @Provides
    internal fun provideContext(@ApplicationContext application: Application) : Context {
        return application
    }

    @Provides
    @Reusable
    internal fun provideBaseIdleResource(): BaseIdleListener = BaseIdleResource
}