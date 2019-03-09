package randomizer;

import shapes.*;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;


public class BasedRandom {
    private static SecureRandom random = new SecureRandom();

    public static List<Figures> getArrays(int count) {
        ArrayList<Figures> shape = new ArrayList();

        for (int i = 0 ; i<=count; i++){
            shape.add(getObjectByType(randoms()));
        }
        return shape;

    }


    private static String randoms() {
        String type = "";
            int a = random.nextInt(4);
            switch (a) {
                case 0:
                    type = "square";
                case 1:
                    type = "triangle";
                case 2:
                    type = "circle";
                case 3:
                    type = "trapezoid";
            }
        return type;
    }

    private static Figures getObjectByType(String type){
        Figures model = null;
        if (type.equals("circle")){
            model = new Circle(3);
        } if (type.equals("square")) {
            model = new Square(5);
        }if (type.equals("triangle")) {
            model = new Triangle(5, 3);
        }if (type.equals("trapezoid")) {
            model = new Trapezoid(5, 3, 2);
        }
        return model;
    }
}
