package com.discoverita.hiltexperiment;

import javax.inject.Inject;

public class ServiceImpl implements ServiceInterface {

    @Inject
    public ServiceImpl() {
    }

    @Override
    public void execute() {
        System.out.println("ServiceImpl.execute !!!!!!!!");
    }
}
