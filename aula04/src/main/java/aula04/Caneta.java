/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author leandro
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada = true;
    private String cor;
    
    public Caneta(String m, String c, float p){ //Este e o metodo construtor 
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
        
    }
    
    public String getModelo() {
    
        return this.modelo;
    
    }
    
    public void setModelo(String m) {
    
        this.modelo = m;
        
    }
    
    public float getPonta() {
    
        return this.ponta;
    
    }
    
    public void setPonta(float p) {
    
        this.ponta = p;
        
    }
    
    public void tampar() {
    
        this.tampada = true;
    
    }
    
    public void destampar() {
    
        this.tampada = false;
    
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        
    }
}
