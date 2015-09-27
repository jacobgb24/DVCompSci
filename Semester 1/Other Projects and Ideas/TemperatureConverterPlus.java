/**
 *
 * Created by Armdev
 */

import java.util.Scanner;

public class TemperatureConverterPlus {

    public static void main(String[] args){

        MainWorker mainWorker = new MainWorker();
        mainWorker.DoWork();

    }
}

enum TempChoice {
    Other,
    Celsius,
    Fahrenheit,
    Kelvin
}

class TempVals {
    double Cel;
    double Far;
    double Kel;
}

class MainWorker {

    final String DEGREE = "\u00b0";


    public  void DoWork () {


        System.out.println("Welcome to Temperature Converter v1.0");

        do {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            TempChoice tempChoice = chooseTemp();
            if (tempChoice == TempChoice.Other) continue;


            Scanner keyboard;
            double degrees = 0.0;

            while (true) {
                try {
                    keyboard = new Scanner(System.in);
                    System.out.println("Enter degrees in " + tempChoice.name() + ":");
                    degrees = keyboard.nextDouble();
                    break;

                } catch (Exception ex) {
                    System.out.println("Please enter a valid number");
                }
            }


            TempVals tempVals = null;

            switch (tempChoice) {
                case Celsius: tempVals = convertC(degrees); break;
                case Fahrenheit: tempVals = convertF(degrees); break;
                case Kelvin: tempVals = convertK(degrees); break;
            }



            System.out.println("Temperature in Fahrenheit: " + String.valueOf(tempVals.Far) + DEGREE + "F");
            System.out.println("Temperature in Celsius:    " + String.valueOf(tempVals.Cel) + DEGREE + "C");
            System.out.println("Temperature in Kelvin:     " + String.valueOf(tempVals.Kel) + "K");


            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to make another conversion? (Y/N)");

            String a = scan.next().toLowerCase();
            if (a.startsWith ("y")) {
                continue;
            } else if (a.startsWith ("n")) {
                break;
            } else {
                System.out.println("Please choose either Y or N ...");
            }

        } while (true);

        System.out.println("Byyyyyyyeeeeeeeee!!!!!!!!!!");
    }

    public TempChoice chooseTemp() {


        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Press F for F-> C and K");
        System.out.println("Press C for C-> F and K");
        System.out.println("Press K for K-> F and C");

        try {
            String a = scan.next().toLowerCase();

            if (a.startsWith("f")) {
                return TempChoice.Fahrenheit;

            } else if (a.startsWith("c")) {
                return TempChoice.Celsius;

            } else if (a.startsWith("k")) {
                return TempChoice.Kelvin;

            } else {
                System.out.println("Please choose either F, C, or K ...");
            }
        } catch (Exception ex) {
            // break;
        }


        return TempChoice.Other;
    }

    public  TempVals convertF(double degrees) {

        TempVals retVals = new TempVals();

        retVals.Far = degrees;

        retVals.Cel = (retVals.Far - 32) * (5d / 9);
        retVals.Kel = (retVals.Far + 459.67) * (5d / 9);

        return retVals;
    }

    public TempVals convertC(double degrees) {

        TempVals retVals = new TempVals();

        retVals.Cel = degrees;

        retVals.Far = (retVals.Cel * 9d / 5) + 32;
        retVals.Kel = (retVals.Cel + 273.15);

        return retVals;
    }

    public TempVals convertK(double degrees) {

        TempVals retVals = new TempVals();

        retVals.Kel = degrees;

        retVals.Far = ((retVals.Kel - 273.15) * (9d / 5)) + 32;
        retVals.Cel = (retVals.Kel - 273.15);

        return retVals;
    }
}