package Lista8.Funcionario2;

public class FuncionairioHorista extends CFuncionario{
    public FuncionairioHorista(String nome, String cpf, double salarioHora, int horasTrabalhasdas) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhasdas = horasTrabalhasdas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhasdas() {
        return horasTrabalhasdas;
    }

    public void setHorasTrabalhasdas(int horasTrabalhasdas) {
        this.horasTrabalhasdas = horasTrabalhasdas;
    }

    private double salarioHora;
    private int horasTrabalhasdas;

    @Override
    protected void calculaRendimento() {
        rendimento = horasTrabalhasdas*salarioHora;
    }

    public String toString() {
        return "\n--> Funcionario horista.\n" +
                "- nome: " + nome +
                "\n- cpf: " + cpf +
                "\n- rendimento " + getRendimento();}
}
