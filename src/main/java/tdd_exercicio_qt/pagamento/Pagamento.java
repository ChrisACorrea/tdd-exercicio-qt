package tdd_exercicio_qt.pagamento;

import java.time.LocalDate;

public class Pagamento {
	private Double valorPago;
	private LocalDate data;
	private String tipoPagamento;


	public Pagamento(Double valorPago, LocalDate data, String tipoPagamento) {
		this.valorPago = valorPago;
		this.data = data;
		this.tipoPagamento = tipoPagamento;
	}


	public Double getValorPago() {
		return this.valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public LocalDate getData() {
		return this.data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTipoPagamento() {
		return this.tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
