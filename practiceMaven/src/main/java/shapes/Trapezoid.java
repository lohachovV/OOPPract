package shapes;

import lombok.Data;


@Data
public class Trapezoid extends Figures{

    private double lengthA;
    private double lengthB;
    private double height;

    public Trapezoid (double lengthA, double lengthB, double height){
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.height = height;
        trapezoidArea();
    }



    public void trapezoidArea(){
        setArea(((lengthA + lengthB) * height) / 2);
    }


}
