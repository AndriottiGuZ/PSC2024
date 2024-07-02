package Lista8.Funcionario2;

public class Main {
    public static void main(String[] args) {
        FuncionarioCLT pedro = new FuncionarioCLT("Pedro", "063.121.243-09", 3500);
        FuncionairioHorista joao = new FuncionairioHorista("João", "798.637.755-98", 75, 45);

        System.out.println(pedro);
        System.out.println(joao);
    }
}
