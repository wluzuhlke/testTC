package com.testTC;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

public class Fail {

    @Test
    @Ignore
    public void shouldFail() {
        fail();
    }
}
