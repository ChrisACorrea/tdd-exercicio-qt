package tdd_exercicio_qt.processador;

import java.time.LocalDate;
import java.util.List;

import tdd_exercicio_qt.boleto.Boleto;
import tdd_exercicio_qt.fatura.Fatura;
import tdd_exercicio_qt.pagamento.Pagamento;

public class Processador {

	public void processarBoletos(Fatura fatura, List<Boleto> boletos) {
		Double somaBoletos = 0.0;
		
		for (Boleto boleto : boletos) {
			somaBoletos += boleto.getValorPago();
			Pagamento pagamento = new Pagamento(boleto.getValorPago(), LocalDate.now(), "BOLETO");
			fatura.getPagamentos().add(pagamento);
		}

		if (somaBoletos >= fatura.getValorTotal()) {
			fatura.setPago(true);
		}
	}
	
}
