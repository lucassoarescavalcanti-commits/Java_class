class Pagamento {
	public void processarPagamento() {
		System.out.println("processando pagamento. . .");
	}
}

class PagamentoBoleto extends Pagamento {

	public void processarPagamento() {
		System.out.println("Processando pagamento em boleto. . .");
	}
}

class PagamentoCartao extends Pagamento {
	public void processarPagamento() {
		System.out.println("Processando pagamento pela forma de pagamento: Cartão de crédito. . . ");
	}
}