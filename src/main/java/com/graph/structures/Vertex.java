package com.graph.structures;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inputData){
        this.data = inputData;
        this.edges = new ArrayList<>();
    }

    public String getData(){
        return this.data;
    }

    public List<Edge> getEdges(){
        return this.edges;
    }

    public void addEdge(Vertex endVertex, Integer weight){
        this.edges.add(new Edge(this, endVertex, weight));
    }

    public void removeEdge(Vertex endVertex){
        // start edge is not needed since each vertex maintains only its
        // own edges
        this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }

    public void print(boolean showWeight){
        StringBuilder message = new StringBuilder("");
        message.append(data);

        if(this.edges.isEmpty()) {
            System.out.println(this.data + " -->");
            return;
        }

        message.append(this.data + " --> ");

        for (int i = 0; i<this.edges.size(); ++i){

            message.append(this.edges.get(i).getEnd().getData());

            if(showWeight) {
                message.append( " (" +
                this.edges.get(i).getWeight()
                +") " );
            }

            if(i != this.edges.size()-1)
                message.append(", ");
        }

        System.out.println(message);
    }
    
}
