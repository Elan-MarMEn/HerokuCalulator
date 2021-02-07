package edu.escuelaing.arep.heroku.app;

import edu.escuelaing.arep.heroku.app.model.LinkedList;
import edu.escuelaing.arep.heroku.app.services.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void proxySizeTest(){
        LinkedList set = new LinkedList();
        set.add(160);
        set.add(591);
        set.add(114);
        set.add(229);
        set.add(230);
        set.add(270);
        set.add(128);
        set.add(1657);
        set.add(624);
        set.add(1503);
        Calculator calculator= new Calculator();
        Assert.assertEquals(550.6,calculator.mean(set),1);
        Assert.assertEquals(572.03,calculator.standarDeviation(set),1);

    }

    @Test
    public void developmentHoursTest(){
        LinkedList set = new LinkedList();
        set.add(15.0);
        set.add(69.9);
        set.add(6.5);
        set.add(22.4);
        set.add(28.4);
        set.add(65.9);
        set.add(19.4);
        set.add(198.7);
        set.add(38.8);
        set.add(138.2);
        Calculator calculator= new Calculator();
        Assert.assertEquals(60.32,calculator.mean(set),1);
        Assert.assertEquals(62.26,calculator.standarDeviation(set),1);
    }
}
