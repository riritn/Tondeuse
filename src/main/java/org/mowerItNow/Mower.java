package org.mowerItNow;

public class Mower {
    private Position position;

    public void setPosition(Position position) {
        this.position = position;
    }
    public Position getPosition() {
        return position;
    }

    public Mower(Position position) {
        this.position = position;
    }
    public String positionToShow() {
        return position.getX() + " " + position.getY() + " " + position.getOrientation();
    }
    public void move(char instruction, SurfaceToMow surface) {
        switch (instruction) {
            case 'A' -> advance(surface);
            case 'D' -> turnRight();
            case 'G' -> turnLeft();
            default -> {
            }        }
    }


    private void turnRight() {
        switch (position.getOrientation()) {
            case 'N'-> position.setOrientation('E');
            case 'E'-> position.setOrientation('S');
            case 'S'-> position.setOrientation('W');
            case 'W'-> position.setOrientation('N');
            default ->{
            }
        }
    }

    private void turnLeft() {
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
