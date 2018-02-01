package com.company;

import java.util.Scanner;

public class Uzduotis01 {

    public Uzduotis01() {
        System.out.println("Pirma uzduotis rodoma");
        System.out.println("Iveskite pirma skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 2 == 0) {
            System.out.println("Skaicius yra lyginis");
        }else {
            System.out.println("Skaicius nelyginis");
        }




    }
}
