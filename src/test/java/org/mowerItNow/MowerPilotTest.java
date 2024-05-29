package org.mowerItNow;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MowerPilotTest {

    @Test
    public void drive() {
        MowerPilot p = new MowerPilot();
        List<Mower> mowers = p.drive("src/test/java/org/mowerItNow/instructions.txt");
        Assert.assertEquals("1 3 N",mowers.get(0).positionToShow());
        Assert.assertEquals("5 1 E",mowers.get(1).positionToShow());

    }
}