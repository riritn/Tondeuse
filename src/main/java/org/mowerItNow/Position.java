package org.mowerItNow;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Position {
    private int x;
    private int y;
    private char orientation;

}
