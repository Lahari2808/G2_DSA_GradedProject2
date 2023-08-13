package com.gl.mnctransactions.mainlogic;

import com.gl.mnctransactions.input.*;

public class Main {
	Node node;

	private Node convertToSkewedTree(Node root) {
		if (root == null) {
			return null;
		}

		while (root.left != null) {
			Node left = root.left;
			root.left = left.right;
			left.right = root;
			root = left;
		}

		return root;
	}

	private void printInAscendingOrder(Node root) {
		if (root == null) {
			return;
		}

		printInAscendingOrder(root.left);
		System.out.print(root.value + " ");
		printInAscendingOrder(root.right);
	}

	public static void main(String[] args) {
		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		Node skewedRoot = tree.convertToSkewedTree(tree.node);

		tree.printInAscendingOrder(skewedRoot);
	}
}
