public class Conditionals {
	public static void main(String[] args) {
		int age, retirementAge, num1, num2, num3;
		age = 18;
		num1 = 8;
		num2 = 5;
		num3 = 7;

		//Boolean expressions.
		//Can be either true or false.

		System.out.println("**Relational operators**");
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);

		//Logical operators
		//There are three types of types of logical operators
		// and (&&) or (||), not(!)
		System.out.println("\n** Logical operators**");
		System.out.println(num1 == num2 && num1 == num3);
		System.out.println(num1 == num2 || num1 == num3);
		System.out.println(!(num1 == num2));

		//Conditional execution
		//1. Determine if a person in Mexico can vote
		System.out.println("\n** Conditional execution**");
		if(age == 18){
			System.out.println("Can Vote!");	
		} 

		//2. Determine if a value is positive
		if(num1 > 0){
			System.out.println("It's positive");
		}

		//Determine if a value is positive or negative
		if(num2 > 0){
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}

		//Chained conditionals
		//Determine if a number is positive, negative or equal to zero
		System.out.println("\n**Chained Conditionals**");
		num3 = 0;
		if(num3 > 0){
			System.out.println("Positive");
		} else {
			if(num3 == 0){
				System.out.println("Equal to zero");
			} else {
				System.out.println("Negative");
			}
		}

		//Exercises
		// 1. Determine if an employee is eligible for retirement. Retirement at 65.


		// 2. Determine if a number is divided by 3, 5 or both


		// 3. Given three numbers, determine which one is bigger.
		


	} // ends main
} // ends class