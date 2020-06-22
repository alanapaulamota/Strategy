package com.alana.padroesProj.Pagamentos.service;

import com.alana.padroesProj.Pagamentos.opcoes.Boleto;
import com.alana.padroesProj.Pagamentos.opcoes.CartaoCredito;

public enum TipoPagamento {

	BOLETO {
		@Override
		public Pagamento obterPreco() {
			return new Boleto();
		}
	},
	CARTAOCREDITO {
		@Override
		public Pagamento obterPreco() {
			return new CartaoCredito();
		}
	};

	public abstract Pagamento obterPreco();

}