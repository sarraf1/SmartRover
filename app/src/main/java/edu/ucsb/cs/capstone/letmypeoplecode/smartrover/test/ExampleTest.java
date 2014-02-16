package edu.ucsb.cs.capstone.letmypeoplecode.smartrover.test;

import android.test.InstrumentationTestCase;

/**
 * Created by Chris on 2/16/14.
 */
public class ExampleTest extends InstrumentationTestCase {
    public void test() throws Exception{
        final int expected=1;
        final int reality=5;
        assertEquals("OH SHIT 1 IS NOT 5",expected,reality);
    }
}
