package com.udacityproject.projectgradle;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private String joke;
    private CountDownLatch latch;
    private Context appContext;
    @Before
    public void setUpTest(){
        latch = new CountDownLatch(1);
        appContext = InstrumentationRegistry.getTargetContext();

        new EndpointsAsyncTask().execute(appContext);

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(){

            @Override
            protected void onPostExecute(String result) {
                joke = result;
                latch.countDown();
            }
        };

        endpointsAsyncTask.execute(appContext);

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testShouldPassTheseAsserts(){
        setUpTest();
        assertEquals("The four most beautiful words in our common language: I told you so.", joke);
        assertNotNull(joke);
    }

}