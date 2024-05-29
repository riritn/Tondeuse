package org.mowerItNow;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SurfaceToMow {
    private int width;
    private int height;

    public boolean isValidPosition(int x, int y) {
        return false;
    }
}
