package ArrayProblems;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Elements");

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {// for reading array
			arr[i] = sc.nextInt();

		}

		System.out.println("Printing Of An Array:");

		for (int i : arr) { // for printing array

			System.out.println(i);

		}
		for(int i = 0; i < arr.length; i++){
		      for(int j = i + 1; j < arr.length; j++){
		        if(arr[i] == arr[j]){
		          System.out.println("Duplicate element found " + arr[j]);
		        }
		      }
		    }

	}

}
