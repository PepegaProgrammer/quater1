package JavaBro;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
       Year();
       WOW();

    }
    static void OMG () {
    int a,b,c,d;
    float r;
    a=10;
    b=20;
    c=30;
    d=40;
    r=a*(b+(c/d));
        System.out.println("r = "+r);
}
    static void WOW() {
        Scanner Vasya = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = Vasya.nextInt();
        System.out.println("Введите второе число");
        int y = Vasya.nextInt();
        if (x+y<21&&x+y>9) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Pepega(){
        Scanner Oleg = new Scanner(System.in);
        System.out.println("Введите число ");
        int x = Oleg.nextInt();
        if (x>-1) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");

        }
    }
    static void Hello(){
        Scanner Igor = new Scanner(System.in);
        System.out.println("Введите строку");
        String L = Igor.nextLine();
        System.out.println("Привет, "+ L);
    }
    static void  Year(){
        int y =16;
        if ((y%4==0)&&(y%100!=0)||(y%400==0)) {
            System.out.println("Год Високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }
}


