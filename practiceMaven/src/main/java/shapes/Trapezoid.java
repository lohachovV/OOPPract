package shapes;

import lombok.Data;


@Data
public class Trapezoid extends Figures{

    private double lengthA;
    private double lengthB;
    private double height;

    public Trapezoid (String type, String color, double lengthA, double lengthB, double height){
        setType(type);
        setColor(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.height = height;
        trapezoidArea();
    }


    public void trapezoidArea(){
        setArea(round(((lengthA + lengthB) * height) / 2));
    }

    @Override
    public String toString () {
        return "type: " + getType() + ", color: " + getColor() + ", area of " + getType() + ": " + getArea() +
                ", length of down side:  " + lengthA + ", length of upper side:  " + lengthB + ", heigh: " + height;
    }

}
