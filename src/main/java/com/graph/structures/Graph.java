package com.graph.structures;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.vertices = new ArrayList<>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);

        if (!this.vertices.add(newVertex))
            return null;

        return newVertex;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public boolean isDirected() {
        return isDirected;
    }

    public Vertex getVertexByValue(String value) {
        for (Vertex v : this.vertices) {
            if (v.getData().equals(value))
                return v;
        }

        return null;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }

        vertex1.addEdge(vertex2, weight);
        if (!this.isDirected) {
            vertex2.addEdge(vertex1, weight);
        }

    }

    public void removeEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.removeEdge(vertex2);
        if (!this.isDirected)
            vertex2.removeEdge(vertex1);
    }

    public boolean removeVertex(Vertex vertex) {
        return this.vertices.removeIf(v -> v.equals(vertex));
    }

    public void print() {
        for (Vertex v : this.vertices) {
            v.print(this.isWeighted);
        }

    }
}