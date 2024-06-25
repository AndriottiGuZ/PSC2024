package Lista7.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int continuar = 1;
        ArrayList <Veiculo> veiculos = new ArrayList<>();
        ArrayList <Proprietario> donos = new ArrayList<>();

        while (continuar == 1) {
            System.out.println("\nCadastro do veiculo.\n ");
            Veiculo veiculo1 = new Veiculo();
            Proprietario dono = new Proprietario();
            System.out.print("Digite a placa do veiculo: ");
            veiculo1.setPlaca(ler.next());
            System.out.print("Digite a cor do veiculo: ");
            veiculo1.setCor(ler.next());
            System.out.print("Digite a modelo do veiculo: ");
            veiculo1.setModelo(ler.next());

            System.out.print("\nCadastro do dono. ");
            ler.nextLine();
            System.out.print("\nNome do dono: ");
            String nomeDodono = ler.nextLine();

            boolean donoExistente = false;
            for (Proprietario dono1 : donos) {
                if (dono1.getNome().equals(nomeDodono)) {
                    dono = dono1;
                    donoExistente = true;
                    break;
                }
            }

            if (donoExistente) {
                System.out.println("Este dono já está cadastrado, os dados foram preenchidos automaticamente.");
            } else {
                dono.setNome(nomeDodono);
                System.out.print("Sexo: ");
                dono.setSexo(ler.next());

                String cpf;
                do {
                    System.out.print("CPF: ");
                    cpf = ler.next();
                    if (cpf.length() != 11) {
                        System.out.println("CPF inexistente. Tente novamente.");
                    }
                } while (cpf.length() != 11);
                dono.setCpf(formatarCPF(cpf));
                dono.setCpf(formatarCPF(cpf));

                String cnh;
                do {
                    System.out.print("CNH: ");
                    cnh = ler.next();
                    if (cnh.length() != 11) {
                        System.out.println("CNH inexistente. Tente novamente.");
                    }
                } while (cnh.length() != 11);
                dono.setCnh(cnh);

                ler.nextLine();
                System.out.print("Endereço: ");
                dono.setEndereco(ler.nextLine());
                donos.add(dono);
            }

            veiculo1.setDono(dono);
            veiculos.add(veiculo1);

            System.out.print("Deseja continuar? 1 para sim, 2 para não: ");
            continuar = ler.nextInt();
        }

        System.out.println("\nlistagem de veiculos: ");
        System.out.println("======================");

        for (Veiculo veiculo1 : veiculos){
            System.out.println("\nmodelo: " + veiculo1.getModelo());
            System.out.println("placa: " + veiculo1.getPlaca());
            System.out.println("cor: " + veiculo1.getCor());
            System.out.println("dono: " + veiculo1.dono.getNome());
            System.out.println("cfp: " + veiculo1.dono.getCpf());
            System.out.println("cnh: " + veiculo1.dono.getCnh());
            System.out.println("sexo: " + veiculo1.dono.getSexo());
            System.out.println("endereço: " + veiculo1.dono.getEndereco());
        }
    }
    public static String formatarCPF(String cpf) {

        return cpf.substring(0, 3) + "." +
                    cpf.substring(3, 6) + "." +
                    cpf.substring(6, 9) + "-" +
                    cpf.substring(9, 11);

        }
    }
