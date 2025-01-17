package com.array.sortalgorithms;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 6, 4, 5, 2, 1, 3 };

		mergeSort(arr, 0, arr.length - 1);

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	private static void mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub

		if (low < high) {

			int mid = (low + high) / 2;

			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);

			merge(arr, low, mid, high);

		}

	}

	private static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub

		int n1 = mid - low + 1;
		int n2 = high - mid;

		int lArr[] = new int[n1];
		int rArr[] = new int[n2];

		for (int x = 0; x < n1; x++) {
			lArr[x] = arr[low + x];
		}

		for (int x = 0; x < n2; x++) {
			rArr[x] = arr[mid + 1 + x];
		}

		int i = 0;
		int j = 0;
		int k = low;

		while (i < n1 && j < n2) {

			if (lArr[i] <= rArr[j]) {

				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
	}

}
