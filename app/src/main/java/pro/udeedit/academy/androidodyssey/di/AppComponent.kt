package pro.udeedit.academy.androidodyssey.di

import dagger.Component
import pro.udeedit.academy.androidodyssey.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

}
