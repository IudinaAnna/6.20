package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    static double circleArea(double radius) {
        double Pi = 3.1415926536;
        double area=0;
        area=Pi*Math.pow(radius,2);
        return area;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radius=input.nextDouble();
        System.out.println("Площадь окружности: "+circleArea(radius));
    }
}
