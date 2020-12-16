package estrutura;

import java.util.Hashtable;
import java.util.Map;

public class Estrutura {
	private Map<String, Integer> tabela; // tabela hash indexada pela palavra que leva ao contador

	public Estrutura() {
		tabela = new Hashtable<>();
	}

	public void registrar(String palavra) {
		if (tabela.containsKey(palavra)) {
			Integer quantidadeAntiga = tabela.get(palavra);
			tabela.put(palavra, quantidadeAntiga + 1);
		} else {
			tabela.put(palavra, 1);
		}
	}

	public Integer contar(String palava) {
		return tabela.get(palava);
	}

	public void imprimir() {
		System.out.println(tabela);
	}
}
