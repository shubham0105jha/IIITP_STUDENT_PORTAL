package com.example.shubham.myapplication_1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void Launchtabs(View view){

        String url = "http://61.0.174.126:8090/SignUp";

        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();

        builder.setToolbarColor(RED);

        builder.setStartAnimations(this, android.R.anim.slide_out_right, android.R.anim.slide_in_left);
        builder.setExitAnimations(this, android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        builder.setShowTitle(true);

        Bitmap backButton = BitmapFactory.decodeResource(getResources(), R.drawable.ic_back);
        builder.setCloseButtonIcon(backButton);

        builder.build().launchUrl( this, Uri.parse("http://61.0.174.126:8090/SignUp"));

    }
}
