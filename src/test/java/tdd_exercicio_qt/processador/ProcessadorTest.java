package tdd_exercicio_qt.processador;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import tdd_exercicio_qt.boleto.Boleto;
import tdd_exercicio_qt.fatura.Fatura;

public class ProcessadorTest {
	
	@Test
	public void testFaturaPaga() {
		Processador processador = new Processador();

		Fatura fatura = new Fatura(LocalDate.now().minusDays(5), 1500.00, "João");
		List<Boleto> boletos = new ArrayList<>();
		Boleto boleto01 = new Boleto("ABC123XYZ", LocalDate.now(), 500.00);
		Boleto boleto02 = new Boleto("ABC456XYZ", LocalDate.now(), 400.00);
		Boleto boleto03 = new Boleto("ABC789XYZ", LocalDate.now(), 600.00);
		boletos.add(boleto01);
		boletos.add(boleto02);
		boletos.add(boleto03);

		processador.processarBoletos(fatura, boletos);
		
		assertTrue(fatura.isPago());
	}
}
