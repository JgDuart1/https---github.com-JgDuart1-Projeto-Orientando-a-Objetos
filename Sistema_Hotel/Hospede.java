package Sistema_Hotel;

public class Hospede {  // classe pai
    private String nome;
    private String CPF;

    public Hospede() {};

    public Hospede(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome () {
        return nome;
    }

    public String getCPF () {
        return CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
