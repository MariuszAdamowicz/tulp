package com.mariuszadamowicz.bee;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import com.mariuszadamowicz.tulp.Tulp;

public class BeeTest {
    @Test
    public void testAppHasAGreeting() {
        Bee classUnderTest = new Bee();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testCompiler() {
        String[] args = new String[2];
        args[0] = "compile";
        args[1] = "first.tulp";
        try {
            Tulp.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
