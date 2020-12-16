package estrutura;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class EstruturaComHashExtra {
	private Map<String, Integer> tabela; // tabela hash indexada pela palavra que leva ao contador
	private Map<Integer, Set<String>> auxiliar; // tabela hash indexada pelo contador que leva à um conjunto de palavras com aquele contador
	private Integer quantidadeDaPalavraQueMaisAparece;

	public EstruturaComHashExtra() {
		tabela = new Hashtable<>();
		auxiliar = new Hashtable<>();
		quantidadeDaPalavraQueMaisAparece = 0;
	}

	public void registrar(String palavra) {
		Integer quantidadeNova;
		Integer quantidadeAntiga;
		if (tabela.containsKey(palavra)) {
			quantidadeAntiga = tabela.get(palavra);
			quantidadeNova = quantidadeAntiga + 1;
			tabela.put(palavra, quantidadeNova);
		} else {
			quantidadeAntiga = 0;
			quantidadeNova = 1;
			tabela.put(palavra, 1);
		}
		if (quantidadeNova > quantidadeDaPalavraQueMaisAparece) {
			quantidadeDaPalavraQueMaisAparece = quantidadeNova;
		}
		if (!auxiliar.containsKey(quantidadeAntiga)) {
			auxiliar.put(quantidadeAntiga, new HashSet<String>());
		}
		if (!auxiliar.containsKey(quantidadeNova)) {
			auxiliar.put(quantidadeNova, new HashSet<String>());
		}
		auxiliar.get(quantidadeAntiga).remove(palavra);
		auxiliar.get(quantidadeNova).add(palavra);
	}

	public Set<String> obterPalavrasQueMaisAparecem() {
		return auxiliar.get(quantidadeDaPalavraQueMaisAparece);
	}

	public Integer contar(String palava) {
		return tabela.get(palava);
	}

	public void imprimir() {
		System.out.println(tabela);
	}
}
