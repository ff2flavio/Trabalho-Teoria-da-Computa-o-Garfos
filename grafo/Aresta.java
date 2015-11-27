
package entidade;

public class Aresta {

	private Double peso;
	private Vertice verticeOrigem;
	private Vertice verticeDestino;
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Vertice getVerticeOrigem() {
		return verticeOrigem;
	}
	public void setVerticeOrigem(Vertice verticeOrigem) {
		this.verticeOrigem = verticeOrigem;
	}
	public Vertice getVerticeDestino() {
		return verticeDestino;
	}
	public void setVerticeDestino(Vertice verticeDestino) {
		this.verticeDestino = verticeDestino;
	}
}
