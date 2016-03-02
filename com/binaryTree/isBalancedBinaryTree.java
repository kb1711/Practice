package com.binaryTree;

public class isBalancedBinaryTree {
int lefttreeheight=-1;
int righttreeheight=-1;
	public static void main(String[] args) {
		BinaryTree root= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(5,new BinaryTree(1,null,null),new BinaryTree(3,null,null)));
		boolean isBalanced=isBalanced(root);
		System.out.println("Is SymmetricTree :" + isBalanced);
		
		BinaryTree root1= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(5,new BinaryTree(3,new BinaryTree(1,null,null),null),null));
		boolean isBalanced1=isBalanced(root1);
		System.out.println("Is SymmetricTree :" + isBalanced1);
		
		BinaryTree root3= new BinaryTree(2,null,null);
		boolean isBalanced3=isBalanced(root3);
		System.out.println("Is SymmetricTree :" + isBalanced3);
		
		
		BinaryTree root4= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(5,null,new BinaryTree(1,null,null)));
		boolean isBalanced4=isBalanced(root4);
		System.out.println("Is SymmetricTree :" + isBalanced4); 
		
		
		//K Balanced Use case
		BinaryTree rootK= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(5,new BinaryTree(1,null,null),new BinaryTree(3,null,null)));
		boolean isKBalanced=isKBalanced(rootK,2);
		System.out.println("Is SymmetricTree :" + isKBalanced);
		
		BinaryTree rootK1= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(5,new BinaryTree(3,new BinaryTree(1,new BinaryTree(0,null,null),null),null),null));
		boolean isKBalanced1=isKBalanced(rootK1,2);
		System.out.println("Is SymmetricTree :" + isKBalanced1);

	}
	
	private static boolean isBalanced(BinaryTree tree){
		return !(getHeight(tree)==-1);
	}

	private static int getHeight(BinaryTree tree) {
		if(tree==null)
			return 0;
		int leftHeight=getHeight(tree.getLeft());
		if(leftHeight==-1)
			return -1;
		int rightHeight=getHeight(tree.getRight());
		if(rightHeight==-1)
			return -1;
		int hight=Math.abs(leftHeight-rightHeight);
		if(hight > 1)
			return -1;
		return Math.max(leftHeight,rightHeight) +1;
	}
	
	
	private static boolean isKBalanced(BinaryTree tree,int k ){
		return !(getKHeight(tree,k)==-k);
	}

	private static int getKHeight(BinaryTree tree,int k) {
		if(tree==null)
			return 0;
		int leftHeight=getKHeight(tree.getLeft(),k);
		if(leftHeight==-k)
			return -k;
		int rightHeight=getKHeight(tree.getRight(),k);
		if(rightHeight==-k)
			return -k;
		int hight=Math.abs(leftHeight-rightHeight);
		if(hight > k)
			return -k;
		return Math.max(leftHeight,rightHeight) +1;
	}

}
