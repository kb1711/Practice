package com.graph;

import java.util.ArrayList;
import java.util.List;


public class MultinodeTree {

		private int data;
		 private List<MultinodeTree> childNodeList=new ArrayList<MultinodeTree>();
		 
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public List<MultinodeTree> getChildNodeList() {
		return childNodeList;
	}
	public void setChildNodeList(List<MultinodeTree> childNodeList) {
		this.childNodeList = childNodeList;
	}
		
}
