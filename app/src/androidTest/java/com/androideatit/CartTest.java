package com.androideatit;

import static org.junit.Assert.*;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import com.androideatit.Controller.Cart;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class CartTest {
    @Rule
    public ActivityTestRule<Cart> cActivityTestRule = new ActivityTestRule<Cart>(Cart.class);
    private Cart cActivity = null;
    @Before
    public void setUp() throws Exception {
        cActivity = cActivityTestRule.getActivity();
    }
    @Test
    public void testLaunch(){
        View view = cActivity.findViewById(R.id.cart);
        assertNotNull(view);
    }
    @After
    public void tearDown() throws Exception {
        cActivity=null;
    }
}