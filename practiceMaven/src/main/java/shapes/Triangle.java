package shapes;

import lombok.Data;


@Data
public class Triangle extends Figures{
    private double lengthA;
    private double lengthB;
    private double hypotenuse;

    public Triangle (double lengthA, double lengthB){
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        triangleArea();
        triangleHypotenuse();

    }

    private void triangleArea() {
        setArea(((lengthA * lengthB) / 2));
    }

    private void triangleHypotenuse (){
        this.hypotenuse = Math.sqrt((lengthA * lengthA) + (lengthB * lengthB));
    }

}
