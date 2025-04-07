package Sistema_Hotel;

public class Entrada {      // registra a entrada rotineira do hospede no hotel.
    private Reserva reservista;
    
    public Entrada(Reserva R1) {
        reservista = R1;
    }

    public void Notifica_Entrada() {
        System.out.println(reservista.getNome() + " entrou no Hotel.");
    }
}
