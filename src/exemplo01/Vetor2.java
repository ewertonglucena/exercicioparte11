package exemplo01;

public class Vetor2 {
    public static void main(String[] args){
        int[] a1;
        int[] a2;
        
        a1 = new int[10];
        a2 = new int[30];
        
        a1[0] = 2;
        a1[1] = 4;
        a1[2] = 6;
        
        System.out.println("a1 tamanho: "+a1.length);
        System.out.println("a2 tamanho: "+a2.length);
        
        float[] notas = {7.5f, 9.0f, 10.0f};
        
        System.out.println("Notas: "+ notas[0]+ " - "
                + notas[1] +" - "+ notas[2]);
        int[][] matriz = new int[3][4];
        System.out.println("Linhas da Matriz: "+matriz.length);
        System.out.println("Colunas da Matriz: "+matriz[0].length);
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = 8;
        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;
        matriz[2][3] = 12;
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
            System.out.println(matriz[i][j] + " ");           
        }
    }
}
}