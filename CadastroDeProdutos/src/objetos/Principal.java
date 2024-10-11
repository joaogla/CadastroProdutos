package objetos;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		executar();
	}
		
	public static void exibirMenu() {
		System.out.println("[1] Cadastrar produto");
		System.out.println("[2] Mostrar produtos");
		System.out.println("[3] Sair do programa");
	}
	
	public static void executar() {
		Scanner scan = new Scanner(System.in);
		Cadastros cadastro = new Cadastros();
		
		while(true) {
			exibirMenu();
			int opcao = scan.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Nome do produto: ");
				String nome = scan.next();
				System.out.println("Preço do produto: ");
				double preco = scan.nextDouble();
				System.out.println("Quantidade de produtos: ");
				int quantidade = scan.nextInt();
				System.out.println();
				Produtos produto = new Produtos(nome, preco, quantidade);
				cadastro.cadastroProduto(produto);
				break;
			case 2:
				cadastro.mostrarProdutos();
				System.out.println();
				break;
            case 3:
                System.out.println("Saindo do sistema. Até logo!");
                scan.close();
                return;

            default:
                System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

}

