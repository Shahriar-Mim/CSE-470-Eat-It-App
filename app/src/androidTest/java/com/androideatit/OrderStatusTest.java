package com.androideatit;
import org.junit.Test;

import static org.junit.Assert.*;

import android.os.Handler;
import android.os.Looper;

import com.androideatit.Controller.OrderStatus;



public class OrderStatusTest {
    @Test
    public void myTest(){

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                OrderStatus os = new OrderStatus();
                assertEquals("Preparing",os.convertCodeToStatus("1"));

            }
        });



    }
}