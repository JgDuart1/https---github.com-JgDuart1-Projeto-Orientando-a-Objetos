package Sistema_Hotel;

public class Sistema_Reserva_Hotel {
    public static void main(String[] args) {
        Pagamento pagamento_cartao = new Pagamento_cartao(); // Inicializando as 3 formas de pagamento para seu possivel uso posteriormente.
        Pagamento pagamento_pix = new Pagamento_pix();
        Pagamento pagamento_dinheiro = new Pagamento_dinheiro();

        Reserva R1 = new Reserva("Lucio", "09099912319", 5);
        Entrada entrada_R1 = new Entrada(R1);
        Saida saida_R1 = new Saida(R1);
        Calcula_conta conta_do_R1 = new Calcula_conta(R1);

        Reserva R2 = new Reserva("Alex", "09321321332", 10);
        Entrada entrada_R2 = new Entrada(R2);
        Saida saida_R2 = new Saida(R2);
        Calcula_conta conta_do_R2 = new Calcula_conta(R2);

        R1.Realizar_Reserva();
        saida_R1.Notifica_Saida();
        entrada_R1.Notifica_Entrada();
        conta_do_R1.Calcula_Preço_Final();

        R2.Realizar_Reserva(); // realizada a reserva do hospede 2.

        Reserva.getHospedes(); // mostra quantos hospedes há no hotel atualmente.

        pagamento_cartao.Realiza_pagamento(conta_do_R1.getPreçoFinal(), R1); // pagamento do primeiro hospede realizado.
        pagamento_cartao.Gera_recibo();
        R1.Finalizou_reserva(); // não está mais no Hotel.

        Reserva.getHospedes();

        pagamento_pix.Realiza_pagamento(conta_do_R2.getPreçoFinal(), R2); // pagamento do segundo hospede realizado.
        pagamento_pix.Gera_recibo();
        R2.Finalizou_reserva();
        Reserva.getHospedes(); // não há mais hospedes no hotel.

        Reserva R3 = new Reserva("cristina", "08718988610", 4);
        R3.Realizar_Reserva();
        R3.Cancelar_Reserva(); // cancelou a reserva.
    }
}