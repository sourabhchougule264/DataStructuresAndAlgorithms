package com.array.searchalgorithms;

import java.rmi.server.RMIFailureHandler;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.swing.text.Highlighter.Highlight;

public class ArraySearchPractice {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,4,6};
		int low = 0;
		int high = arr.length - 1;
		quickSortMethod(low,high,arr);
	}

	private static void quickSortMethod(int low, int high, int[] arr) {
		// TODO Auto-generated method stub
		
		while(low < high) {
			
			int pivot = partition(low,high,arr);
			
			quickSortMethod(low, pivot - 1, arr);
			quickSortMethod(pivot + 1, high, arr);
		}
	}

	private static int partition(int low, int high, int[] arr) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j < pivot; j++) {
			i++;
			if(arr[j] < pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] =  pivot;
		arr[high] = temp;
		
		return i+1;
	}

}
