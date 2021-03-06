package com.hacknife.example.engine;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.hacknife.iplayer.interfaces.ImageLoader;

/**
 * Created by Hacknife on 2018/11/24.
 */

public class CoverLoader implements ImageLoader {
    @Override
    public void onLoadCover(ImageView cover, Object coverUrl) {
        Glide.with(cover).load(coverUrl).into(cover);
    }
}
