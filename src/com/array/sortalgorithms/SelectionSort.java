package com.array.sortalgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 6, 5, 3, 2, 9, 8, 7 };
		int temp = 0;
		int minIndex = -1;

		System.out.println("Array Before Sort");
		for (int num : nums) {
			System.out.print(num + " ");
		}

		for (int i = 0; i < nums.length - 1; i++) {

			minIndex = i;

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[minIndex] > nums[j]) {
					minIndex = j;

				}

			}

			temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;

			System.out.println();
			for (int num : nums) {
				System.out.print(num + " ");
			}
		}

		System.out.println();
		System.out.println("Array After Sort");
		for (int num : nums) {
			System.out.print(num + " ");
		}

	}

}
