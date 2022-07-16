package org.demoProject.receiver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     
        int fact = 1; 
        for(int i = 1; i <= 5; i++) {
        	fact = fact * i; 
        }
        System.out.println("Factorial of 5 is =" + fact);
    }
}
