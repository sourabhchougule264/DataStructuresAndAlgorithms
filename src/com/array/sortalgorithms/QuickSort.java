package com.array.sortalgorithms;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 3, 4, 1, 2 };

		QuickSort(arr, 0, arr.length - 1);

		for (int num : arr) {

			System.out.print(num + " ");
		}

	}

	private static void QuickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub

		if (low < high) {

			// calling the partition method to find the pivot to split array into two
			int pivot = partition(arr, low, high);

			// doing the recursion for both the arrays to achieve it till the end
			QuickSort(arr, low, pivot - 1);
			QuickSort(arr, pivot + 1, high);
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

}
