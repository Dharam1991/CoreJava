package com.vs.interview.java8;

/**
 * @created 27/02/2020 -10:06 PM
 * @vishabsingh
 **/
public class AppRun {
    public static void main(String[] args) {
        BFS bfs = new BFS();
        Vertex<String> root = new Vertex<>("A");
        Vertex<String> vertex1 = new Vertex<>("B");
        Vertex<String> vertex2 = new Vertex<>("C");
        Vertex<String> vertex3 = new Vertex<>("D");
        Vertex<String> vertex4 = new Vertex<>("E");
        Vertex<String> vertex5 = new Vertex<>("F");

        root.setNeighbours(vertex2);
        root.setNeighbours(vertex5);
        vertex4.setNeighbours(vertex5);
        root.setNeighbours(vertex4);
        vertex2.setNeighbours(vertex3);
        vertex2.setNeighbours(vertex1);
        bfs.bfs(root);
        bfs.BFSStream(root);
    }
}
