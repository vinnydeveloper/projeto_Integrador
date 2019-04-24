package br.com.digitalhouse;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private String anoLancemento;
    private String ISBN;
    private int quantidade;
    private double preco;

    public Livro(int codigo, String titulo, String autor, String anoLancemento, String ISBN, int quantidade, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancemento = anoLancemento;
        this.ISBN = ISBN;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public Livro(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getAnoLancemento() {
        return anoLancemento;
    }

    public void setAnoLancemento(String anoLancemento) {
        this.anoLancemento = anoLancemento;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
