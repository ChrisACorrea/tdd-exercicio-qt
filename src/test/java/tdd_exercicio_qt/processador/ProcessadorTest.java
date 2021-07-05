package tdd_exercicio_qt.processador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import tdd_exercicio_qt.boleto.Boleto;
import tdd_exercicio_qt.fatura.Fatura;
import tdd_exercicio_qt.pagamento.Pagamento;

public class ProcessadorTest {
	
	@Test
	public void testFaturaPagaCaso01() {
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
		assertEquals(3, fatura.getQuantidadePagamentos());
		assertTrue(fatura.getPagamentos().stream().allMatch(pagamento -> pagamento.getTipoPagamento().equalsIgnoreCase("BOLETO")));

	}

	@Test
	public void testFaturaPagaCaso02() {
		Processador processador = new Processador();

		Fatura fatura = new Fatura(LocalDate.now().minusDays(5), 1500.00, "João");
		List<Boleto> boletos = new ArrayList<>();
		Boleto boleto01 = new Boleto("ABC123XYZ", LocalDate.now(), 1000.00);
		Boleto boleto02 = new Boleto("ABC456XYZ", LocalDate.now(), 500.00);
		Boleto boleto03 = new Boleto("ABC789XYZ", LocalDate.now(), 250.00);
		boletos.add(boleto01);
		boletos.add(boleto02);
		boletos.add(boleto03);

		processador.processarBoletos(fatura, boletos);
		
		assertTrue(fatura.isPago());
		assertEquals(3, fatura.getQuantidadePagamentos());
		assertTrue(fatura.getPagamentos().stream().allMatch(pagamento -> pagamento.getTipoPagamento().equalsIgnoreCase("BOLETO")));

	}

	@Test
	public void testFaturaPagaCaso03() {
		Processador processador = new Processador();

		Fatura fatura = new Fatura(LocalDate.now().minusDays(5), 2000.00, "João");
		List<Boleto> boletos = new ArrayList<>();
		Boleto boleto01 = new Boleto("ABC123XYZ", LocalDate.now(), 500.00);
		Boleto boleto02 = new Boleto("ABC456XYZ", LocalDate.now(), 400.00);
		boletos.add(boleto01);
		boletos.add(boleto02);

		processador.processarBoletos(fatura, boletos);
		
		assertFalse(fatura.isPago());
		assertEquals(2, fatura.getQuantidadePagamentos());
		assertTrue(fatura.getPagamentos().stream().allMatch(pagamento -> pagamento.getTipoPagamento().equalsIgnoreCase("BOLETO")));

	}
}
