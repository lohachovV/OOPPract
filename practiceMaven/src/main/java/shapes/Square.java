package shapes;

import lombok.Data;


@Data
public class Square extends Figures{
    private double sideLength;

    public Square (double sideLength){
        this.sideLength = sideLength;
        squareArea();

    }

    private void squareArea (){
        setArea(sideLength * sideLength);
    }


}
