
public class Bibioteca {
	public static void main(String[] args) {
		Livro l1,l2,l3;
		
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		
		l1.setTitulo("Java Basico");
		l1.setAutor("Isidro");
		l1.setAnoPublicacao(2020);
		l1.setCategoria("Informatica");
		l1.setPosEstante(2);
		l1.setPosPrateleira(1);
		l1.emprestar();
		
		l2.setTitulo("Barcos de Papel");
		l2.setAutor("Clayton");
		l2.setAnoPublicacao(2018);
		l2.setCategoria("Romance");
		l2.setPosEstante(5);
		l2.setPosPrateleira(2);
		l2.devoler();
		
		l3.setTitulo("o Codigo da Morte");
		l3.setAutor("Joao");
		l3.setAnoPublicacao(2018);
		l3.setCategoria("Terror");
		l3.setPosEstante(5);
		l3.setPosPrateleira(2);
		l3.emprestar();
		
		l1.exibirInfo();
		l2.exibirInfo();
		l3.exibirInfo();
		
		
	}
}
