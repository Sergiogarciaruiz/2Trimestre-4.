package pkg2trimestre.pkg4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fracción fr = new Fracción(5, 10, 8);
        double num;
        System.out.println("Introduce el número con el que operar");
        num = sc.nextDouble();
        System.out.println(fr.toString());
        System.out.println(fr.multiplicacion());
    }

}
