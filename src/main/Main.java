package main;

import WeightedGraph.Graph;

import java.lang.*;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		String filePath = "src/DefaultGraph.txt";
		File f = new File(filePath);
//		Graph graph = new Graph();
//		graph.readMap(filePath);
//		System.out.println(graph);
//
//		System.out.println(graph.DFS("4"));
//		System.out.println(graph.BFS("4"));
//		System.out.println(graph.ShortestPath_BFS("4", "6"));

		WeightedGraph.Graph graph = new Graph(f);
		System.out.println(graph);
	}
}
