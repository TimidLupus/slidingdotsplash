package com.chabbal.slidingdotsplash.sample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chabbal.slidingdotsplash.ImageViewPagerAdapter;
import com.chabbal.slidingdotsplash.OnSetImageListener;
import com.chabbal.slidingdotsplash.SlidingSplashView;
import com.chabbal.slidingdotsplash.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SlidingSplashView splashView  = (SlidingSplashView) findViewById(R.id.splash);
        splashView.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        Log.d("OnPageScrolled", String.valueOf(position));
    }

    @Override
    public void onPageSelected(int position) {
        Log.d("OnPageSelected", String.valueOf(position));

    }

    @Override
    public void onPageScrollStateChanged(int state) {
        Log.d("PageScrollStateChanged", String.valueOf(state));

    }
}
