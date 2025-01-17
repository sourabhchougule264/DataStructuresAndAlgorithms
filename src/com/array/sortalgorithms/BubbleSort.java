package com.array.sortalgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 4, 2, 6, 8, 7, 9, 5 };
		int temp = 0; // temp variable for swapping the elements

		System.out.println("Array Before Sort ");
		for (int num : nums) {
			System.out.print(num + " ");
		}

		// Bubble Sort start

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length - i - 1; j++) {

				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}

			}

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
