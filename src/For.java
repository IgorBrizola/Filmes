import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        double nota = 0;
        double mediaAvaliacao = 0;


        for (int i = 0; i < 3 ; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao/3);






    }
}
