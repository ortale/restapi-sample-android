package br.com.rodolfoortale.brighthr;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.isEmptyString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by rodolfoortale on 01/02/2018.
 */

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {
    @Test
    public void isValidPassword() throws Exception {
        String password = "1Asdfg";
        String patternPassword = "^(?=.*[0-9])(?=.*[A-Z]).{6,}$";

        assertTrue(password.matches(patternPassword));
    }
}
