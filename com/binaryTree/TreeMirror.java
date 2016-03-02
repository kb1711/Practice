package com.binaryTree;


public class TreeMirror {
	  public static void main(String[] args) {
		  BinaryTree root1 = new BinaryTree(3,
				  new BinaryTree(2,new BinaryTree(1,null,null),new BinaryTree(3,null,null)),
				  new BinaryTree(5,new BinaryTree(4,null,null),new BinaryTree(6,null,null)));
		    
		  BinaryTree root2 = new BinaryTree(3,
				  new BinaryTree(5,new BinaryTree(6,null,null),new BinaryTree(4,null,null)),
				  new BinaryTree(2,new BinaryTree(3,null,null),new BinaryTree(1,null,null)));
		  System.out.println(isMirror(root1,root2));
	
		    
		  BinaryTree root3 = new BinaryTree(3,
				  new BinaryTree(5,new BinaryTree(6,null,null),new BinaryTree(4,null,null)),
				  new BinaryTree(2,new BinaryTree(9,null,null),new BinaryTree(1,null,null)));
		  System.out.println(isMirror(root1,root3));
		  BinaryTree root4 = new BinaryTree(3,
				  new BinaryTree(5,new BinaryTree(6,null,null),null),
				  new BinaryTree(2,new BinaryTree(9,null,null),new BinaryTree(1,null,null)));
		  System.out.println(isMirror(root1,root4));

		   
	  }
public static boolean isMirror(BinaryTree tree1,BinaryTree tree2){
	if(tree1==null || tree2==null)
		return tree1==null && tree2==null;
	return tree1.getData()==tree2.getData() &&
			isMirror(tree1.getLeft(),tree2.getRight()) &&
			isMirror(tree1.getRight(),tree2.getLeft());
}
}
