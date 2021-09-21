package com.androideatit;

import static org.junit.Assert.*;

import android.os.Handler;
import android.os.Looper;


import com.androideatit.Model.User;

import org.junit.Test;

public class UserTest {
    @Test
    public void TestingPhone(){
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                User user = new User();
                assertEquals("01521436145",user.getPhoneNumber("01521436145"));

            }
        });
    }
}