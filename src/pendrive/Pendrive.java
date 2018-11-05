package pendrive;

import java.util.Scanner;

public class Pendrive {
    private String marca, modelo;
    private int capacidade;
    private double preco;
    public Pendrive(){}
    
    
    public Pendrive(String marca,String modelo, int capacidade, double preco){
        setMarca(marca);
        setModelo(modelo);
        setCapacidade(capacidade);
        setPreco(preco);
    }
    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade>0){
        this.capacidade = capacidade;
    }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco>0){
        this.preco = preco;
    }
    }
    
    public void imprimir(){
        System.out.println("\n\nOs dados do Pendrive são: \n");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Capacidade: "+ capacidade);
        System.out.println("Preço: " + preco);
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a marca: ");
        setMarca(sc.nextLine());
        System.out.print("Insira o modelo: ");
        setModelo(sc.nextLine());
        System.out.print("Insira a capacidade: ");
        setCapacidade(Integer.parseInt(sc.nextLine()));
        System.out.print("Insira o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }
    
    public void cadastrar(String marca, String modelo, int capacidade, double preco){
        setMarca(marca);
        setModelo(modelo);
        setCapacidade(capacidade);
        setPreco(preco);
    }
}
