package Sistema_Hotel;

public class Calcula_conta {
    private double preço_final;
    private Reserva reservista;

    public Calcula_conta() {};
    
    public Calcula_conta(Reserva r1) {
        reservista = r1;
        preço_final = reservista.getDias() * 350; // 350 sendo o preço da diária
    }

    public void Calcula_Preço_Final() {
        System.out.println("A conta do hóspede " + reservista.getNome() + " ficou em R$" + preço_final);;
    }

    public double getPreçoFinal() {
        return preço_final;
    }

}
