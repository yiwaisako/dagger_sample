package com.gliese581g.yst.dagger_sample;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;

import com.gliese581g.yst.dagger_sample.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasFragmentInjector;

/**
 * Created by yoshitoiwaisako on 2018/02/06.
 */

public class MainApplication extends Application implements HasActivityInjector, HasFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;
    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingFragmentInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().application(this).build().inject(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }

    @Override
    public DispatchingAndroidInjector<Fragment> fragmentInjector() {
        return dispatchingFragmentInjector;
    }
}
