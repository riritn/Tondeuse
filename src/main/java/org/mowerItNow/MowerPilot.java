package org.mowerItNow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MowerPilot {
    void drive(){
        try {
            Scanner scanner = null;
            scanner = new Scanner(new File("input.txt"));
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            SurfaceToMow surface = new SurfaceToMow(width, height);

            List<Mower> mowers = new ArrayList<Mower>();

            while (scanner.hasNextLine()) {
                int mowerX = scanner.nextInt();
                int mowerY = scanner.nextInt();
                char mowerOrientation = scanner.next().charAt(0);
                scanner.nextLine(); // Consommer la nouvelle ligne
                var position =  new Position(mowerX, mowerY, mowerOrientation);
                Mower mower = new Mower(position);

                String instructions = scanner.nextLine();

                for (char instruction : instructions.toCharArray()) {
                    mower.move(instruction, surface);
                }

                mowers.add(mower);
            }

            for (Mower mower : mowers) {
                System.out.println(mower.positionToShow());
            }

            scanner.close();
        }   catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

}
