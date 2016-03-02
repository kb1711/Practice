package com.binaryTree;

import java.util.List;

public class Graph<T> {

	List<Graph<T>> adjecentNodes;
	T data;	
	private boolean visited;
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	Graph(Graph<T> node,List<Graph<T>> adjecentNodes,T data){
		this.adjecentNodes=adjecentNodes;
		this.data=data;
	}
	Graph (){
		
	}
	
	public List<Graph<T>> getAdjecentNodes() {
		return adjecentNodes;
	}
	public void setAdjecentNodes(List<Graph<T>> adjecentNodes) {
		this.adjecentNodes = adjecentNodes;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
