package com.binaryTree;

public class BinaryTree {
	private int data;

	public BinaryTree(int data,BinaryTree left,BinaryTree right){
		this.data=data;
		this.left=left;
		this.right=right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTree getLeft() {
		return left;
	}
	public void setLeft(BinaryTree left) {
		this.left = left;
	}
	public BinaryTree getRight() {
		return right;
	}
	public void setRight(BinaryTree right) {
		this.right = right;
	}
	private BinaryTree left;
	private BinaryTree right;
}
