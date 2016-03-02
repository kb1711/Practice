package com.binaryTree;

import java.util.LinkedList;
import java.util.List;

public class PathExistBetweenTwoNodesInAGraph {
	private boolean isPathPresent(Graph g, Graph startNode, Graph endNode) {
		LinkedList<Graph> queue = new LinkedList<Graph>();
		queue.push(startNode);
		while (!queue.isEmpty()) {
			List<Graph> adjNodes = queue.removeFirst().getAdjecentNodes();
			
			for (Graph adjNode : adjNodes) {
				if (!adjNode.isVisited()) {
					if(adjNode==endNode)
						return true;
					queue.push(adjNode);
					adjNode.setVisited(true);
				}
			}
		}
		return false;
	}
}
