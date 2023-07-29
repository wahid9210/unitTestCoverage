package com.cognizant.springbootwebRequestParameterDemo;

import com.wahid.UnitTestCoverageExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUnitTestCoverageExample {
    UnitTestCoverageExample ut=new UnitTestCoverageExample();
    @Test
    public void testName()
    {

        Assertions.assertEquals("Hello Mr/Mrs Wahid",ut.getMessage("Wahid"));
    }
    @Test
    public void emptyCheck()
    {
        Assertions.assertEquals("Wahid Wahid Empty Empty",ut.getMessage(""));
    }
    @Test
    public void nullCheck()
    {
        Assertions.assertEquals("Wahid Wahid Empty Empty",ut.getMessage(null));
    }



}
