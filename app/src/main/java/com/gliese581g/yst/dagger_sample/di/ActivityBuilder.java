package com.gliese581g.yst.dagger_sample.di;

import com.gliese581g.yst.dagger_sample.MainActivity;
import com.gliese581g.yst.dagger_sample.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by yoshitoiwaisako on 2018/01/15.
 * ActivityBuilder
 */

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindmainActivity();

}
