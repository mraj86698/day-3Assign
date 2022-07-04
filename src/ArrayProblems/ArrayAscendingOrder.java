package ArrayProblems;

import java.util.Scanner;

public class ArrayAscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Elements");
		int temp;
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {// for reading array
			arr[i] = sc.nextInt();

		}
		System.out.println("Array Elements are:");

		for (int i : arr) { // for printing array

			System.out.println(i);

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("Arrays Sorted in Ascending Order:");
		for (int i : arr) {

			System.out.println(i);

		}

	}

}
