package ArrayProblems;

import java.util.Scanner;

public class ArrayElementOddPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Elements");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter elements");

		for (int i = 0; i < n; i++) {// for reading array
			arr[i] = sc.nextInt();

		}

		System.out.println("Elements of given array present on Odd position: ");

        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }

	}

}
