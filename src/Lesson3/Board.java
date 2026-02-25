package Lesson3;

public class Board {
    //Instance Variable / data member / instance fields / attributes
    private double l; //Length
    private double w; //Width
    private String color; //Color

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public Board() {
//        this.l = 0.0;
//        this.w = 0.0;
//        this.color = null;
        System.out.println("Default Constructor ");
        this(103.82, 29.65, "White");
    }

    public Board(double length, double width, String color) {
        l = length;
        w = width;
        //Left is data field, right is parameter/argument
        this.color = color;
    }

    public Board(double length, double width) {
        l = length;
        w = width;
        this(length, width, "red");
    }

    //Adding behavior
    public void display() {
        System.out.println("Length = " + l + "\n" + "Width = " + w + "\n" + "Color = " + color + "\n");
    }

    public double area() {
        return this.l * this.w;
    }

    public double peremeter() {
        return (this.l + this.w) * 2;
    }

}
