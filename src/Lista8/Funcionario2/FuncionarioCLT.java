package Lista8.Funcionario2;

public class FuncionarioCLT extends CFuncionario{

    public FuncionarioCLT(String nome, String cpf, double salariMensal) {
        super(nome, cpf);
        this.salariMensal = salariMensal;
    }

    public double getSalariMensal() {
        return salariMensal;
    }

    public void setSalariMensal(double salariMensal) {
        this.salariMensal = salariMensal;
    }

    double salariMensal;

    @Override
    protected void calculaRendimento() {
        System.out.println(rendimento = salariMensal);
    }

    public String toString() {
        return "\n--> Funcionario clt.\n" +
                "- nome: " + nome +
                "\n- cpf: " + cpf +
                "\n- rendimento " + getRendimento();}


}
