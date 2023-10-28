package com.graph;

import com.graph.structures.Graph;
import com.graph.structures.Vertex;

public class Main {

    public static void main(String[] args) {

        //Creating a directed graph representing BusStation
        Graph busNetwork= new Graph(true, true);
        
        Vertex productionWay = busNetwork.addVertex("Production Way");
        Vertex lougheed = busNetwork.addVertex("Lougheed Town Centre");

        busNetwork.addEdge(productionWay, lougheed, 300);

        busNetwork.print();
    }
    
}
