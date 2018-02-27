package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by James Henderson on 2/26/18.
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<com.udacity.gradle.builditbigger.MainActivity> mainActivityActivityTestRule = new ActivityTestRule<com.udacity.gradle.builditbigger.MainActivity>(com.udacity.gradle.builditbigger.MainActivity.class);

    @Test
    public void testVerifyReturnOfNonEmptyString() {
        com.udacity.gradle.builditbigger.EndpointsAsyncTask endpointsAsyncTask = new com.udacity.gradle.builditbigger.EndpointsAsyncTask(null);
        endpointsAsyncTask.execute();

        String result = null;
        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(result);
    }
}