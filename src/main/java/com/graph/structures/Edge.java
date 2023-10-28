package com.graph.structures;

public class Edge {

    private Vertex start;
    private Vertex end;
    private Integer weight; // allows passing in 'null'

    public Edge(Vertex startV, Vertex endV, Integer inputWeight) {
        this.start = startV;
        this.end = endV;
        this.weight = inputWeight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }

    public String toString() {
        return "(" + start.getData() + ", " + end.getData() + "; " + weight + ")";
    }
}
