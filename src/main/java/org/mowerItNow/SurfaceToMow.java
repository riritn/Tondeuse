package org.mowerItNow;

public class SurfaceToMow {
    private int width;
    private int height;

    public SurfaceToMow(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean isValidPosition(int x, int y) {
        return x >= 0 && y >= 0 && x <= width  && y <= height;
    }
}
