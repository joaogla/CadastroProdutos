package objetos;

import java.util.ArrayList;
import java.util.List;

public class Cadastros {
	
	private List<Produtos> listadeprodutos;
	
	public Cadastros() {
		this.listadeprodutos = new ArrayList<Produtos>();
	}
	
	public void cadastroProduto(Produtos produto){
		listadeprodutos.add(produto);
		System.out.println("Produto cadastrado com sucesso");
	}
	public void mostrarProdutos() {
		if(listadeprodutos.isEmpty()) {
			System.out.println("A lista está vazia!");
		}else {
			for (int i = 0; i < listadeprodutos.size(); i++) {
				System.out.println((i+1) + ". " + listadeprodutos.get(i).toString());
			}
		}
	}
}
