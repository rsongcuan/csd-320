// Ryan Songcuan
// 10/31/21
// Module 2 Assignment
// The purpose of this assignment is to calculate the energy needed to heat water from an initial temperature to a final temperature
package module2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ryansongcuan
 */
import java.util.Scanner;

public class songcuan_module2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the weight of water in kilograms: ");
        double waterMass = input.nextDouble();
        
        System.out.print("Enter the initial temperature in degrees Celcius: ");
	double initialTemperature = input.nextDouble();
        
        System.out.print("Enter the final temperature in degrees Celcius: ");
	double finalTemperature = input.nextDouble();
        
        double q = waterMass * (finalTemperature - initialTemperature) * 4184;
	System.out.println("The energy needed is " + q);
    }
}
