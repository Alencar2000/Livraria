package View;

import java.io.InputStream;
import java.util.Scanner;

import Controller.BibliotecaController;
import Model.Biblioteca;



public class Main {

	public static void main(String[] args) {
		
		BibliotecaController livro = BibliotecaController.getInstancia();
		Biblioteca biblioteca = Biblioteca.getInstancia();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int menu;
		do {
			System.out.println();
			System.out.println(" 1- Adicionar Livros");
			System.out.println(" 2- Listar Livros por genero ");
			System.out.println(" 3- Vender");
			menu = sc.nextInt();
			switch (menu) {

			case 1:
				int menuCliente;
				do {
					System.out.println(" 1- Adicionar Livro ficcao");
					System.out.println(" 2- Adicionar Livro aventura");
					System.out.println(" 3- Adicionar Livro terror");


					menuCliente = sc.nextInt();

					switch (menuCliente) {
					case 1:
						BibliotecaController livroficcao = BibliotecaController.getInstancia();
						livroficcao.adicionarlivro(livroficcao);
						biblioteca.setFilmedeficcao(livroficcao);
						break;
					case 2:
						BibliotecaController livroaventura = BibliotecaController.getInstancia();
						livroaventura.adicionarlivro(livroaventura);
						biblioteca.setFilmedeficcao(livroaventura);
						break;
					case 3:
						BibliotecaController livroterror = BibliotecaController.getInstancia();
						livroterror.adicionarlivro(livroterror);
						biblioteca.setFilmedeficcao(livroterror);
						
						break;
					}
				} while (menuCliente != 0);
				break;
			case 2:
				System.out.println("1 - Listar livros ficção");
				System.out.println("2 - Listar livros aventura");
				System.out.println("3 - Listar livros terror");

				int menuBanco = sc.nextInt();
				do {

					switch (menuBanco) {

					case 1:
					

						break;
					case 2:
						
						break;
						
					case 3:

						
						break;

					}
					break;
				} while (menuBanco != 0);

				break;
			case 3:
				System.out.println("1 - Extrato conta corrente");
				System.out.println("1 - Extrato conta poupança");

				int menuExtrato = sc.nextInt();
				do {

					switch (menuExtrato) {
						
					case 1:
						

						break;
						
					case 2:
						
						
						break;

					}
					break;
				} while (menuExtrato != 0);

				break;

			case 0:
				return;

			}
		} while (menu != 0);

	}

	

}
