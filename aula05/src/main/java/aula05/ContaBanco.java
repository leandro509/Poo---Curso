/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author leandro
 */
public class ContaBanco {

    private int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        
    }
    
    public ContaBanco() {

        this.saldo = 0;
        this.status = false;

    }

    public void setNumConta(int numConta) {

        this.numConta = numConta;

    }

    public int getNumConta() {

        return this.numConta;

    }

    public void setTipo(String tipo) {

        this.tipo = tipo;

    }

    public String getTipo() {

        return this.tipo;

    }

    public void setDono(String dono) {

        if (dono.trim().isEmpty()) {

            throw new IllegalArgumentException("O dono da conta nao pode estar em branco!");

        }

        this.dono = dono;

    }

    public String getDono() {

        return this.dono;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    public double getSaldo() {

        return this.saldo;

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo) {

      this.setTipo(tipo);
      this.setStatus(true);
      if(this.getTipo().equals("CC")){
          this.setSaldo(50);
      }else if(this.getTipo().equals("CP")) {
          this.setSaldo(150);
      }
        System.out.println("Conta aberta com Sucesso!");
    }

    public void fecharConta() {

        if (this.getSaldo() > 0) {

            throw new IllegalArgumentException("A conta nao pode ser fechada pois exite dinheiro!");

        } else if (this.getSaldo() < 0) {

            throw new IllegalArgumentException("Conta em debito!");

        } else {
            
            this.setStatus(false);
            System.out.println("Conta fechada!");
        }

    }

    public void depositar(double valor) {

       if(this.isStatus()) {
       
           this.setSaldo(this.getSaldo() + valor);
           System.out.println("Deposito realizado na conta de " + this.getDono());
       }else{
           System.out.println("Impossivel depositar na conta!");
       }

    }

    public void sacar(double valor) {
        if(this.isStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        double valorM = 0;

        if (this.getTipo().equals("CC")) {
            valorM = 12;
        } else if (this.getTipo().equals("CP")) {
            valorM = 20;
        }
        
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - valorM);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }

    }
}
