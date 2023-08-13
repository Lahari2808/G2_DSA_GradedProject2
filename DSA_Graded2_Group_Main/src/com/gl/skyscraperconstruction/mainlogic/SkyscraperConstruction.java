package com.gl.skyscraperconstruction.mainlogic;

import com.gl.skyscraperconstruction.Input.*;
import java.util.List;
import java.util.Stack;

public class SkyscraperConstruction {
	public static void main(String[] args) {
		List<Integer> floorSizes = InputHandler.getFloorSizes();

		Stack<Integer> assembledFloors = new Stack<>();
		System.out.println("\nThe order of construction is as follows");
		for (int i = 0; i < floorSizes.size(); i++) {
			int size = floorSizes.get(i);
			while (!assembledFloors.isEmpty() && assembledFloors.peek() > size) {
				System.out.print(assembledFloors.pop() + " ");
			}

			assembledFloors.push(size);

			System.out.println("\nDay: " + (i + 1));
		}

		// Print the remaining assembled floors
		while (!assembledFloors.isEmpty()) {
			System.out.print(assembledFloors.pop() + " ");
		}
	}
}
