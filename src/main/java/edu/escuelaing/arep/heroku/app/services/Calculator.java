package edu.escuelaing.arep.heroku.app.services;

import edu.escuelaing.arep.heroku.app.model.LinkedElement;
import edu.escuelaing.arep.heroku.app.model.LinkedList;

/**
 * Class to get a certain stadistic information from a set of data
 * @author Alan Marin
 *
 */
public class Calculator {

    /**
     * Get the mean from a set of data
     * @param dataSet - set of real numbers
     * @return double
     */
    public double mean(LinkedList dataSet){
        int n=0;
        double sumX = 0;
        LinkedElement element = dataSet.getHead();
        while (element!=null){
            sumX += element.getValue();
            element = element.getNext();
            n +=1;
        }

        return sumX/n;
    }

    /**
     * Get the standar deviation from a set of data
     * @param dataset - set of real numbers
     * @return double
     *
     */
    public double standarDeviation(LinkedList dataset){
        double mean = mean(dataset);
        int n=0;
        double sumX = 0;
        LinkedElement element = dataset.getHead();
        while (element!=null){
            try {
                sumX += Math.pow((element.getValue() - mean),2);
                n +=1;
                element = element.getNext();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return Math.sqrt(sumX/(n-1));
    }

}
