package br.com.digitalhouse;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando AS boas vindas do sistema
        int acao;
        Livro base1 = new Livro(1, "Senhor dos Aneis", "Vinicius", 1997, "11-11-11", 10, 10.99);
        Livro base2 = new Livro(2, "Eita nois", "Ivan", 1989, "2-2-2", 10, 20);
        Livro base3 = new Livro(3, "O poderoso chefão", "Mario Puzzo", 1964, "3-3-3", 1, 50);
        Livraria livraria = new Livraria();
        livraria.adicionarLivro(base1);
        livraria.adicionarLivro(base2);
        livraria.adicionarLivro(base3);
        Scanner opcao = new Scanner(System.in);
        System.out.println("Seja Bem vinda  a Livraria");
        System.out.println("Digite o código da ação desejada:");
        System.out.println("1 - Cadastro de Livro\n2 - Consulta de Livro\n3 - Venda de Livro");
        try{
            acao = opcao.nextInt();
            switch (acao) {
                case 1:
                    try {
                        Livro livro = new Livro();
                        Scanner valor = new Scanner(System.in);
                        System.out.println("Cadastro de Livro\n Digite o nome do seu livro:");
                        livro.setTitulo(valor.next());
                        System.out.println("Digite o nome do Autor:");
                        livro.setAutor(valor.next());
                        System.out.println("Digite o Ano de Lançamento:");
                        livro.setAnoLancemento(valor.nextInt());
                        System.out.println("Digite o código ISBN:");
                        livro.setISBN(valor.next());
                        System.out.println("Digita o código do Livro");
                        livro.setCodigo(valor.nextInt());
                        System.out.println("Digita o preço:");
                        livro.setPreco(valor.nextDouble());
                        System.out.println("Digita a quantidade:");
                        livro.setQuantidade(valor.nextInt());
                        if (livraria.adicionarLivro(livro)) {
                            System.out.println("Cadastrado com sucesso o seguinte livro:\n" + livro.toString());
                        } else {
                            System.out.println("Houve algum erro, reinicie o processo!");
                        }
                    }catch (Exception ex){
                        System.out.println("Valor incorreto. Tente novamente");
                    }
                    break;
                case 2:
                    System.out.println("Digita o código do livro cadastro:");
                    int codigo;
                    Scanner valor2 = new Scanner(System.in);
                    codigo = valor2.nextInt();
                    System.out.println(livraria.consultarLivro(codigo));
                    break;
                case 3:
                    List<Livro> totais = livraria.getLivroCadastrado();
                    for (Livro item : totais
                    ) {
                        System.out.println(item.getCodigo() + " - " + item.getTitulo());
                    }
                    System.out.println("Com base na lista acima escolha um livro para a venda:");
                    Scanner valor3 = new Scanner(System.in);

                    try {
                        int livroCodigo;
                        livroCodigo = valor3.nextInt();
                        System.out.println(livraria.efetuarVenda(livroCodigo));
                    } catch (Exception ex) {
                        System.out.println("Opção Invalida campeão! Tenta de novo");
                    }

                    break;
                default:
                    System.out.println("Opção Invalida.");
            }
        }catch (Exception ex){
            System.out.println("Digite uma opção certa ai meo!");
        }





    }
}
