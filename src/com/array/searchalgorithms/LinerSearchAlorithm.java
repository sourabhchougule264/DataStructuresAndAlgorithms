package com.array.searchalgorithms;

import java.util.Scanner;

public class LinerSearchAlorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Linear Search is the search algorithm where we loop over the entire
		 * data structure(Array) to find the element. The time complexity of Linear Search is
		 * Liner Complexity( o(n) ).
		 */

		int nums[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
		int target;
		int result;

		Scanner inScanner = new Scanner(System.in);
		System.out.println("Please Enter the Number to Search");
		target = inScanner.nextInt();

		result = linearSerach(nums, target);

		if (result != -1)
			System.out.println("The number found at index : " + result);
		else
			System.out.println("Number Not Found");

	}

	public static int linearSerach(int[] nums, int target) {
		// TODO Auto-generated method stub

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target)
				return i;

		}

		return -1;
	}

}
