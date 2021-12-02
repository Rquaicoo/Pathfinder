package com.src.ShortestPath;
import java.util.*;

//each node has a weight and a list of edges
public class Node {
    int n;
    String name;
    private boolean visited;
    LinkedList<Edge> edges;

    Node(int n, String nameOfLocation) {
        this.n = n;
        this.name = nameOfLocation;
        visited = false;
        edges = new LinkedList<>();
    }

    boolean isVisited() {
        return visited;
    }

    void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }
}
