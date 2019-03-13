package shapes;

import lombok.Data;


@Data
public class Circle extends Figures {

    private double radius;

    public Circle (String type, String color, double radius){
        setType(type);
        setColor(color);
        this.radius = radius;
        circleArea();
    }

    public void circleArea (){
        setArea(round(Math.pow(radius, 2) * Math.PI));
    }

    @Override
    public String toString () {
        return "type: " + getType() + ", color: " + getColor() + ", area of " + getType() + ": " + getArea() +
                ", radius: " + radius;
    }


}
