package core;

import java.math.BigDecimal;
import java.text.NumberFormat;

public final class ContaUtils {

	public static final BigDecimal MIL = new BigDecimal("1000");
	public static final BigDecimal DOIS_MIL = new BigDecimal("2000");

	private ContaUtils() {
	}

	public static String formataMoeda(BigDecimal valor) {
		return NumberFormat.getCurrencyInstance().format(valor);
	}

}
