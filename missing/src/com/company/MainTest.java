package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class MainTest {

    @Test
    public void MainInstansiatesCorrectly_True(){
        Main testMain=new Main();
        assertTrue(testMain instanceof  Main);
    }
}