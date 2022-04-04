package Uloha_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trieda {

    public float[] vysledok (){

        Scanner vstup = new Scanner(System.in);

        float sample = 10;
        float duty_cycle = 5;
        float input= 1;

        boolean again1 = true;
        boolean again2 = true;
        boolean again3 = true;


        while (again1) {
            try {
                System.out.println("Enter frequency MAX 0.01 - 100Hz");
                input = vstup.nextFloat();
                if (input < 101 && input > 0){
                    again1 = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Allowed are numbers from 0.01 to 100");
                vstup.next();
            }
        }

        while (again2) {
            try {
                System.out.println("Enter Duty_cycle MAX 0-100%");
                duty_cycle = vstup.nextFloat();
                if (duty_cycle > 0 && duty_cycle <101){
                    again2 = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Allowed are numbers from 0 to 100");
                vstup.next();
            }
        }

        while (again3){
            try {
                System.out.println("Enter sampling from 3 to 100");
                sample = vstup.nextFloat();
                if (sample > 3 && sample < 101){
                    again3 = false;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Allowed are numbers from 3 to 100");
                vstup.next();
            }
        }

        input = 1000/input;

        return new float[] {input, duty_cycle, sample};

    }

}

//OK