public class Main {
    public static void main(String[] args) {


        System.out.println("Esse é o screen Match!");

        int anoDeLancamento = 2022;

        boolean incuidoNoPlano = true;
        double notaDoFilme = 8.1;





        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de Aventura com o galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;

        System.out.println(sinopse);

        System.out.println("Nota do Filme: " + notaDoFilme);


        double media = (9.8 + 6.3 + 8.0) / 3;

int classificao;

classificao = (int) (media/2);

        System.out.println(classificao);
    }
}