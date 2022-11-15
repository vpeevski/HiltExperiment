package com.discoverita.hiltexperiment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.discoverita.hiltexperiment.service.foreign.ForeignServiceInterface;
import com.discoverita.hiltexperiment.service.own.OwnServiceInterface;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    OwnServiceInterface service;

    @Inject
    ForeignServiceInterface foreignService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        service.execute();
        foreignService.execute();
    }
}