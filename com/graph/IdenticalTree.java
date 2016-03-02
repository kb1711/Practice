package com.graph;

public class IdenticalTree {
	/*
	 * q: given two trees (non-binary search tree), write a program that will compare the two and return true if the trees 
	 * are identical, false otherwise. 
	 * tree1:  
	       21
	    11   14    17
	 1  2    4      5 4   

	tree2:
	       a
	    b   c    d
	 1  2   4   5*/
	public static void main(String[] args) {      
		MultinodeTree tree1 = new MultinodeTree();
		tree1.setData(21);
		
		MultinodeTree Child1Level1tree1 = new MultinodeTree();
		Child1Level1tree1.setData(11);
		MultinodeTree Child2Level1tree1 = new MultinodeTree();
		Child2Level1tree1.setData(14);
		MultinodeTree Child3Level1tree1 = new MultinodeTree();
		Child3Level1tree1.setData(17);
		tree1.getChildNodeList().add(Child1Level1tree1);
		tree1.getChildNodeList().add(Child2Level1tree1);
		tree1.getChildNodeList().add(Child3Level1tree1);
		
		MultinodeTree Child1Level2tree1 = new MultinodeTree();
		Child1Level2tree1.setData(1);
		
		MultinodeTree Child2Level2tree1 = new MultinodeTree();
		Child2Level2tree1.setData(2);
		
		
		MultinodeTree Child3Level2tree1 = new MultinodeTree();
		Child3Level2tree1.setData(4);
		MultinodeTree Child4Level2tree1 = new MultinodeTree();
		Child4Level2tree1.setData(5);
		
		MultinodeTree Child5Level2tree1 = new MultinodeTree();
		Child5Level2tree1.setData(4);
		
		Child1Level1tree1.getChildNodeList().add(Child1Level2tree1);
		Child1Level1tree1.getChildNodeList().add(Child2Level2tree1);

		Child2Level1tree1.getChildNodeList().add(Child3Level2tree1);
		
		Child3Level1tree1.getChildNodeList().add(Child4Level2tree1);
		Child3Level1tree1.getChildNodeList().add(Child5Level2tree1);

		
		//Tree 2
		MultinodeTree tree2 = new MultinodeTree();
		tree2.setData(21);
		
		MultinodeTree Child1Level1tree2 = new MultinodeTree();
		Child1Level1tree2.setData(11);
		MultinodeTree Child2Level1tree2 = new MultinodeTree();
		Child2Level1tree2.setData(14);
		MultinodeTree Child3Level1tree2 = new MultinodeTree();
		Child3Level1tree2.setData(17);
		tree2.getChildNodeList().add(Child1Level1tree2);
		tree2.getChildNodeList().add(Child2Level1tree2);
		tree2.getChildNodeList().add(Child3Level1tree2);
		
		MultinodeTree Child1Level2tree2 = new MultinodeTree();
		Child1Level2tree2.setData(1);
		
		MultinodeTree Child2Level2tree2 = new MultinodeTree();
		Child2Level2tree2.setData(2);
		
		
		MultinodeTree Child3Level2tree2 = new MultinodeTree();
		Child3Level2tree2.setData(4);
		MultinodeTree Child4Level2tree2 = new MultinodeTree();
		Child4Level2tree2.setData(5);
		
		MultinodeTree Child5Level2tree2 = new MultinodeTree();
		Child5Level2tree2.setData(4);
		
		Child1Level1tree2.getChildNodeList().add(Child1Level2tree2);
		Child1Level1tree2.getChildNodeList().add(Child2Level2tree2);

		Child2Level1tree2.getChildNodeList().add(Child3Level2tree2);
		
		Child3Level1tree2.getChildNodeList().add(Child4Level2tree2);
		Child3Level1tree2.getChildNodeList().add(Child5Level2tree2);
		
		System.out.println(identicalTree(tree1,tree2));
	}
	 
	
	public static boolean identicalTree(MultinodeTree tree1, MultinodeTree tree2){
	    int i =0;
	    boolean status=true;
	    while(status) {
	        if((!tree1.getChildNodeList().isEmpty() && tree2.getChildNodeList().isEmpty()) ||
	            (tree1.getChildNodeList().isEmpty() && !tree2.getChildNodeList().isEmpty())) {
	             status= false;
	        	break;
	        }
	        if ((tree1.getChildNodeList().isEmpty() && tree2.getChildNodeList().isEmpty())) {
	        	status= true;
	        	break;
	        }
	        
	        boolean isIdentical=identicalTree(tree1.getChildNodeList().get(i),tree2.getChildNodeList().get(i));
	        boolean isDataEqual=tree1.getChildNodeList().get(i).getData()==tree2.getChildNodeList().get(i).getData();
	        i++;
	        status=  isDataEqual   &&  isIdentical; 
	        
	        }
	     return status;
	      
	 
	    
	    

	} 
}
