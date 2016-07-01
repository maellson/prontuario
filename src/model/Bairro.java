package model;

public class Bairro {

	private int idBairro;
	private String nomeBairro;
	private Cidade cidade;
	
	public int getIdBairro() {
		return idBairro;
	}
	public void setIdBairro(int idBairro) {
		this.idBairro = idBairro;
	}
	public String getNomeBairro() {
		return nomeBairro;
	}
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
