package estrutura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TesteEstrutura {

	@Test
	void respostaA() {
		List<String> palavras = Arrays.asList("Lucas", "Guga", "Lucas", "Lucas", "Pati", "Guga");

		Iterator<String> iteradorDePalavras = palavras.iterator();
		Estrutura estrutura = new Estrutura();

		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.registrar(iteradorDePalavras.next());
		estrutura.imprimir();

		assertEquals(1, estrutura.contar("Pati"));
		assertEquals(2, estrutura.contar("Guga"));
		assertEquals(3, estrutura.contar("Lucas"));
	}

}
