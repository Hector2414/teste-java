package senai.mga;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static ControleLigacoes controleLigacoes = new ControleLigacoes();
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static void main(String[] args) {
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Registrar Ligação");
            System.out.println("3. Listar Ligações por Período");
            System.out.println("4. Calcular Valor Total das Ligações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (choice) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    registrarLigacao();
                    break;
                case 3:
                    listarLigacoes();
                    break;
                case 4:
                    calcularValorTotal();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        controleLigacoes.adicionarContato(nome, telefone);
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void registrarLigacao() {
        System.out.print("Digite a data e hora da ligação (dd/MM/yyyy HH:mm): ");
        String dataStr = scanner.nextLine();
        Date data;
        try {
            data = sdf.parse(dataStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Tente novamente.");
            return;
        }

        System.out.print("Digite a duração da ligação em minutos: ");
        long minutos = scanner.nextLong();
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Deseja usar um número da agenda? (s/n): ");
        String usarAgenda = scanner.nextLine();

        String telefone;
        if (usarAgenda.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do contato: ");
            String nome = scanner.nextLine();
            Contato contato = controleLigacoes.buscarContato(nome);
            if (contato == null) {
                System.out.println("Contato não encontrado.");
                return;
            }
            telefone = contato.getTelefone();
        } else {
            System.out.print("Digite o número de telefone: ");
            telefone = scanner.nextLine();
        }

        controleLigacoes.registrarLigacao(data, minutos, telefone);
        System.out.println("Ligação registrada com sucesso!");
    }

    private static void listarLigacoes() {
        System.out.print("Digite a data de início (dd/MM/yyyy HH:mm): ");
        String inicioStr = scanner.nextLine();
        Date inicio;
        try {
            inicio = sdf.parse(inicioStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Tente novamente.");
            return;
        }

        System.out.print("Digite a data de fim (dd/MM/yyyy HH:mm): ");
        String fimStr = scanner.nextLine();
        Date fim;
        try {
            fim = sdf.parse(fimStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Tente novamente.");
            return;
        }

        List<Ligacao> ligacoes = controleLigacoes.listarLigacoes(inicio, fim);
        if (ligacoes.isEmpty()) {
            System.out.println("Nenhuma ligação encontrada no período especificado.");
        } else {
            System.out.println("Ligações no período especificado:");
            for (Ligacao ligacao : ligacoes) {
                System.out.println(ligacao);
            }
        }
    }

    private static void calcularValorTotal() {
        System.out.print("Digite a data de início (dd/MM/yyyy HH:mm): ");
        String inicioStr = scanner.nextLine();
        Date inicio;
        try {
            inicio = sdf.parse(inicioStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Tente novamente.");
            return;
        }

        System.out.print("Digite a data de fim (dd/MM/yyyy HH:mm): ");
        String fimStr = scanner.nextLine();
        Date fim;
        try {
            fim = sdf.parse(fimStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Tente novamente.");
            return;
        }

        double valorTotal = controleLigacoes.calcularValorTotal(inicio, fim);
        System.out.printf("Valor total das ligações no período especificado: R$ %.2f\n", valorTotal);
    }
}
