package com.irfanmolla.learnstack;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;

/**
 * Created by user on 1/25/2018.
 */

public class ImageReguest {

    public ImageReguest(final ImageView img, final String url, final Context context){
            ImageRequest imgrequest=new ImageRequest(url, new Response.Listener<Bitmap>() {
                @Override
                public void onResponse(Bitmap response) {
                    img.setImageBitmap(response);

                }
            }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    ImageReguest i=new ImageReguest(img,url,context);

                }
            });
            Mysingleton.getInstance(context).addToRequestQueue(imgrequest);

    }


}
