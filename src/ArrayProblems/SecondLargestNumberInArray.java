package ArrayProblems;

import java.util.Scanner;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of Elements");

		int size,temp;

		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter Elements");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Array Elements are:");

		for (int i : arr) {

			System.out.println(i);

		}
		size=arr.length;
		for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){


	            if(arr[i]>arr[j]){
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second Largest Number is:: "+arr[size-2]);

	}

}
