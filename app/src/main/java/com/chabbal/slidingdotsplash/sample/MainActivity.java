package com.chabbal.slidingdotsplash.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chabbal.slidingdotsplash.ImageViewPagerAdapter;
import com.chabbal.slidingdotsplash.OnSetImageListener;
import com.chabbal.slidingdotsplash.SlidingSplashView;
import com.chabbal.slidingdotsplash.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity  {

    private int[] imageResources = new int[]{R.drawable.splash_test,R.drawable.splash_test};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SlidingSplashView splash = (SlidingSplashView) findViewById(R.id.splash);
//        splash.setImageResources(imageResources);
    }

}
