package com.discoverita.hiltexperiment.service.own;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class OwnServiceProviderModule {

    @Binds
    abstract OwnServiceInterface bindService(OwnServiceImpl service);

}
