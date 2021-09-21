package com.androideatit;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import static org.junit.Assert.*;

import com.androideatit.Controller.Home;


import org.junit.Test;

public class HomeTest {
    @Test
    public void myTestHome(){

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                Menu menu = null;
                Home home = new Home();
                assertEquals(false,home.onCreateOptionsMenu(menu));
            }
        });



    }
}