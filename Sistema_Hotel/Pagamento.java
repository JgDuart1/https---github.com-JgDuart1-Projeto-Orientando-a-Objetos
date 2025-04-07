package Sistema_Hotel;

public abstract class Pagamento { // classe abstrata que dará segmento para as formas de pagamento

    public abstract void Realiza_pagamento(double valor, Reserva reservista);
    public abstract void Gera_recibo();

}
