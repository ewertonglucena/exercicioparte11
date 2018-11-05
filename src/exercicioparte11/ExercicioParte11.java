package exercicioparte11;
import java.text.DecimalFormat;
import pendrive.*;
public class ExercicioParte11 {

    public static void main(String[] args) {
   
        Pendrive pen[] = new Pendrive[1];
    
        for(int i=0; i <pen.length; i++){
            pen[i] = new Pendrive ();
            pen[i].entradaDados();
        }
     
        
        String[] cabecalho = new String[4];
        cabecalho[0] = "Marca";
        cabecalho[1] = "Modelo";
        cabecalho[2] = "Capacidade";
        cabecalho[3] = "Preço";
        
        String espaco = "\t";
        
        String t = "total";
        String q = "Quantidade";
        
        System.out.println("\033[31;1m"+cabecalho[0]+"\t"+cabecalho[1]+"\t"+cabecalho[2]+"\t"+cabecalho[3]);
        System.out.print("\033[31;1m");
        for(int i = 0; i<cabecalho.length; i++){
            for(int j = 0; j<cabecalho[i].length(); j++){
                System.out.print("-");
            }
            System.out.print("\t");
        }
        
        DecimalFormat p = new DecimalFormat("#,##0.00");
        
        for(int i = 0; i<pen.length;i++){

            System.out.print("\n\033[32;1m"+pen[i].getMarca()+espaco+pen[i].getModelo()+espaco+pen[i].getCapacidade()+espaco+p.format(pen[i].getPreco()));
        }
        
        System.out.print("\n\033[34;1m");
        for(int i = 0; i<cabecalho.length; i++){
            for(int j = 0; j<cabecalho[i].length(); j++){
                System.out.print("-");
            }
            System.out.print(espaco);
        }
        
        int somaCapacidade = 0;
        
        for(int i=0; i<pen.length; i++){
            somaCapacidade+=pen[i].getCapacidade();
        }
        System.out.print("\n\033[34m"+cabecalho[2]+" total: "+somaCapacidade);
        
        double precoTotal = 0;
        
        for(int i=0; i<pen.length; i++){
            precoTotal+=pen[i].getPreco();
        }
        System.out.print("\n\033[34m"+cabecalho[3]+" total: "+precoTotal);
        
        System.out.print("\n\033[34mQuantidade: "+pen.length);
    }
    
}
