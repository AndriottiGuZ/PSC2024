package Lista8.Funcionario;

public class Funcionario {

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

    protected double getSalario() { salario = 2500;
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String nome;
    public String cpf;
    public double salario;

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nFuncionario:\n" +
                "nome: " + nome +
                "\ncpf: " + cpf +
                "\nsalário: " + getSalario();}
}
