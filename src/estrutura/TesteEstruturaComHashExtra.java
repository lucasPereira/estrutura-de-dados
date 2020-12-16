package estrutura;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TesteEstruturaComHashExtra {

	@Test
	void respostaBLucas3Guga2() {
		// lucas aparece três vezes
		List<String> palavras = Arrays.asList("Lucas", "Guga", "Lucas", "Lucas", "Pati", "Guga");

		Iterator<String> iteradorDePalavras = palavras.iterator();
		EstruturaComHashExtra estrutura = new EstruturaComHashExtra();

		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());

		Iterator<String> iteradorPalavrasQueMaisAparecem = estrutura.obterPalavrasQueMaisAparecem().iterator();
		assertEquals("Lucas", iteradorPalavrasQueMaisAparecem.next());
		assertFalse(iteradorPalavrasQueMaisAparecem.hasNext());
	}

	@Test
	void respostaBLucas2Guga2() {
		// guga parece duas e lucas duas vezes
		List<String> palavras = Arrays.asList("Guga", "Lucas", "Lucas", "Pati", "Guga");

		Iterator<String> iteradorDePalavras = palavras.iterator();
		EstruturaComConjuntoExtra estrutura = new EstruturaComConjuntoExtra();

		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());

		Iterator<String> iteradorPalavrasQueMaisAparecem = estrutura.obterPalavrasQueMaisAparecem().iterator();
		assertEquals("Lucas", iteradorPalavrasQueMaisAparecem.next());
		assertEquals("Guga", iteradorPalavrasQueMaisAparecem.next());
		assertFalse(iteradorPalavrasQueMaisAparecem.hasNext());
	}
}
