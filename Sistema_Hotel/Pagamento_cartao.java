package Sistema_Hotel;

public class Pagamento_cartao extends Pagamento { // desenvolvimento de uma das formas de pagamento
    public void Realiza_pagamento(double valor, Reserva reservista) {
        System.out.println("Processando pagamento de " + reservista.getNome() + " no cartão, no valor de R$" + valor);
    }
    public void Gera_recibo() {
        System.out.println("Pagamento concluído! Recibo Gerado.");
    }
}
