package com.binaryTree;

public class LowestCommonAncestor {
	public static void main(String[] args) {
		BinaryTree root= new BinaryTree(2,new BinaryTree(5,new BinaryTree(3,null,null),new BinaryTree(1,null,null)),
				new BinaryTree(7,new BinaryTree(1,null,null),new BinaryTree(3,null,null)));
		BinaryTree node1= root.getLeft().getLeft();
		BinaryTree node2= root.getLeft().getRight();
		Status lca=lowestCommonAncestor(root,node1,node2);
		System.out.println(lca.lcaNode.getData());
		
		Status lca1=lowestCommonAncestor(root,root.getLeft(),root.getRight());
		System.out.println(lca1.lcaNode.getData());
		
		Status lca2=lowestCommonAncestor(root,root.getRight().getLeft(),root.getRight().getLeft());
		System.out.println(lca2.lcaNode.getData());
	}
	
	static class Status {
		BinaryTree lcaNode;
		int nodeCount;
		Status(BinaryTree node,int count) {
			lcaNode=node;
			nodeCount=count;
		}
	}
	private static Status lowestCommonAncestor(BinaryTree tree,BinaryTree node1,BinaryTree node2) {
		if(tree==null) {
			return new Status(null,0);
		}
		if((tree.getLeft()==node1||tree.getRight()==node1) && node1==node2){
			return new Status(tree,2);
		}
		Status leftStatus=lowestCommonAncestor(tree.getLeft(),node1,node2);
		if(leftStatus.nodeCount==2){
			return leftStatus;
		}
		
		Status rightStatus=lowestCommonAncestor(tree.getRight(),node1,node2);
		if(rightStatus.nodeCount==2){
			return rightStatus;
		}
		
		int nodeCount = leftStatus.nodeCount+
				rightStatus.nodeCount+ (tree==node1 || tree==node2 ?1:0);
		
		return new Status(nodeCount==2?tree:null,nodeCount);
	}
}
