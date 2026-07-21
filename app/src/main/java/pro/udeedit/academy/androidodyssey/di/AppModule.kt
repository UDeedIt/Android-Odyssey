package pro.udeedit.academy.androidodyssey.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Application‑level Dagger module.
 */
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideGreetingService(): GreetingService = GreetingServiceImpl()
}

/**
 * Simple service used to verify Dagger wiring.
 */
interface GreetingService {
    fun greet(): String
}

/**
 * Default implementation of [GreetingService].
 */
class GreetingServiceImpl : GreetingService {
    override fun greet(): String = "Welcome aboard Android Odyssey!"
}
