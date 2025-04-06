package Sistema_Hotel;

public class Hospede {
    private String nome;
    private String CPF;

    public Hospede(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome () {
        return nome;
    }
}
