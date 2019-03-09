package shapes;

import lombok.Data;


@Data
public class Square extends Figures{
    private double sideLength;

    public Square (String type, String color, double sideLength){
        setType(type);
        setColor(color);
        this.sideLength = sideLength;
        squareArea();

    }

    private void squareArea (){
        setArea(sideLength * sideLength);
    }

    @Override
    public String toString () {
        return "type: " + getType() + ", color: " + getColor() + ", area of " + getType() + ": " + getArea() +
                ", length o side: " + sideLength;
    }

}
