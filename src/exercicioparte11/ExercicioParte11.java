package exercicioparte11;
import dados.*;
public class ExercicioParte11 {

    public static void main(String[] args) {
        Pendrive pen[] = new Pendrive[20];
        
        for(int i=0; i <pen.length; i++){
            pen[i] = new Pendrive ();
            pen[i].entradaDados();
        }
        String cab1 = "\033[31;1mMarca";
        String cab2 = "\033[31;1mModelo";
        String cab3 = "\033[31;1mCapacidade";
        String cab4 = "\033[31;1mPreço";
        
        
        System.out.println(cab1);
        
        
    }
    
}
