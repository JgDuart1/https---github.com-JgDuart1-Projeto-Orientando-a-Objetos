package Sistema_Hotel;

public class Sistema_Reserva_Hotel {
    public static void main(String[] args) {
        Reserva R1 = new Reserva("Lucio", "09099912319", 5);
        R1.Realizar_Reserva();
        
        Calcula_conta conta_do_R1 = new Calcula_conta(R1);
        conta_do_R1.Calcula_Preço_Final();
        
    }
}