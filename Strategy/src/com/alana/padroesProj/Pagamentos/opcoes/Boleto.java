package com.alana.padroesProj.Pagamentos.opcoes;

import com.alana.padroesProj.Pagamentos.service.Pagamento;

public class Boleto implements Pagamento {

	public double calcularPrecoFinal(double preco) {
		return preco - (preco * 0.15 - 10);

	}
}
