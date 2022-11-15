package com.discoverita.hiltexperiment.service.foreign;


public class ForeignServiceImpl implements ForeignServiceInterface {

    // No inject constructor available, its foreign class.

    @Override
    public void execute() {
        System.out.println("ForeignServiceImpl.execute !!!!!!!");
    }
}
