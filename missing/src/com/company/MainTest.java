package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class MainTest {

    @Test
    public void MainInstansiatesCorrectly_True(){
        Main testMain=setupNewMain();
        assertTrue(testMain instanceof  Main);
    }

    private Main setupNewMain(){
        return new Main();
    }
}