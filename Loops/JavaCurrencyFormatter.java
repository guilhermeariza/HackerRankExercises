package Loops;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedStringUs = us.format(payment);

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String formattedStringIndia = formatter.format(payment);
         
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String formattedStringChina = china.format(payment);

        
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String formattedStringFrance = france.format(payment);
        
        
        System.out.println("US: " + formattedStringUs);
        System.out.println("India: " + formattedStringIndia);
        System.out.println("China: " + formattedStringChina);
        System.out.println("France: " + formattedStringFrance);
    }
}
