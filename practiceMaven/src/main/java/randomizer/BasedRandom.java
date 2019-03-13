package randomizer;

import shapes.*;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;


public class BasedRandom {

    public static ArrayList<Figures> getArrays(int count) {
        ArrayList<Figures> shape = new ArrayList();

        for (int i = 0 ; i<=count; i++){
            shape.add(getObjectByType(randoms()));
        }
        return shape;

    }


    private static String randoms() {
        SecureRandom random = new SecureRandom();
        String type = "";
            int a = random.nextInt(4);
            switch (a) {
                case 0:
                    type = "square";
                    break;
                case 1:
                    type = "triangle";
                    break;
                case 2:
                    type = "circle";
                    break;
                case 3:
                    type = "trapezoid";
                    break;
            }
        return type;

    }

    private static Figures getObjectByType(String type){
        Figures model = null;
        if (type.equals("circle")){
            model = new Circle("Circle", "Red",3);
        } if (type.equals("square")) {
            model = new Square("Square", "Blue", 5);
        }if (type.equals("triangle")) {
            model = new Triangle("Triangle", "Yellow", 5, 3);
        }if (type.equals("trapezoid")) {
            model = new Trapezoid("Trapezoid", "Green", 5, 3, 2);
        }
        return model;
    }
}
