package org.mowerItNow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MowerPilot {
    public List<Mower> drive(String path){
        List<Mower> mowerList = new ArrayList<Mower>();
        try {
            Scanner scanner = null;
            scanner = new Scanner(new File(path));
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            SurfaceToMow surface = new SurfaceToMow(width, height);
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                int positionX = scanner.nextInt();
                int positionY = scanner.nextInt();
                char orientation = scanner.next().charAt(0);
                scanner.nextLine();
                var position =  new Position(positionX, positionY, orientation);
                Mower mower = new Mower(position);
                String instructions = scanner.nextLine();
                for (char instruction : instructions.toCharArray()) {
                    mower.move(instruction, surface);
                }
                mowerList.add(mower);
            }
            scanner.close();
        }   catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return mowerList;
    }
}
