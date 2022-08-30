package javaIntToString;


import java.io.*;
import java.util.*;

public class JavaIntToString {

	//https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
	
    public static void main(String[] args) {
        int n;
        String s;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        
        s = Integer.toString(n);
        
        if( s instanceof String ) {
            System.out.println("Good job");
        }
        
        
    }
}
