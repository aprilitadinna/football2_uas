package app.bola.kotlin.feature.base

import android.support.test.espresso.IdlingResource

interface BaseIdleListener {

    fun getIdlingResource(): IdlingResource

    fun increment()

    fun decrement()
}