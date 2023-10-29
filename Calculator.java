import java.util.*;

class Calculator {
	public static void main(String[] args) {
		char operator;
		Double int1, int2, result;
		Scanner sc = new Scanner(System.in);
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
	}
}