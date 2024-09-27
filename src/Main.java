public class Main {
    public static void main(String[] args) {

        double[] n = {9.0, 10, 6, 4.2};
        System.out.println(realizaSoma(n));

    }

    public static double realizaSoma(double[] notas) {
        double notaFinal = 0;
        for(int i = 0; i < notas.length; i++) {
            notaFinal += notas[i];
        }
        return notaFinal / 4;
    }
}