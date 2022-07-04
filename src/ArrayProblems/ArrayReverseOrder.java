package ArrayProblems;

import java.util.Scanner;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Elements");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {// for reading array
			arr[i] = sc.nextInt();

		}
		 System.out.println("Original array: ");

		for (int i : arr) { // for printing array

			System.out.println(i);

		}
		System.out.println();
        System.out.println("Array in reverse order: ");

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


	}

}
