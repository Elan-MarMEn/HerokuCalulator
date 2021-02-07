package edu.escuelaing.arep.heroku.app.model;

/**
 * Class that link a number to another
 * @author Alan Marin
 *
 */
public class LinkedElement {
    private LinkedElement next = null;
    private LinkedElement prev = null ;
    private double value;

    public LinkedElement(LinkedElement next, LinkedElement prev, double value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public LinkedElement(double value) {
        this.value = value;
    }

    public LinkedElement getNext() {
        return next;
    }

    public void setNext(LinkedElement next) {
        this.next = next;
    }

    public LinkedElement getPrev() {
        return prev;
    }

    public void setPrev(LinkedElement prev) {
        this.prev = prev;
    }

    public double getValue() {
        return value;
    }
}
