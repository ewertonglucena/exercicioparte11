
package exemplo02;

public class VetorObjetos {
    public static void main(String[] args) {
    Monitor monit[] = new Monitor[15];
    for(int i=0; i<15; i++){
        monit[i] = new Monitor();
        monit[i].entradaDados();
    }
    for(int i=0; i<15; i++){
        System.out.println("*************************");
        monit[i].imprimir();
        System.out.println("*************************");
    }
    }
}
