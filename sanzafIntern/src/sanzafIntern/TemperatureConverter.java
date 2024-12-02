package sanzafIntern;

import java.util.Scanner;

public class TemperatureConverter {
	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9/5) + 32;
	    }

	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5/9;
	    }

	    public static double celsiusToKelvin(double celsius) {
	        return celsius + 273.15;
	    }

	    public static double kelvinToCelsius(double kelvin) {
	        return kelvin - 273.15;
	    }

	    public static double fahrenheitToKelvin(double fahrenheit) {
	        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
	    }

	    public static double kelvinToFahrenheit(double kelvin) {
	        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Temperature Converter");
	        System.out.println("1. Celsius to Fahrenheit");
	        System.out.println("2. Fahrenheit to Celsius");
	        System.out.println("3. Celsius to Kelvin");
	        System.out.println("4. Kelvin to Celsius");
	        System.out.println("5. Fahrenheit to Kelvin");
	        System.out.println("6. Kelvin to Fahrenheit");

	        System.out.print("Select conversion (1-6): ");
	        int choice = scanner.nextInt();
	        System.out.print("Enter the temperature to convert: ");
	        double temp = scanner.nextDouble();

	        switch (choice) {
	            case 1:
	                System.out.println(temp + " Celsius is " + celsiusToFahrenheit(temp) + " Fahrenheit");
	                break;
	            case 2:
	                System.out.println(temp + " Fahrenheit is " + fahrenheitToCelsius(temp) + " Celsius");
	                break;
	            case 3:
	                System.out.println(temp + " Celsius is " + celsiusToKelvin(temp) + " Kelvin");
	                break;
	            case 4:
	                System.out.println(temp + " Kelvin is " + kelvinToCelsius(temp) + " Celsius");
	                break;
	            case 5:
	                System.out.println(temp + " Fahrenheit is " + fahrenheitToKelvin(temp) + " Kelvin");
	                break;
	            case 6:
	                System.out.println(temp + " Kelvin is " + kelvinToFahrenheit(temp) + " Fahrenheit");
	                break;
	            default:
	                System.out.println("Invalid selection!");
	                break;
	        }

	        scanner.close();
	    
	}


}
