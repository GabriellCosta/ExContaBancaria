package core;

import java.math.BigDecimal;

public class ContaPrazo extends Conta {

	private static final BigDecimal JUROS_2 = new BigDecimal("2000");

	public ContaPrazo() {
		setNomeConta("Conta Prazo");
	}

	@Override
	public void valorValidoDeposito(BigDecimal valor) throws IllegalArgumentException {

		if (valor.compareTo(ContaUtils.MIL) <= 0) {
			throw new IllegalArgumentException();
		}

	}

	@Override
	protected void atulaizarJuros() {

		if (this.getSaldo().compareTo(JUROS_2) == -1) {
			this.setJuros(new BigDecimal("0.02"));
		} else {
			this.setJuros(new BigDecimal("0.03"));
		}

	}

	@Override
	public boolean getLDN(BigDecimal valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean valorValidoSaque(BigDecimal valor) throws IllegalArgumentException {
		boolean result = false;

		if (this.getSaldo().subtract(valor).compareTo(BigDecimal.ZERO) >= 0) {
			result = true;
		} else {
			throw new IllegalArgumentException();
		}

		return result;
	}

}
