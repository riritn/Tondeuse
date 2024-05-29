package org.mowerItNow;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MowerTest {

    @Test
    public void positionToShow() {
        Mower mower = createMower(5,5,'N');
        Assert.assertEquals("5 5 N", mower.positionToShow());
    }

    @Test
    public void moveToAdvance() {
        Mower mower = createMower(5,5,'N');
        mower.move('A',SurfaceToMow.builder().width(6).height(6).build());
        Assert.assertEquals("5 6 N", mower.positionToShow());

    }
    @Test
    public void moveToTurnRignt() {
        Mower mower = createMower(1,3,'N');
        mower.move('D',SurfaceToMow.builder().width(6).height(6).build());
        Assert.assertEquals("1 3 E", mower.positionToShow());
    }
    @Test
    public void moveToTurnLeft() {
        Mower mower = createMower(5,5,'N');
        mower.move('G',SurfaceToMow.builder().width(6).height(6).build());
        Assert.assertEquals("5 5 W", mower.positionToShow());
    }

    private Mower createMower(int x, int y, char orientation) {
        Position mowerPosition = Position.builder().orientation(orientation).x(x).y(y).build();
        return Mower.builder().position(mowerPosition).build();
    }
}