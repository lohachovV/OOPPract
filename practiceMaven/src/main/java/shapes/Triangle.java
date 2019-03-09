package shapes;

import lombok.Data;


@Data
public class Triangle extends Figures{
    private double lengthA;
    private double lengthB;
    private double hypotenuse;

    public Triangle (String type, String color, double lengthA, double lengthB){
        setType(type);
        setColor(color);
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

    @Override
    public String toString () {
        return "type: " + getType() + ", color: " + getColor() + ", area of " + getType() + ": " + getArea() +
                ", length of first side:  " + lengthA + ", length of second side:  " + lengthB + ", hipotenuse: " + hypotenuse;
    }

}
