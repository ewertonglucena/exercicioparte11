package exemplo01;

public class Vetor4 {
        public static void main(String[] args){
            int vetor[] = new int[10];
            int auxiliar;
            for(int i=0;i<10;i++){
            vetor[i]=(20-i*2);
        }
            System.out.println("Vetor antes da ordenação:");
            for(int i=0;i<10;i++){
                System.out.println(vetor[i]);
            }
            for (int i=0;i<9;i++){
                for(int j=i+1;j<10;j++){
                    if(vetor[i]>vetor[j]){
                        auxiliar = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = auxiliar;
                    }
                }
            }
            System.out.println("Vetor depois da ordenação:");
            for(int i=0;i<10;i++){
                System.out.println(vetor[i]);
            }
        }
}
