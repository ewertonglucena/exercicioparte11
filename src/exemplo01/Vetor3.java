package exemplo01;
import java.util.Scanner;
public class Vetor3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] a1;
        int[] a2;
        
        a1 = new int[10];
        a2 = new int[30];
        
        System.out.println("a1 tamanho: "+a1.length);
        System.out.println("a2 tamanho: "+a2.length);
        
        float[] notas = {7.5f, 9.0f, 10.0f};
        
        System.out.println("Notas: "+notas[0]
                +" - "+notas[1]+" - "+notas[2]);
        
        String[] str = new String[5];
        System.out.println("Digite o seu nome: ");
        String nomeaux = sc.nextLine();
        str[0] = nomeaux;
        str[1] = "Joana";
        str[2] = "Ana";
        System.out.println("Pessoas:"+str[0]+" - "
                +str[1]+" - "+str[2]);
        
        for(int z = 0; z<str.length; z++){
            System.out.println(str[z]);
        }
    }
}
