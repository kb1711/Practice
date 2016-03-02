package com.binaryTree;

public class SymmetricTree {

	public static void main(String[] args) {
		BinaryTree root= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(5,new BinaryTree(1,null,null),new BinaryTree(3,null,null)));
		boolean isSymmetricTree=isSymmetric(root.getLeft(),root.getRight());
		System.out.println("Is SymmetricTree :" + isSymmetricTree);
		
		BinaryTree root1= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)));
		boolean isSymmetricTree1=isSymmetric(root1.getLeft(),root1.getRight());
		System.out.println("Is SymmetricTree :" + isSymmetricTree1);
		
		BinaryTree root3= new BinaryTree(2,null,null);
		boolean isSymmetricTree3=isSymmetric(root3.getLeft(),root3.getRight());
		System.out.println("Is SymmetricTree :" + isSymmetricTree3);
		
		
		BinaryTree root4= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(5,null,new BinaryTree(1,null,null)));
		boolean isSymmetricTree4=isSymmetric(root4.getLeft(),root4.getRight());
		System.out.println("Is SymmetricTree :" + isSymmetricTree4); 
	}

	private static boolean isSymmetric(BinaryTree leftTree, BinaryTree rightTree) {
		if(leftTree==null || rightTree==null) {
			return leftTree==null && rightTree==null;
		}
		return leftTree.getData()== rightTree.getData() &&
				isSymmetric(leftTree.getLeft(),rightTree.getRight()) &&
				isSymmetric(leftTree.getRight(),rightTree.getLeft());
	}

}
