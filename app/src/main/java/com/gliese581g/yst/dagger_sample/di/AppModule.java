package com.gliese581g.yst.dagger_sample.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yoshitoiwaisako on 2018/01/15.
 * AppModule
 */
@Module
class AppModule {

    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application.getApplicationContext();
    }
}
