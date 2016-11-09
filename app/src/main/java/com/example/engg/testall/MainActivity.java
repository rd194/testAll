package com.example.engg.testall;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // AdView testView= new AdView(this);

        MobileAds.initialize(this,"ca-app-pub-6351219133905478~8297127746");

        AdView bottomAd= (AdView) findViewById(R.id.adBottom);
        AdRequest adRequest=new AdRequest.Builder().build();
        bottomAd.loadAd(adRequest);
    }
}
