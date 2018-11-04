
package exemplo02;
import java.util.Scanner;
public class Monitor {
    private String resolucao;
    private double preco, potencia;
    private int tamanhoTela, tensao;

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }
    
    public Monitor(){}

    public Monitor(String resolucao, double preco, double potencia, int tamanhoTela, int tensao) {
        this.resolucao = resolucao;
        this.preco = preco;
        this.potencia = potencia;
        this.tamanhoTela = tamanhoTela;
        this.tensao = tensao;
    }

    public Monitor(String resolucao, double preco, int tamanhoTela) {
        this.resolucao = resolucao;
        this.preco = preco;
        this.tamanhoTela = tamanhoTela;
    }
    
    public void cadastrar(String resolucao, double preco, double potencia, int tamanhoTela, int tensao) {
        this.resolucao = resolucao;
        this.preco = preco;
        this.potencia = potencia;
        this.tamanhoTela = tamanhoTela;
        this.tensao = tensao;
    }
    
    public void imprimir(){
        System.out.println("Resolução: "+resolucao);
        System.out.println("Preço: "+preco);
        System.out.println("Potência: "+ tamanhoTela);
        System.out.println("Tensão: "+ tensao);
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Resolução: ");
        resolucao = sc.nextLine();
        System.out.print("Preço: ");
        preco = Double.parseDouble(sc.nextLine());
        System.out.print("Potência: ");
        potencia = Double.parseDouble(sc.nextLine());
        System.out.print("Tamanho: ");
        tamanhoTela = Integer.parseInt(sc.nextLine());
        System.out.print("Tensão: ");
        tensao = Integer.parseInt(sc.nextLine());
    }
}
