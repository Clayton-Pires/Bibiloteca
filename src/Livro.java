
public class Livro {
	private String titulo;
	private String autor;
	private String categoria;
	private int anoPublicacao;
	private int posEstante;
	private int posPrateleira;
	private boolean emprestado;
	
	
	public void exibirInfo() {
		System.out.println("==================================");
		System.out.println("Livro = "+ titulo);
		System.out.println("Autor = "+ autor);
		System.out.println("Ano   = "+ anoPublicacao);
		System.out.println("Categoria = "+ categoria);
		System.out.println("Posição = " + posEstante + " " + posPrateleira);
		System.out.println("Disponibilidade = "+ emprestado);
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getPosEstante() {
		return posEstante;
	}

	public void setPosEstante(int posEstante) {
		this.posEstante = posEstante;
	}

	public int getPosPrateleira() {
		return posPrateleira;
	}

	public void setPosPrateleira(int posPrateleira) {
		this.posPrateleira = posPrateleira;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void emprestar() {
		emprestado = true;
	}
	public void devoler() {
		emprestado = false;
	}
}
