package Lista8.Funcionario;

public class Gerente extends Funcionario {

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Gerente(String nome, String cpf, String departamento) {
        super(nome, cpf);
        this.departamento = departamento;
    }

    private String departamento;


    @Override
    protected double getSalario() {
        salario = 2500 * 1.20;
        return salario;
    }

    @Override
    public String toString() {
        return "\nGerente:\n" +
                "nome: " + nome +
                "\ncpf: '" + cpf +
                "\ndepartamento: " + departamento +
                "\nsalário: " + getSalario();}


}
