package Uloha_3;

public class Sinus {

     void priebeh(long input, int duty_cycle, int sample){

        boolean flipflop = true;
        int wave = 0;
        int step = 0;
        int duty = 0;
        int analogOut;

        for (int i= 0; i < 80; i++) {

            if (flipflop) {
                wave++;
                duty = duty + (100 / sample);

                analogOut = Math.min(duty, duty_cycle);

                if (wave == sample) {
                    flipflop = false;
                }
            } else {
                wave--;
                duty = duty - (100 / sample);

                analogOut = Math.min(duty_cycle, duty);

                if (wave == 0) {
                    flipflop = true;
                }
            }

            System.out.println(analogOut + "%......." + ++step + "step");

            try {
                Thread.sleep(input);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
