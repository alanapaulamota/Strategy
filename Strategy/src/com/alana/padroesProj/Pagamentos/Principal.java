package com.alana.padroesProj.Pagamentos;

import java.util.Scanner;

import com.alana.padroesProj.Pagamentos.service.Pagamento;
import com.alana.padroesProj.Pagamentos.service.TipoPagamento;

public class Principal {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe o preco: ");
			int preco = entrada.nextInt();
			System.out.print("Qual o tipo de pagamento [1] Boleto, [2] Cartao de credito: ");
			int opcaoPagamento = entrada.nextInt();
			TipoPagamento tipoPagamento = TipoPagamento.values()[opcaoPagamento - 1];

			Pagamento pagamento = tipoPagamento.obterPreco();
			double valorFinal = pagamento.calcularPrecoFinal(preco);
			System.out.printf("O valor total da compra eh R$%.2f", valorFinal);
		}
	}

}