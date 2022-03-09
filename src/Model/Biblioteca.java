package Model;

import java.util.ArrayList;

import Controller.BibliotecaController;

public class Biblioteca {
	
	
	public ArrayList<BibliotecaController> filmedeficcao = new ArrayList<BibliotecaController>();
	public ArrayList<BibliotecaController> filmedeterror = new ArrayList<BibliotecaController>(); 
	public ArrayList<BibliotecaController> filmedeaventura = new ArrayList<BibliotecaController>(); 
	
	
	private Livros comportamento;

	public void setComportamento(Livros comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.getlivros();
	}
	
	
	
private static Biblioteca instancia = new Biblioteca();
	
	private Biblioteca() {
		super();
	}
	
	
	
	public ArrayList<BibliotecaController> getFilmedeficcao() {
		return filmedeficcao;
	}



	public ArrayList<BibliotecaController> getFilmedeaventura() {
		return filmedeaventura;
	}



	public ArrayList<BibliotecaController> getFilmedeterror() {
		return filmedeterror;
	}



	public void setFilmedeaventura(BibliotecaController livro) {
		this.filmedeaventura.add(livro);
	}



	public void setFilmedeficcao(BibliotecaController livro) {
		this.filmedeficcao.add(livro);
	}



	public void setFilmedeterror(BibliotecaController livro) {
		this.filmedeterror.add(livro);
	}

	public static Biblioteca getInstancia() {
		return instancia;

	}



	

}
