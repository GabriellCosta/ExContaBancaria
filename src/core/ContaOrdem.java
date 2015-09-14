package core;

import java.math.BigDecimal;

/**
 * @author Gabriel
 *
 */
public class ContaOrdem extends Conta {

	private static final BigDecimal LIMITE_DESCOBERTA = new BigDecimal("500.00");

	public ContaOrdem() {
		this.setJuros(new BigDecimal("0.01"));
		setNomeConta("Conta Ordem");

	}

	@Override
	public void valorValidoDeposito(BigDecimal valor) throws IllegalArgumentException {
	}

	/*
	 * Implementaçõ não condiz
	 */
	@Override
	protected void atulaizarJuros() {

	}

	@Override
	public boolean getLDN(BigDecimal valor) {

		if (this.getSaldo().add(LIMITE_DESCOBERTA).compareTo(valor) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean valorValidoSaque(BigDecimal valor) throws IllegalArgumentException {

		if (getLDN(valor)) {
			return true;
		} else {
			throw new IllegalArgumentException();
		}
	}

}
