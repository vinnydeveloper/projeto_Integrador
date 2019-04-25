package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livroCadastrado = new ArrayList<>();

    public boolean adicionarLivro(Livro livro){
         livroCadastrado.add(livro);
         return true;
    }

    public String consultarLivro(int codigo){
        for (int i = 0; i < this.livroCadastrado.size() ; i++) {
            if(livroCadastrado.get(i).getCodigo() == codigo){
                return livroCadastrado.get(i).toString();
            }
        }
         return "Não encontrado :(";
    }

    public List<Livro> getLivroCadastrado() {
        return livroCadastrado;
    }
    public String efetuarVenda(int codigo){

            for (Livro item: livroCadastrado
            ) {
                if(item.getCodigo() == codigo){
                    if(item.getQuantidade() > 0 ){
                        item.setQuantidade(item.getQuantidade() - 1);
                        return "Venda Realizada com sucesso meu chegado";
                    }else {
                        return  "Estoque esgotado";
                    }
                }
            }
           return "Código não encontrado";
    }
}
