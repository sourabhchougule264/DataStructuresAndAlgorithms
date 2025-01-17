package com.array.sortalgorithms;

import java.util.stream.Stream;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 5, 4, 1, 2 };

		System.out.println("Before insertion sort");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		for (int i = 1; i < arr.length; i++) {

			int j = i - 1;
			int temp = arr[i];

			while (j >= 0 && arr[j] > temp) {

				arr[j + 1] = arr[j];

				j--;
			}

			arr[j + 1] = temp;

			System.out.println();
			System.out.println("After between sort");
			for (int num : arr) {
				System.out.print(num + " ");
			}
		}

		System.out.println();
		System.out.println("After insertion sort");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
