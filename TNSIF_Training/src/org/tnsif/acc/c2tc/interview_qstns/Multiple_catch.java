package org.tnsif.acc.c2tc.interview_qstns;

public class Multiple_catch {

	public static void main(String[] args) {
		try {
            int a = 10;
            int b = 0;

            int result = a / b;  // ArithmeticException
            System.out.println(result);

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range.");
        }

        System.out.println("Program Ended Successfully.");
		

	}

}
