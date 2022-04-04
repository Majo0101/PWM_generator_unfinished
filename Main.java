package Uloha_3;

public class Main {

    public static void main(String[] args)  {

        Trieda obj1 = new Trieda();
        Sinus obj2 = new Sinus();

        float[] result = obj1.vysledok();

        long input = (long) result[0];
        int duty_cycle = (int) result[1];
        int sample = (int) result[2];

        obj2.priebeh(input, duty_cycle, sample);


    }

}

