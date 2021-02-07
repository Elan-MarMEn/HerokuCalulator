package edu.escuelaing.arep.heroku.app.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Class that store and get real numbers
 * @author Alan Marin
 *
 */
public class LinkedList implements Cloneable, Serializable {
    private LinkedElement head;
    private LinkedElement tail;
    private int size;


    public LinkedList(double number) {
        LinkedElement num = new LinkedElement(number);
        this.head = num;
        this.tail = num;
    }


    public LinkedList() {
    }

    /**
     * Adding a real number on the list
     * @param number
     *
     */
    public void add(double number){
        LinkedElement num = new LinkedElement(number);
        if (this.head == null) {
            this.head = num;
            this.tail = num;
        }else if (this.head == this.tail){
            this.head.setNext(num);
            num.setPrev(this.head);
            this.tail = num;
        }else {
            this.tail.setNext(num);
            num.setPrev(this.tail);
            this.tail = num;
        }
        size +=1;
    }

    /**
     * Remove and return the last number of the List
     * @return double
     *
     */
    public double pop() throws Exception {
        double temp=0;
        if (this.head == null){
            throw new Exception("Empty List");
        }else if (this.head == this.tail){
            temp = this.head.getValue();
            this.head = null;
            this.tail = null;

        }else {
            temp = this.tail.getValue();
            this.tail.getPrev().setNext(null);
            this.tail = this.tail.getPrev();
        }
        return temp;
    }

    /**
     * Make a List empty
     *
     */
    public void clear() {
        this.head = null;
        this.tail= null;
    }


    /**
     * Report the state of the list
     * @return  boolean
     *
     */
    public boolean isEmpty() {
        if (this.head == null){
            return true;
        }
        return false;
    }

    public LinkedElement getHead() {
        return head;
    }

    public LinkedElement getTail() {
        return tail;
    }


    public int size() {
        return this.size;
    }

    public String toString(){
        StringBuilder list = new StringBuilder("");
        LinkedElement element = this.head;
        while (element!=null){
            list.append(element.getValue());
            element = element.getNext();
                list.append(",");

        }
        return list.toString();
    }

}
