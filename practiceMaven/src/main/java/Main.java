import randomizer.BasedRandom;
import shapes.Figures;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {



        ArrayList<Figures> model = BasedRandom.getArrays(10);
        Iterator <Figures> itr = model.iterator();
        while (itr.hasNext()){
            Figures el = itr.next();
            System.out.println(el);
        }


    }

}
