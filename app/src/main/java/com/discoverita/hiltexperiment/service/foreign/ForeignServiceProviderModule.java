package com.discoverita.hiltexperiment.service.foreign;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public class ForeignServiceProviderModule {

    // No dependencies - no parameters
    @Provides
    public static ForeignServiceInterface foreignService() {
        // Use builder, or whatever provided by library.
        return new ForeignServiceImpl();
    }
}
