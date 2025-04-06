package Sistema_Hotel;

public class Pagamento_pix extends Pagamento {
    public void Realiza_pagamento(double valor) {
        System.out.println("Processando pagamento no pix de R$" + valor);
    }
    public void Gera_recibo() {
        System.out.println("Pagamento concluído! Recibo Gerado.");
    }
}
