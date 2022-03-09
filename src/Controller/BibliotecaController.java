package Controller;

import java.util.Scanner;


public class BibliotecaController {
	public static int numconstantelivro = 0;

	public String titulo;
	public String Author;
	public int iD;

	private static BibliotecaController instancia = new BibliotecaController();
	
	private BibliotecaController() {
		super();
	}
	
	public static BibliotecaController getInstancia() {
		return instancia;
	}
	public  BibliotecaController adicionarlivro(BibliotecaController livro) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o titulo do livro: ");
		String titulo = sc.nextLine();
		livro.setTitulo(titulo);
		System.out.println("Digite o nome do author: ");
		String Author = sc.nextLine();
		livro.setAuthor(Author);
		numconstantelivro += numconstantelivro + 1;
		livro.setiD(numconstantelivro);
		
		
		return livro;
	}
	
	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public void setAuthor(String author) {
		Author = author;
	}
}