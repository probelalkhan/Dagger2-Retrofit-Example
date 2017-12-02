package net.simplifiedlearning.retrofitexample;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Belal on 12/2/2017.
 */


@Module
class AppModule {
    private Application mApplication;

    AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}