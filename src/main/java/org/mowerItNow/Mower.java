package org.mowerItNow;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class Mower {
    private Position position;

    public Mower(Position position) {
        this.position = position;
    }

    public String positionToShow() {
        return position.getX() + " " + position.getY() + " " + position.getOrientation();
    }
    public void move(char instruction, SurfaceToMow surface) {
        switch (instruction) {
            case 'A' -> advance(surface);
            case 'D' -> goRight();
            case 'G' -> goLeft();
            default -> {
            }        }
    }

    private void goRight() {
        switch (position.getOrientation()) {
            case 'N'-> position.setOrientation('E');
            case 'E'-> position.setOrientation('S');
            case 'S'-> position.setOrientation('W');
            case 'W'-> position.setOrientation('N');
            default ->{
            }
        }
    }

    private void goLeft() {
        switch (position.getOrientation()) {
            case 'N'-> position.setOrientation('W');
            case 'E'-> position.setOrientation('N');
            case 'S'-> position.setOrientation('E');
            case 'W'-> position.setOrientation('S');
            default->{
            }
        }
    }
    private void advance(SurfaceToMow surface) {
        switch (position.getOrientation()) {
            case 'N' -> {
                if (surface.isValidPosition(position.getX(), position.getY() + 1)) position.setY(position.getY()+1);
            }
            case 'E' -> {
                if (surface.isValidPosition(position.getX() + 1, position.getY())) position.setX(position.getX()+1);
            }
            case 'S' -> {
                if (surface.isValidPosition(position.getX(), position.getY() - 1)) position.setY(position.getY()-1);
            }
            case 'W' -> {
                if (surface.isValidPosition(position.getX() - 1, position.getY())) position.setX(position.getX()-1);
            }
            default -> {
            }
        }
    }

}
