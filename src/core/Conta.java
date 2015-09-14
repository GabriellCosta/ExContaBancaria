package core;

import java.math.BigDecimal;

public abstract class Conta implements LimiteDescobertoNegociavel {

	private BigDecimal juros = new BigDecimal(0);
	private BigDecimal saldo = new BigDecimal(0);
	private String nomeConta;
	
	private static long id;
	private final long contaID = id++;

	public BigDecimal getJuros() {
		return juros;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	private boolean validacaoBasica(BigDecimal valor) {

		boolean result = false;

		if (valor.compareTo(BigDecimal.ZERO) == -1) {
			throw new IllegalArgumentException();
		} else {
			result = true;
		}

		return result;
	}

	public void depositar(double valor) {
		this.depositar(new BigDecimal(valor));
	}

	public void depositar(BigDecimal valor) {

		try {

			this.validacaoBasica(valor);
			this.valorValidoDeposito(valor);
			this.setSaldo(getSaldo().add(valor));
			this.atulaizarJuros();
		} catch (IllegalArgumentException exp) {
			System.err.println(getNomeConta() + " " + contaID + " | Valor invalido a ser depositado: "
					+ ContaUtils.formataMoeda(valor));
		}

	}

	public BigDecimal sacar(BigDecimal valor) {

		BigDecimal result = null;

		try {
			this.validacaoBasica(valor);
			this.valorValidoSaque(valor);
			this.setSaldo(this.getSaldo().subtract(valor));
			result = valor;
			this.atulaizarJuros();
		} catch (IllegalArgumentException exp) {
			System.err.println(getNomeConta() + " " + contaID + " | Valor invalido a ser Sacado: "
					+ ContaUtils.formataMoeda(valor));
		}

		return result;
	}

	public BigDecimal sacar(double sacar) {
		return this.sacar(new BigDecimal(sacar));
	}

	public abstract void valorValidoDeposito(BigDecimal valor) throws IllegalArgumentException;

	public abstract boolean valorValidoSaque(BigDecimal valor) throws IllegalArgumentException;

	protected abstract void atulaizarJuros();

	@Override
	public String toString() {
		return getNomeConta() + " " + contaID + ", saldo: " + ContaUtils.formataMoeda(this.getSaldo()) + ", juros: "
				+ ContaUtils.formataMoeda((this.getSaldo().multiply(this.getJuros())));
	}

	public void setJuros(BigDecimal juros) {
		this.juros = juros;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

}
