/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;



/**
 *
 * @author leandro
 */
public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("Livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Quantidade de Paginas : " + this.getTotPaginas());
        System.out.println("Pagina atual : " + this.getPaginaAtual());
        System.out.println("O livro esta aberto ? " + this.isAberto());
        System.out.println("Leitor : " + leitor.getNome());
        System.out.println("Sexo : " + leitor.getSexo());
    }

    @Override
    public void abrir() {
        if (!(this.isAberto())) {
            this.setAberto(true);
        } else {
            System.out.println("O Livro ja esta aberto!");
        }

    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("O livro ja esta fechado!");
        }
    }

    @Override
    public void folhear(int pag) {
        if (this.isAberto()) {
            if (pag > this.getTotPaginas()) {
                this.setPaginaAtual(0);
            } else {
                this.setPaginaAtual(pag);
            }
        } else {
            System.out.println("O livro esta fechado!");
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) {
            if (this.getPaginaAtual() < this.getTotPaginas()) {
                this.setPaginaAtual(this.getPaginaAtual() + 1);
            } else {
                System.out.println("Chegou no final do LIvro!");
            }
        } else {
            System.out.println("O livro esta fechado!");
        }

    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            if (this.getPaginaAtual() < this.getTotPaginas()) {
                this.setPaginaAtual(this.getPaginaAtual() - 1);
            } else {
                System.out.println("Chegou no final do LIvro!");
            }
        } else {
            System.out.println("O livro esta fechado!");
        }
    }

}


