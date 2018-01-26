package com.irfanmolla.learnstack;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by user on 1/25/2018.
 */

public class Mysingleton {
    private static Mysingleton mInstance;
    private RequestQueue rq;
    private static Context mctx;



    private Mysingleton(Context context){
        mctx=context;
        rq=getRequestQueue();
    }

    public RequestQueue getRequestQueue(){
        if(rq==null){
            rq= Volley.newRequestQueue(mctx.getApplicationContext());
        }
        return rq;
    }

    public static synchronized Mysingleton getInstance(Context context){
        if(mInstance==null){
            mInstance=new Mysingleton(context);
        }
        return mInstance;
    }

    public<T> void addToRequestQueue(Request<T> request){
        rq.add(request);
    }

}
