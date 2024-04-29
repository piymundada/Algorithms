import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source1",
// otherwise solution won't be accepted
class Source1111 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here.*/
        /*Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        rectangle.setLength(5);
        rectangle.areaOfRectangle();*/
    }
}

class Rectangle111{
    private double length;
    private double width;

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return this.length;
    }

    public void areaOfRectangle(){
        double area = this.width * this.length;
        double perimeter = 2*this.width + 2*this.length;
        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimeter);
    }
}