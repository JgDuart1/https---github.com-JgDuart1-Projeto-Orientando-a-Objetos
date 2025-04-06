package Sistema_Hotel;

public class Reserva extends Hospede {
    private int dias;
    private static int contador_de_hospedes;

    public Reserva() {};

    public Reserva(String nome, String CPF, int dias) {
        super(nome, CPF);
        this.dias = dias;
        contador_de_hospedes++;
    }

    public void Realizar_Reserva() {
        System.out.println("Hospede " + getNome() + " de CPF:" + getCPF() + " teve sua reserva de " + dias + " dias realizada com sucesso!");
    }

    public void Cancelar_Reserva() {
        System.out.println("Hospede " + getNome() + " de CPF:" + getCPF() + " teve sua reserva cancelada com sucesso!");
    }

    public void Finalizou_reserva() {
        System.out.println("Hospede " + getNome() + " de CPF:" + getCPF() + " teve sua reserva finalizada com sucesso!");
        contador_de_hospedes--;
    }

    public int getDias() {
        return dias;
    }

    public static void getHospedes() {
        System.out.println("Há atualmente " + contador_de_hospedes + " hospedes no hotel.");;
    }
}
