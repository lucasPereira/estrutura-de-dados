package estrutura;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class EstruturaComConjuntoExtra {
	private Map<String, Integer> tabela; // tabela hash indexada pela palavra que leva ao contador
	private Set<String> palavrasQueMaisAparecem; // set usado para armazenar uma única vez cada palavra que mais aparece
	private Integer quantidadeDaPalavraQueMaisAparece;

	public EstruturaComConjuntoExtra() {
		tabela = new Hashtable<>();
		palavrasQueMaisAparecem = new HashSet<>();
		quantidadeDaPalavraQueMaisAparece = 0;
	}

	public void registrar(String palavra) {
		Integer quantidadeNova;
		if (tabela.containsKey(palavra)) {
			Integer quantidadeAntiga = tabela.get(palavra);
			quantidadeNova = quantidadeAntiga + 1;
			tabela.put(palavra, quantidadeNova);
		} else {
			quantidadeNova = 1;
			tabela.put(palavra, 1);
		}
		if (quantidadeNova > quantidadeDaPalavraQueMaisAparece) {
			palavrasQueMaisAparecem.clear();
			palavrasQueMaisAparecem.add(palavra);
			quantidadeDaPalavraQueMaisAparece = quantidadeNova;
		} else if (quantidadeNova == quantidadeDaPalavraQueMaisAparece) {
			palavrasQueMaisAparecem.add(palavra);
		}
	}

	public Integer contar(String palava) {
		return tabela.get(palava);
	}

	public Set<String> obterPalavrasQueMaisAparecem() {
		return palavrasQueMaisAparecem;
	}

	public void imprimir() {
		System.out.println(tabela);
	}
}
