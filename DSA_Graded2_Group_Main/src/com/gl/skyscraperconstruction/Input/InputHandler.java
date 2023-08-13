package com.gl.skyscraperconstruction.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {
	public static List<Integer> getFloorSizes() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building");
		int N = scanner.nextInt();

		List<Integer> floorSizes = new ArrayList<>();

		for (int day = 1; day <= N; day++) {
			System.out.println("Enter the floor size given on day : " + day);
			int size = scanner.nextInt();
			floorSizes.add(size);
		}

		scanner.close();
		return floorSizes;
	}
}
