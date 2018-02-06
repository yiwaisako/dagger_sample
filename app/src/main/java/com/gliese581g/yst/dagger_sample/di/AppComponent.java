package com.gliese581g.yst.dagger_sample.di;

import android.app.Application;

import com.gliese581g.yst.dagger_sample.MainApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by yoshitoiwaisako on 2017/12/27.
 * AppComponent
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(MainApplication application);
}
