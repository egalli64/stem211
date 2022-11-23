package com.example.stem211.emanuele;

public class ModThree {
	public static void main(String[] args) {
		int[] data = { 2, 1, 3, 5 };
		System.out.println(modThree(data));
	}

	public static boolean modThree(int[] nums) {
		if (nums.length < 3) {
			return false;
		}
		boolean even = nums[0] % 2 == 0;
		int counter = 1;
		for (int i = 1; i < nums.length; i++) {
			boolean cur = nums[i] % 2 == 0;
			if (cur ^ even) {
				counter = 1;
				even = !even;
			} else {
				counter++;
				if (counter == 3) {
					return true;
				}
			}
		}
		return false;

	}

}
