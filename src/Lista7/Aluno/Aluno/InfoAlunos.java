package Lista7.Aluno.Aluno;

public class InfoAlunos {

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    int matricula;
    String nome;
    double nota1;
    double nota2;

    public double Media() {
        return (getNota1() + getNota2()) / 2;
    }

    public double Exame() {
        return 30 + (70 - Media());
    }
}
