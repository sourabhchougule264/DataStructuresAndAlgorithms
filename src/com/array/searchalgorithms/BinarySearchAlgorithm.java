package com.array.searchalgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Binary Search Algorithm is the search algorithm where we search the element
		 * by splitting the data structure(Array) into half during every step. The time
		 * complexity of the binary search algorithm is Logarithmic Complexity ( o(logn)
		 * ). For using the Binary search, Data Structure should be sorted.
		 */

		int nums[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };
		int target;
		int result1;
		int result2;

		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter the number to search");
		target = inScanner.nextInt();

		// For using the Binary search, Data Structure should be sorted.
		Arrays.sort(nums);

		result1 = binarySearchAlgorithm(nums, target);

		result2 = binarySearchAlgorithmByRecursion(nums, target, 0, nums.length - 1);

		if (result1 != -1) {
			System.out.println("The Number Found At Index by while loop : " + result1);
		} else {
			System.out.println("Number Not Found by while loop");
		}

		if (result2 != -1) {
			System.out.println("The Number Found At Index by recursion : " + result2);
		} else {
			System.out.println("Number Not Found by recursion");
		}

	}

	private static int binarySearchAlgorithmByRecursion(int[] nums, int target, int left, int right) {
		// TODO Auto-generated method stub

		if (left <= right) {
			int mid = (left + right) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				return binarySearchAlgorithmByRecursion(nums, target, mid + 1, right);
			} else {
				return binarySearchAlgorithmByRecursion(nums, target, left, mid - 1);
			}
		}
		return -1;

	}

	public static int binarySearchAlgorithm(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = nums.length - 1;
		int steps = 0;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (nums[mid] == target) {
				System.out.println("The Steps Taken to find number are : " + steps);
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			steps++;
		}

		return -1;
	}

}
