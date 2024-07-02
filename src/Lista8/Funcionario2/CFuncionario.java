package Lista8.Funcionario2;

public class CFuncionario {

    public String nome;
    public String cpf;

    public double getRendimento() {calculaRendimento();
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    double rendimento;

    public CFuncionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected void calculaRendimento(){rendimento = rendimento;}
}
