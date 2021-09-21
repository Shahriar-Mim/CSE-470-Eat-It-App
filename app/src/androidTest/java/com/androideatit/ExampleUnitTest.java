package com.androideatit;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import android.os.Handler;
import android.os.Looper;

import com.androideatit.Controller.OrderStatus;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    OrderStatus os = null;

    @Test
    public void addition_isCorrect() {

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                os = new OrderStatus();
                assertEquals("Placed",os.convertCodeToStatus("0"));
            }
        });




    }
}