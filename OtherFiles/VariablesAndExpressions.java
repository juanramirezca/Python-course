import java.lang.Math;


public class VariablesAndExpressions{
	public static void main(String[] args) {
		
		/*
		 * Values and types:
		 * Byte --> 8-bit number
		 * Short --> 16-bit number
		 * Int --> 32-bit number (4 bytes) integer number 
		 * Long --> 64-bit number (8 bytes) 
		 * Float --> Float(32-bit) numbers
		 * Double --> Double(64-bit) numbers
		 * String --> "This is a string"
		 * Char -> 'M'
		 * Boolean --> true or false
		*/
		int number = 8; // -> number[8]
		float score = 8.7F; // -> score[8.7]
		long longNumber = 1401L; // -> longNumber[1401]
		double finalSale = 140.50;
		char gender = 'M';
		boolean flag = true;
		String greetings = "Hello, World!"; // -> ["Hello, World"]

		// un comentario
		/*
		int -> numero sin decimal
		double -> numero con punto decimal
		char -> un solo caracter, y esta entre ''
		string -> cadena de caracteres y está entre ""
		boolean -> nos regresa valores de true o false
		*/

		//Printing values
		System.out.println("**Variable types**");
		System.out.println(number);
		System.out.println(score);
		System.out.println(greetings);
		System.out.println(finalSale);
		System.out.println(gender);
		System.out.println(flag);

		/*
		// Operators
		System.out.println("\n**Operators**");
		int num1 = 8;
		int num2 = 5;
		int num3 = 4;
		int num4 = 2;
		double doubleNum1 = 8.0;
		double doubleNum2 = 5.0;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(doubleNum1 / doubleNum2);
		System.out.println(num1 % num2);

		// Importing the Math function
		System.out.println("\n**Math functions**");
		System.out.println(Math.pow(num4,num2));
		System.out.println(Math.abs(-8.2));
		System.out.println(Math.sqrt(625));
		System.out.println(Math.PI * 2);

		// Order of operators
		System.out.println("\n**Order of operators**");
		// 8 + 5 * 8 / 4 + 2^3
		// = 8 + 5 * 8 / 4 + 8
		// = 8 + 40 / 4 + 8
		// = 8 + 10 + 8
		// = 26
		System.out.println(num1 + num2 * num1 / num3 + Math.pow(2,3));

		// Exercises
		// 1. Compute the area of a triangle of base 10 cm and height 15 cm. 
		// Area = base * height / 2
		int base, height, area;
		base = 10;
		height = 15;

		area = base * height / 2;
		System.out.println("El area es " + area);
		System.out.println();
		


		// 2. Compute the area of a circle of radius 5.
		// A = π * r ^ 2


		// 3. Compute the average of three scores: 8.5, 7.2, and 9.3


		// 4. Given celsius degrees, convert from celsius to fahrenheit
		// F = 9/5 * C + 32
		*/
	}
}
