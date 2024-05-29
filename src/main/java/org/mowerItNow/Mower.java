package org.mowerItNow;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mower {
    private Position position;

    public Mower(Position position) {
        this.position = position;
    }
    public String positionToShow() {
       return null;
    }
    public void move(char instruction, SurfaceToMow surface) {

    }


    private void turnRight() {

    }

    private void turnLeft() {

    }
    private void advance(SurfaceToMow surface) {

    }

}
