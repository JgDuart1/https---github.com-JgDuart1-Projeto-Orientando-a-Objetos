package Sistema_Hotel;

public class Saida {
    private Reserva reservista;
    
    public Saida(Reserva R1) {
        reservista = R1;
    }

    public void Notifica_Saida() {
        System.out.println(reservista.getNome() + " saiu do Hotel.");
    }
}
