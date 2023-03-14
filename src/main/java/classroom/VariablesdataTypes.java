package classroom;

import java.util.Arrays;

public class VariablesdataTypes {
    public static void main(String[] args) {

        // byte data type
        byte myCurrentAge = 16;
        System.out.println(myCurrentAge);

        //short data type
        short salary = 1000;
        System.out.println(salary);

        //chart data type
        char firstNameLetter = 'S';
        System.out.println(firstNameLetter);

        //int data type
        int dateOfBirth = 80307;
        System.out.println(dateOfBirth);

        //long data type
        long populationOfLatvia = 1880200;
        System.out.println(populationOfLatvia);

        //float data type
        float lapTime = 34.39F;
        System.out.println(lapTime);

        //double data type
        double weight = 54;
        System.out.println(weight);

        //boolean data type is; has;
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;

        //String data type
        String name = "Stas";
        String surName = "Prokofjev";

        //Concatinations
        String fullName = name + " " + surName;
        System.out.println(fullName);
        String FyllNameWithAge = fullName + myCurrentAge;
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        //*
        int a = 30;
        int b = 5;
        int c = a * b;
        System.out.println(c);

        // / division
        c = a / b;
        System.out.println(c);

        // + plus
        c = a + b;
        System.out.println(c);

        // - minus
        c = a - b;
        System.out.println(c);

        //%
        int number = 10 % 9;
        System.out.println(number);
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

    }
}
