package Lista7.Aluno.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeAlunos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList <InfoAlunos> alunos = new ArrayList<>();
        int numAlunos, continuar = 1;

        System.out.print("Cadastro de alunos e notas");

       while (continuar == 1){

            InfoAlunos aluno = new InfoAlunos();

            System.out.print("\nnome do aluno: ");
            aluno.setNome(ler.next());
            System.out.print("numero de matricula do aluno: ");
            aluno.setMatricula(ler.nextInt());
            System.out.println("Notas 1 e 2 do aluno (0 a 100): ");
            aluno.setNota1(ler.nextInt());
            aluno.setNota2(ler.nextInt());
            alunos.add(aluno);

           System.out.print("Continuar? digite 1 pra sim e 2 para não: ");
           continuar = ler.nextInt();
        }

        System.out.println("\nListagem de alunos");
        System.out.println("----------------------");

        for (InfoAlunos aluno : alunos){

            System.out.printf("\n%S\n%S\n%S\n%S\n%S",
                    "nome: " + aluno.nome,
                    "matricula: " + aluno.matricula,
                    "nota da A1: " + aluno.nota1,
                    "nota da A2: " + aluno.nota2,
                    "média: " + aluno.Media());

            if(aluno.Media() < 70) {
                System.out.println("\nStatus: exame final");
                System.out.println("nota mínima no exame: " + aluno.Exame());
            }else{
                System.out.println("\nstatus: aprovado");
            }
        }
    }
}