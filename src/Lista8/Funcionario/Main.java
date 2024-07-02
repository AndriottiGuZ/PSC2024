package Lista8.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario jose = new Funcionario("jose", "067.121.133-89"),
                    joao = new Funcionario("joão", "986.936.974-06");
        Gerente pedro = new Gerente("pedro", "987.675.017-90", "financeiro");

        System.out.printf(String.valueOf(jose));
        System.out.printf(String.valueOf(joao));
        System.out.printf(String.valueOf(pedro));

    }
}
