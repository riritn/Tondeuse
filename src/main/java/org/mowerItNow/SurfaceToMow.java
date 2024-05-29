package org.mowerItNow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class SurfaceToMow {
    private int width;
    private int height;

    public boolean isValidPosition(int x, int y) {
        return x >= 0 && y >= 0 && x <= width  && y <= height;
    }
}
