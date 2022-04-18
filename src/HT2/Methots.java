package HT2;

import java.util.Scanner;

public class Methots {
    double a;
    double b;

    public Methots(double a, double b) {

        this.a = a;
        this.b = b;
    }
    public Methots (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        this.a = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        this.b = scanner.nextDouble();
    }

    public void add()throws IllegalArgumentException{

        if(a<0&b<0) {
            throw new IllegalArgumentException("Value is incorrect");
        } else  {System.out.println("Result add: "+(a+b));
            }


    }
    public void subtract() {
        try {

            if(a>0&b>0) {
                throw new MyException ("Value is incorrect");
            } else {System.out.println("Result subtract: "+(a-b));
            }
            }catch (MyException e){
            e.printStackTrace();
        }

    }
    public void multiply(){
        try {

            if(a==0 & b==0) {
                throw new IllegalAccessException("Value is incorrect");
            } else {System.out.println("Result multiply: "+(a*b));
            }
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
    public void divide()throws ArithmeticException{

            if(a==0&b!=0) {
                throw new ArithmeticException("Value is incorrect");
            } else {System.out.println("Result divide: "+(a/b));
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
