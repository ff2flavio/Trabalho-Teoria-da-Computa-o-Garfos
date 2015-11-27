package entidade;
import java.util.ArrayList;
import java.util.List;

public class Grafo {

	private List<Vertice> listaDeVertices;
	private List<Aresta> listaDeArestas;
	private boolean direcionado;
	private boolean possuiPeso;
	private List<Comando> listaDeComandos;
	
	
	public Vertice getVerticeById(String id){
		for (Vertice vertice : listaDeVertices) {
			if(vertice.getId().equals(id)){
				return vertice;
			}
		}
		
		return null;
	}
	
	
	
	
	
	

	public List<Vertice> getListaDeVertices() {
		if(listaDeVertices == null){
			this.listaDeVertices = new ArrayList<Vertice>();
		}
		return listaDeVertices;
	}

	public void setListaDeVertices(List<Vertice> listaDevertices) {
		this.listaDeVertices = listaDevertices;
	}

	public List<Aresta> getListaDeArestas() {
		if(listaDeArestas == null){
			this.listaDeArestas = new ArrayList<Aresta>();
		}
		return listaDeArestas;
	}

	public void setListaDeArestas(List<Aresta> listaDeArestas) {
		this.listaDeArestas = listaDeArestas;
	}

	public boolean isDirecionado() {
		return direcionado;
	}

	public void setDirecionado(boolean direcionado) {
		this.direcionado = direcionado;
	}

	public boolean isPossuiPeso() {
		return possuiPeso;
	}

	public void setPossuiPeso(boolean possuiPeso) {
		this.possuiPeso = possuiPeso;
	}

	public List<Comando> getListaDeComandos() {
		if(listaDeComandos == null){
			this.listaDeComandos = new ArrayList<Comando>();
		}
		return listaDeComandos;
	}

	public void setListaDeComandos(List<Comando> listaDeComandos) {
		this.listaDeComandos = listaDeComandos;
	}







	public Aresta getArestaByOrigemEDestino(Vertice verticeOrigem,
			Vertice verticeDestino) {
		
		for (Aresta aresta : listaDeArestas) {
			if(aresta.getVerticeOrigem().equals(verticeOrigem) && 
					aresta.getVerticeDestino().equals(verticeDestino)){
				return aresta;
			}
		}
		return null;
	}







	public List<Vertice> getVerticesVizinhos(Vertice vertice) {
		List<Vertice> verticesVizinhos = new ArrayList<Vertice>();
		for (Aresta aresta : listaDeArestas) {
			if(aresta.getVerticeOrigem().equals(vertice)){
				verticesVizinhos.add(aresta.getVerticeDestino());
			}
		}
		return verticesVizinhos;
	}

}
