package com.discoverita.hiltexperiment.service.own;

import javax.inject.Inject;

public class OwnServiceImpl implements OwnServiceInterface {

    @Inject
    public OwnServiceImpl() {
    }

    @Override
    public void execute() {
        System.out.println("OwnServiceImpl.execute !!!!!!!!");
    }
}
