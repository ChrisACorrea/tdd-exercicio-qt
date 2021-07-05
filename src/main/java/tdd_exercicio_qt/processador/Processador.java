package tdd_exercicio_qt.processador;

import java.util.List;

import tdd_exercicio_qt.boleto.Boleto;
import tdd_exercicio_qt.fatura.Fatura;

public class Processador {

	public void processarBoletos(Fatura fatura, List<Boleto> boletos) {
		Double somaBoletos = 0.0;
		
		for (Boleto boleto : boletos) {
			somaBoletos += boleto.getValorPago();
		}

		if (somaBoletos >= fatura.getValorTotal()) {
			fatura.setPago(true);
		}
	}
	
}
