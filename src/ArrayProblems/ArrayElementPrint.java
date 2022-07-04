package ArrayProblems;

import java.util.Scanner;

public class ArrayElementPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Elements");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {// for reading array
			arr[i] = sc.nextInt();

		}

		for (int i : arr) { // for printing array

			System.out.println(i);

		}

	}

}
