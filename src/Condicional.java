public class Condicional {
    public static void main(String[] args) {
         int anoDeLancamento = 1986;
        boolean incuidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientesd estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale apena assistir");
        }

        if (incuidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

    }
}
