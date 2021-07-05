package tdd_exercicio_qt.processador;

import java.util.List;

import tdd_exercicio_qt.boleto.Boleto;
import tdd_exercicio_qt.fatura.Fatura;

public class Processador {

	public void processarBoletos(Fatura fatura, List<Boleto> boletos) {
		fatura.setPago(true);
	}
	
}
