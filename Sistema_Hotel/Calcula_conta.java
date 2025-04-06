package Sistema_Hotel;

public class Calcula_conta {
    private int preço_final;
    private Reserva reservista;
    
    public Calcula_conta(Reserva r1) {
        reservista = r1;
    }

    public void Calcula_Preço_Final() {
        preço_final = reservista.getDias() * 350; // 350 sendo o preço da diária
        System.out.println("A conta do hóspede:" + reservista.getNome() + " ficou em R$" + preço_final + ".00");;
    }
}
