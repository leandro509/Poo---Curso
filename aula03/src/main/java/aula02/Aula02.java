 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author leandro
 */
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        //c1.ponta = 0.5;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.cor = "Azul";
        c1.modelo = "BIC cristal";
        c1.status();
        c1.rabiscar();
       
        
    }
}
