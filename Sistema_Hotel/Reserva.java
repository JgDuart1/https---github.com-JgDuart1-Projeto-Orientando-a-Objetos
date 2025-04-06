package Sistema_Hotel;

public class Reserva extends Hospede {
    public Reserva(String nome, String CPF) {
        super(nome, CPF);
    }

    public void Realizar_Reserva() {
        System.out.println(getNome() + " teve sua reserva realizada com sucesso!");
    }

    public void Cancelar_Reserva() {
        System.out.println(getNome() + " teve sua reserva cancelada com sucesso!");
    }
}
