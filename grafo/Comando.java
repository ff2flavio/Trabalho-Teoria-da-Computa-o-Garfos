package entidade;

import java.util.ArrayList;
import java.util.List;

public class Comando {

	private String nome;
	private String linhaOriginal;
	private List<Vertice> listaDeVertices;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Vertice> getListaDeVertices() {
		if(listaDeVertices == null){
			this.listaDeVertices = new ArrayList<Vertice>();
		}
		return listaDeVertices;
	}

	public void setListaDeVertices(List<Vertice> listaDeVertices) {
		this.listaDeVertices = listaDeVertices;
	}

	public String getLinhaOriginal() {
		return linhaOriginal;
	}

	public void setLinhaOriginal(String linhaOriginal) {
		this.linhaOriginal = linhaOriginal;
	}
}
