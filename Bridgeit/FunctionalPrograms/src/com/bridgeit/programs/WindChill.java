/*Write a program WindChill.java that takes two double
 *  command-line arguments t and v and prints the wind chill. 
 *  Use Math.pow(a, b) to compute ab. 
Given the temperature t (in Fahrenheit) and the wind speed v 
(in miles per hour), the National Weather Service defines the 
effective temperature (the wind chill) to be:

w = 35.74 + (0.6215*t) + ((0.4275*t)-35.75)* Math.pow(v, 0.16)

Note: the formula is not valid if t is larger than 50 in 
absolute value or if v is larger than 120 or less than 3 
(you may assume that the values you get are in that range).*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Finding the chill in wind.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */
public class WindChill {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int tempCount=0,windCount=0;
		double temperature=0,velocity=0;
		while(tempCount==0) {
		System.out.println("Enter the temperature t \nwhere t>50");
		temperature = utility.inputDouble();
		if(temperature>50)
			tempCount++;
		}
		while(windCount==0) {
		System.out.println("Enter the speed of wind v \nwhere 3<v<120 ");
		velocity = utility.inputDouble();
		if(velocity>3 && velocity<120)
			windCount++;
		}
		double windchill=utility.windChill(temperature,velocity);
		System.out.println("Wind Chill = "+windchill);
	}
}