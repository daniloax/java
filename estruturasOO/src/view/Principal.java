package view;

import model.Lista;

public class Principal {
	
	public static void main(String[] args) {
		
		Lista lista_a = new Lista();
		lista_a.construir();
		lista_a.ler();
		lista_a.inserir('B');
		lista_a.ordenar();
		lista_a.ler();
		System.out.printf("%s\n", lista_a.procurar('A'));
		System.out.printf("%s\n", lista_a.raiz());
		lista_a.remover('B');
		lista_a.ler();
		
		Lista lista_b = new Lista();
		lista_b.construir();
		lista_b.ler();
		
		Lista lista_c = new Lista();
		lista_c.concatenar(lista_a, lista_b);
		lista_c.ler();
		lista_c.ordenar();
		lista_c.ler();
		
	}

}
