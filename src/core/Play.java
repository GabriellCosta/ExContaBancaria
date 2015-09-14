package core;

import java.util.ArrayList;
import java.util.List;

public class Play {

	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(new ContaOrdem());
		contas.get(0).depositar(100);

		contas.add(new ContaOrdem());
		contas.get(1).depositar(1000.0);
		contas.get(1).sacar(1500.01);

		contas.add(new ContaPrazo());
		contas.get(2).depositar(1000.0);

		contas.add(new ContaOrdem());
		contas.get(3).depositar(5000.0);

		contas.add(new ContaPrazo());
		contas.get(4).depositar(5000.0);
		
		contas.add(new ContaPoupanca());
		contas.get(5).depositar(3000.0);

		for (Conta conta : contas) {
			System.out.println(conta);
		}

	}

}
