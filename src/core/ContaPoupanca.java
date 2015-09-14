package core;

import java.math.BigDecimal;

public class ContaPoupanca extends ContaPrazo {
	
	public ContaPoupanca() {
		setNomeConta("Conta Poupança");
	}

	@Override
	public void valorValidoDeposito(BigDecimal valor) throws IllegalArgumentException {
		// TODO Auto-generated method stub

		if (valor.remainder(ContaUtils.MIL).compareTo(BigDecimal.ZERO) != 0) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	protected void atulaizarJuros() {
		// TODO Auto-generated method stub
		super.atulaizarJuros();

		if (this.getSaldo().compareTo(ContaUtils.MIL) == 1 && this.getSaldo().compareTo(ContaUtils.DOIS_MIL) == -1) {
			this.setJuros(new BigDecimal("0.025"));
		}

	}

}
