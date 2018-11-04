package exemplo01;

public class Vetor1 {
    public static void main(String[] args){
        double[] notas = new double[5];
        notas[0] = 5.2;
        notas[1] = 9.8;
        notas[2] = 3.2;
        notas[3] = 6.7;
        notas[4] = 7.5;
        System.out.println("Exibindo as notas do vetor: ");
        for(int i=0; i<notas.length; i++){
            System.out.println(notas[i]);
        }
    }
}
