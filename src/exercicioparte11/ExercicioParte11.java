package exercicioparte11;
import pendrive.*;
public class ExercicioParte11 {

    public static void main(String[] args) {
   
        Pendrive pen[] = new Pendrive[2];
    
        for(int i=0; i <pen.length; i++){
            pen[i] = new Pendrive ();
            pen[i].entradaDados();
        }
     
        
        String[] cabecalho = new String[4];
        cabecalho[0] = "Marca";
        cabecalho[1] = "Modelo";
        cabecalho[2] = "Capacidade";
        cabecalho[3] = "Preço";
        
        String espaco = "  ";
        
        String t = "total";
        String q = "Quantidade";
        
        System.out.println("\033[31;1m"+cabecalho[0]+espaco+cabecalho[1]+espaco+cabecalho[2]+espaco+cabecalho[3]);
        System.out.print("\033[31;1m");
        for(int i = 0; i<cabecalho.length; i++){
            for(int j = 0; j<cabecalho[i].length(); j++){
                System.out.print("-");
            }
            System.out.print(espaco);
        }
        
        
        for(int i = 0; i<pen.length;i++){
            System.out.print("\n\033[32;1m"+pen[i].getMarca()+espaco+pen[i].getModelo()+espaco+pen[i].getCapacidade()+espaco+pen[i].getPreco());
        }
        
    }
    
}
