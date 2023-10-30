import java.util.*;

class Calculator {
	public static void main(String[] args) {
		char operator, operator1;
		Double int1, int2, int3, result;
		int amountOfNumbers;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter # of numbers you want to use: ");
		amountOfNumbers = sc.nextInt();
		
		
		
		switch (amountOfNumbers) {
		case 2:
			System.out.print("Enter number 1: ");
			int1 = sc.nextDouble();
			System.out.print("Enter operator (+,-,*,/): ");
			operator = sc.next().charAt(0);
			System.out.print("Enter number 2: ");
			int2 = sc.nextDouble();
			
			switch (operator) {
			default:
				System.out.println("Invalid operator, please try again.");
				break;
			case '+':
				result = int1 + int2;
				System.out.println(int1 + "+" + int2 + "=" + result);
				break;
			case '-':
				result = int1 - int2;
				System.out.println(int1 + "-" + int2 + "=" + result);
				break;
			case '*':
				result = int1 * int2;
				System.out.println(int1 + "*" + int2 + "=" + result);
				break;
			case '/':
				result = int1 / int2;
				System.out.println(int1 + "/" + int2 + "=" + result);
				break;
			}
			
			break;
		
		case 3:
			System.out.print("Enter number 1: ");
			int1 = sc.nextDouble();
			System.out.print("Enter operator (+,-,*,/): ");
			operator = sc.next().charAt(0);
			System.out.print("Enter number 2: ");
			int2 = sc.nextDouble();
			System.out.print("Enter operator (+,-,*,/): ");
			operator1 = sc.next().charAt(0);
			System.out.print("Enter number 3: ");
			int3 = sc.nextDouble();
			
			
			
			switch (operator) {
			default:
				System.out.println("Invalid operator, please try again.");
				break;
			case '+':
				
				switch (operator1) {
				
				case '+':
					result = int1 + int2 + int3;
					System.out.println(int1 + "+" + int2 + "+" + int3 + "=" + result);
					break;
				
				case '-':
					result = int1 + int2 - int3;
					System.out.println(int1 + "+" + int2 + "-" + int3 + "=" + result);
					break;
				
				case '*':
					result = int1 + int2 * int3;
					System.out.println(int1 + "+" + int2 + "*" + int3 + "=" + result);
					break;
				
				case '/':
					result = int1 + int2 / int3;
					System.out.println(int1 + "+" + int2 + "/" + int3 + "=" + result);
					break;
				}
				break;
				
			
			
			case '-':
				
				switch (operator1) {
				
				case '+':
					result = int1 - int2 + int3;
					System.out.println(int1 + "-" + int2 + "+" + int3 + "=" + result);
					break;
					
				case '-':
					result = int1 - int2 - int3;
					System.out.println(int1 + "-" + int2 + "-" + int3 + "=" + result);
					break;
				
				case '*':
					result = int1 - int2 * int3;
					System.out.println(int1 + "-" + int2 + "*" + int3 + "=" + result);
					break;
				
				case '/':
					result = int1 - int2 / int3;
					System.out.println(int1 + "-" + int2 + "/" + int3 + "=" + result);
					break;
				}
				break;
			
			
			
			case '*':
				
				switch (operator1) {
				
				case '+':
					result = int1 * int2 + int3;
					System.out.println(int1 + "*" + int2 + "+" + int3 + "=" + result);
					break;
				
				case '-':
					result = int1 * int2 - int3;
					System.out.println(int1 + "*" + int2 + "-" + int3 + "=" + result);
					break;
				
				case '*':
					result = int1 * int2 * int3;
					System.out.println(int1 + "*" + int2 + "*" + int3 + "=" + result);
					break;
				
				case '/':
					result = int1 * int2 / int3;
					System.out.println(int1 + "*" + int2 + "/" + int3 + "=" + result);
					break;
				}
				break;
			
			
			
			case '/':
				
				switch (operator1) {
				
				case '+':
					result = int1 / int2 + int3;
					System.out.println(int1 + "/" + int2 + "+" + int3 + "=" + result);
					break;
				
				case '-':
					result = int1 / int2 - int3;
					System.out.println(int1 + "/" + int2 + "-" + int3 + "=" + result);
					break;
				
				case '*':
					result = int1 / int2 * int3;
					System.out.println(int1 + "/" + int2 + "*" + int3 + "=" + result);
					break;
				
				case '/':
					result = int1 / int2 / int3;
					System.out.println(int1 + "/" + int2 + "/" + int3 + "=" + result);
					break;
				}
				break;
			}
			
			break;
		}

	}
}