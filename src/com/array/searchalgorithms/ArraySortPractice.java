package com.array.searchalgorithms;

import java.util.Arrays;

public class ArraySortPractice {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };

		bubbleSortOfArray(arr);
		System.out.println();
		selectionSortOfArray(arr);
		System.out.println();
		quickSOrtOfArray(arr, 0, arr.length - 1);
			Arrays.stream(arr).forEach(System.out::print);
	}

	private static void quickSOrtOfArray(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if (low < high) {

			int pivot = partition(arr, low, high);

			quickSOrtOfArray(arr, low, pivot - 1);
			quickSOrtOfArray(arr, pivot + 1, high);
		} 
		
		
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {

				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = pivot;
		arr[high] = temp;

		return i + 1;
	}

	private static void selectionSortOfArray(int[] arr) {
		// TODO Auto-generated method stub
		int minIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		Arrays.stream(arr).forEach(System.out::print);
	}

	private static void bubbleSortOfArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[i + 1] = temp;
				}
			}
		}

		Arrays.stream(arr).forEach(System.out::print);
	}

}
