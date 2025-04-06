package Sistema_Hotel;

public class Pagamento_cartao extends Pagamento {
    public void Realiza_pagamento(double valor) {
        System.out.println("Processando pagamento no cartão de R$" + valor);
    }
    public void Gera_recibo() {
        System.out.println("Pagamento concluído! Recibo Gerado.");
    }
}
