package com.github.kewang;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testIsEmpty() {
        Assert.assertTrue(StringUtils.isEmpty(""));
        Assert.assertTrue(StringUtils.isEmpty(null));
        Assert.assertFalse(StringUtils.isEmpty("Hello World"));
    }
}
