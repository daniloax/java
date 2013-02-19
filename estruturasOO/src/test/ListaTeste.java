package test;

import model.Lista;

import org.junit.Assert;
import org.junit.Test;


public class ListaTeste {

	@Test
	public void construir() {
		
		Lista lista = new Lista();
		Assert.assertNotNull(lista);
		
	}

	@Test
	public void inserir() {
		
		Lista lista = new Lista();
		lista.inserir('A');
		Assert.assertTrue(lista.procurar('A'));
		
	}

	public void procurar() {
		// TODO Auto-generated method stub
	}

	public void raiz() {
		// TODO Auto-generated method stub
	}

	public void remover() {
		// TODO Auto-generated method stub
	}

	public void ler() {
		// TODO Auto-generated method stub
	}

}
