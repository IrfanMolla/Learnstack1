package com.irfanmolla.learnstack;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.ImageRequest;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    HorizontalScrollView hsv,hsv2,hsv3,hsv4;

    String enroll="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/enroll.png?alt=media&token=0e63da62-8aae-46e8-aa77-1b4a1c46d0e1";
    String complete="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/CompleteCourse.png?alt=media&token=2c53b7df-9498-41a5-a73f-2998762597c9";
    String certificate="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/Certificate.png?alt=media&token=069c8e37-7db5-4d9d-b637-2bbafd82abd6";
    String job="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/job.png?alt=media&token=6dd89b3d-d082-41c4-86f2-54ef8ab076bd";
    String accessibility="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/accessibility.png?alt=media&token=11f6ed83-5b4a-4fc9-9f18-f27e03ae9614";
    String affordability="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/affordability.png?alt=media&token=3eba9660-ceaa-4d09-8055-43b093922bb7";
    String handson="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/hands-on.png?alt=media&token=48419249-c64e-4a79-ba33-b4027e98be8c";
    String mentor="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/mentor.png?alt=media&token=2d953d9d-e0bf-4e65-b9b8-58e8b3e0a722";
    String customer="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/customer.png?alt=media&token=37fa9321-bcff-49f1-84b4-737b089f3adc";
    String certified="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/certified.png?alt=media&token=28b9f5dc-9cfb-4028-8b7d-fc0ad404a956";
    String study="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/studymaterial.png?alt=media&token=7b425914-3bbf-40cb-bc48-72e0ed0a912a";
    String Java="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/icon46.png?alt=media&token=bbd23f93-1689-47ff-a19e-12a2c4c2d983";
    String Python="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/icon47.png?alt=media&token=df56fb7f-1ad0-452b-9b97-875183ee6e5b";
    String Web="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/icon48.png?alt=media&token=479d3a70-aa93-42b8-ba4a-fe0f7a8095cf";
    String Hacking="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/icon49.png?alt=media&token=6a400cc7-6dc3-4513-a9a4-1b966fcb1f55";
    String Android="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/icon50.png?alt=media&token=3e8b2cf5-0793-4712-afcf-b456b34393ce";
    String Bigdata="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/bigdata.png?alt=media&token=4b2bacfb-3d43-4a88-b2e1-9b8f94eb8ba8";
    String IoT="https://firebasestorage.googleapis.com/v0/b/host-8d878.appspot.com/o/iot.png?alt=media&token=72dccde0-30fe-413b-863a-36d6780c6795";


    ImageReguest imgrqst1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        hsv=(HorizontalScrollView)findViewById(R.id.hsv);
        hsv2=(HorizontalScrollView)findViewById(R.id.hsv2);
        hsv3=(HorizontalScrollView)findViewById(R.id.hsv3);
        hsv4=(HorizontalScrollView)findViewById(R.id.hsv4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        hsv.setHorizontalScrollBarEnabled(false);
        hsv2.setHorizontalScrollBarEnabled(false);
        hsv3.setHorizontalScrollBarEnabled(false);
        hsv4.setHorizontalScrollBarEnabled(false);


        final ImageView home,Enroll,Complete,Certificate,Job,Accessibility,Affordability,Handson,Mentor,Customer,Certified,Study,Job2,android,web,python,java,hacking,bigdata,iot;


        setSupportActionBar(toolbar);



        Enroll=(ImageView)findViewById(R.id.enroll);
        Complete=(ImageView)findViewById(R.id.complete);
        Certificate=(ImageView)findViewById(R.id.certificate);
        Job=(ImageView)findViewById(R.id.job);


        Accessibility=(ImageView)findViewById(R.id.accessibility);
        Affordability=(ImageView)findViewById(R.id.affordability);
        Handson=(ImageView)findViewById(R.id.handson);
        Mentor=(ImageView)findViewById(R.id.mentor);
        Customer=(ImageView)findViewById(R.id.customer);
        Certified=(ImageView)findViewById(R.id.certified);
        Study=(ImageView)findViewById(R.id.study);
        Job2=(ImageView)findViewById(R.id.job2);


        android=(ImageView)findViewById(R.id.android);
        web=(ImageView)findViewById(R.id.web);
        python=(ImageView)findViewById(R.id.python);
        java=(ImageView)findViewById(R.id.java);
        hacking=(ImageView)findViewById(R.id.hacking);
        bigdata=(ImageView)findViewById(R.id.bigdata);
        iot=(ImageView)findViewById(R.id.iot);



//Our Courses
        imgrqst1=new ImageReguest(android,Android,Home.this);
        imgrqst1=new ImageReguest(python,Python,Home.this);
        imgrqst1=new ImageReguest(web,Web,Home.this);
        imgrqst1=new ImageReguest(java,Java,Home.this);
        imgrqst1=new ImageReguest(hacking,Hacking,Home.this);
        imgrqst1=new ImageReguest(bigdata,Bigdata,Home.this);
        imgrqst1=new ImageReguest(iot,IoT,Home.this);

//How does it work?

        imgrqst1=new ImageReguest(Enroll,enroll,Home.this);
        imgrqst1=new ImageReguest(Complete,complete,Home.this);
        imgrqst1=new ImageReguest(Certificate,certificate,Home.this);
        imgrqst1=new ImageReguest(Job,job,Home.this);


//Features
        imgrqst1=new ImageReguest(Accessibility,accessibility,Home.this);
        imgrqst1=new ImageReguest(Affordability,affordability,Home.this);
        imgrqst1=new ImageReguest(Handson,handson,Home.this);
        imgrqst1=new ImageReguest(Mentor,mentor,Home.this);
        imgrqst1=new ImageReguest(Customer,customer,Home.this);
        imgrqst1=new ImageReguest(Certified,certified,Home.this);
        imgrqst1=new ImageReguest(Study,study,Home.this);
        imgrqst1=new ImageReguest(Job2,job,Home.this);











      /*  ImageRequest imgrequest=new ImageRequest(enroll, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                Enroll.setImageBitmap(response);

            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Home.this,"Something went wrong",Toast.LENGTH_LONG).show();

            }
        });
        Mysingleton.getInstance(Home.this).addToRequestQueue(imgrequest);*/





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

   /*     if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
