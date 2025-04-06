package Sistema_Hotel;

public class Reserva extends Hospede {
    private int dias;

    public Reserva() {};

    public Reserva(String nome, String CPF, int dias) {
        super(nome, CPF);
        this.dias = dias;
    }

    public void Realizar_Reserva() {
        System.out.println("Hospede " + getNome() + " de CPF:" + getCPF() + " teve sua reserva de " + dias + " dias realizada com sucesso!");
    }

    public void Cancelar_Reserva() {
        System.out.println("Hospede " + getNome() + " de CPF:" + getCPF() + " teve sua reserva cancelada com sucesso!");
    }

    public int getDias() {
        return dias;
    }
}
