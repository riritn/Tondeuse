package org.mowerItNow;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Position {
    private int x;
    private int y;
    private char orientation;

}
