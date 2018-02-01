package com.company;

import java.util.Scanner;

public class Main {

    public static final int EXIT_CODE = 0;
    public static final  int ACTION_1 = 1;

    public static void main(String[] args) {
	// write your code here

        Main objektas = new Main();
        objektas.vykdykProgramaBeGalo();

    }

    private void rodykPasirinkimus() {
        System.out.println("----------------------");
        System.out.println("Koki veiksma norit atlikti?");
        System.out.println(EXIT_CODE + " - Baigti darba");
        System.out.println(ACTION_1 + " - Pirma uzduotis. lyginio skaiciaus paieska");
        System.out.println("----------------------");
    }

    public  void vykdykProgramaBeGalo() {
        boolean arTesti = true;
        Scanner sc = new Scanner(System.in);
        while (arTesti == true) {
            rodykPasirinkimus();
            int veiksmas = sc.nextInt();
            switch (veiksmas) {
                case EXIT_CODE:
                    arTesti = false;
                    break;
                case ACTION_1:
                    new Uzduotis01();
                    break;
            }
        }
    }
}
