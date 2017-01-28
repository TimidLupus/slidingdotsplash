package com.chabbal.slidingdotsplash;

import android.content.Context;
import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;



/**
 * Created by Johny on 11/01/2017.
 */

public class ImageViewPagerAdapter extends ViewPagerAdapter {

    private Context mContext;
    private OnItemClickListener mOnPagerItemClick;
    private OnSetImageListener mOnSetImageListener;
    private int mImageResources[];

    public ImageViewPagerAdapter(Context context,@NonNull OnSetImageListener onSetImageListener ) {
        mContext = context;
        mOnSetImageListener = onSetImageListener;
        mImageResources = new int[]{};
    }

    @Override
    public View getItem(final int position) {
        ImageView imageView = (ImageView)LayoutInflater.from(mContext).inflate(R.layout.item_view_pager_image,null);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mOnPagerItemClick != null){
                    mOnPagerItemClick.onPagerItemClick(v,position);
                }
            }
        });
        if(mOnSetImageListener != null){

            mOnSetImageListener.setImage(imageView,position);
        }
        else{

            imageView.setImageResource(mImageResources[position]);
        }
        return imageView;
    }


    @Override
    public int getCount() {
        return mImageResources.length;
    }

    public void setImageResources(@NonNull @ArrayRes @Size(min = 2) int[] imageResources){
        mImageResources = imageResources;
        notifyDataSetChanged();
    }

    public void setOnPagerItemClick(@NonNull OnItemClickListener onPagerItemClickListener){
        mOnPagerItemClick = onPagerItemClickListener;
    }
}
