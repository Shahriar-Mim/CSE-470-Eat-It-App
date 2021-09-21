package com.androideatit;

import static org.junit.Assert.*;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import com.androideatit.Controller.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class Main_ActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity = null;
    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch(){
        View view = mActivity.findViewById(R.id.main);
        assertNotNull(view);
    }
    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}