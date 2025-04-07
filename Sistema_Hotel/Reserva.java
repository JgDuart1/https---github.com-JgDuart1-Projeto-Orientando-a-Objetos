package Sistema_Hotel;

public class Reserva extends Hospede {  // realiza a reversa do hospede
    private int dias;
    private static int contador_de_hospedes; // atributo estático para a contagem de hospedes no hotel "atualmente"

    public Reserva() {};

    public Reserva(String nome, String CPF, int dias) {
        super(nome, CPF);  // constrói o hospede atraves da super classe
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

    public static void getHospedes() { // Metodo estático para vizualisar o número de hospedes no hotel.
        System.out.println("Há atualmente " + contador_de_hospedes + " hospedes no hotel.");;
    }
}
