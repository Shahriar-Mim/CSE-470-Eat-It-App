package com.androideatit;
import android.test.AndroidTestCase;
import android.test.RenamingDelegatingContext;

import com.androideatit.Model.Database;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DatabaseTest extends AndroidTestCase {
    private Database db;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        RenamingDelegatingContext context = new RenamingDelegatingContext(getContext(), "test_");
        db = new Database(context);
    }
  @Test
    public void testLaunch(){
        assertEquals(true,db.connectionStatusCheck(1234));
    }

    @After
    public void tearDown() throws Exception {
        db.close();
        super.tearDown();
    }

}