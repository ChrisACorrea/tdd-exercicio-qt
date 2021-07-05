package tdd_exercicio_qt.boleto;

import java.time.LocalDate;

public class Boleto {
	private String codigo;
	private LocalDate data;
	private Double valorPago;

	public Boleto(String codigo, LocalDate data, Double valorPago) {
		this.codigo = codigo;
		this.data = data;
		this.valorPago = valorPago;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getData() {
		return this.data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorPago() {
		return this.valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

}
