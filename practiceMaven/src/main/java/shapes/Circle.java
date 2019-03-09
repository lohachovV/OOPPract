package shapes;

import lombok.Data;


@Data
public class Circle extends Figures {

    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public void circleArea (){
        setArea(Math.pow(radius, 2) * Math.PI);
    }




}
