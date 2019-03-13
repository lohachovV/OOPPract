package shapes;

import lombok.Data;

import java.text.DecimalFormat;


@Data
public abstract class Figures {
    private String type;
    private String color;
    private double area;


    public double round (double forRound){
        DecimalFormat dF = new DecimalFormat("#.##");
        forRound = Double.valueOf(dF.format(forRound));
        return forRound;
    }

}
