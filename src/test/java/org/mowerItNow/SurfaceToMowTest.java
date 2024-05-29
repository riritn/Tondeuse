package org.mowerItNow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SurfaceToMowTest {

    @Test
    public void isValidPosition() {
        var surface = new SurfaceToMow(7,7);
        Assert.assertTrue(surface.isValidPosition(0,3));
    }
    @Test
    public void isNotValidPosition() {
        var surface = new SurfaceToMow(7,7);
        Assert.assertFalse(surface.isValidPosition(0,8));
    }
}