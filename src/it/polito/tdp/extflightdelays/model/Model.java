package it.polito.tdp.extflightdelays.model;

import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import it.polito.tdp.extflightdelays.ExtFlightDelaysController;
import it.polito.tdp.extflightdelays.db.ExtFlightDelaysDAO;

public class Model {
	
	private List<String> stati;
	private List<Tratta> tratte;
	private ExtFlightDelaysDAO dao;
	
	private Graph <String, DefaultWeightedEdge>grafo;
	
	public Model() {
		this.dao= new ExtFlightDelaysDAO();
		this.stati = dao.loadAllStates();
		this.tratte = dao.calcolaArchi();
		
	}
	
	public void creaGrafo() {
		
		this.grafo = new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge >(DefaultWeightedEdge.class);
		
		Graphs.addAllVertices(this.grafo, this.stati);
		
		for(Tratta t : tratte) {
			

				Graphs.addEdge(this.grafo, t.getS1(), t.getS2(), t.getVelivoli());
		}
		
		System.out.println("Graphs vertex set: " + grafo.vertexSet().size());
		System.out.println("Graphs edge set: " + grafo.edgeSet().size());
	}

}
