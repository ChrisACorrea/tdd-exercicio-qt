package tdd_exercicio_qt.fatura;

import java.time.LocalDate;

public class Fatura {
	private LocalDate data;
	private Double valorTotal;
	private String nomeDoCliente;
	private boolean pago;

	public Fatura(LocalDate data, Double valorTotal, String nomeDoCliente) {
		this.data = data;
		this.valorTotal = valorTotal;
		this.nomeDoCliente = nomeDoCliente;
	}

	public LocalDate getData() {
		return this.data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNomeDoCliente() {
		return this.nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public boolean isPago() {
		return this.pago;
	}

	public boolean getPago() {
		return this.pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

}
