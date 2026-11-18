import java.util.Scanner;

public class Exercício01Faculdade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] filmes = new String[5][3];

        filmes[0] = new String[]{"Opção", "Filme", "Sessão"};
        filmes[1] = new String[]{"1", " Homem-Aranha ", " 22:00"};
        filmes[2] = new String[]{"2", " Homem-Aranha ", " 23:00"};
        filmes[3] = new String[]{"3", " Vingadores ", " 14:00"};
        filmes[4] = new String[]{"4", " Vingadores ", " 15:00"};

        for (int i =0; i < filmes.length; i++) {
            System.out.println(filmes[i][0] + "|" + filmes[i][1] + "|" + filmes[i][2]);}

            System.out.println();
        System.out.println("Selecione a opção Filme/Sessão:");

        String opcao = entrada.next();

        for (int i = 0; i < filmes.length; i++) {
            if (opcao.equals(filmes[i][0])) {
                System.out.println("Filme/Sessão selecionado:" + filmes[i][1] + "|" + filmes[i][2]);
            }
        }

        System.out.println("Valor da entrada inteira: R$32,00");
        System.out.println("Quantas entradas inteiras deseja:");
        Integer qtdInteiras = entrada.nextInt();
        System.out.println("Quantas entradas meia deseja:");
        Integer qtdMeias = entrada.nextInt();
        Double total = qtdInteiras * 32.0 + qtdMeias * 16.0;
        System.out.println("Total a pagar:" + total);


    }
}