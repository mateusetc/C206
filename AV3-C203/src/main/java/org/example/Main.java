package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando produtos
        Produto prod = new Produto();
        //variavel para escanear
        Scanner sc = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;



        while(flag){

            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar Produtos!");
            System.out.println("2-Listar produtos");
            System.out.println("3-Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Nome do Produto");
                    prod.setNome(sc.nextLine());
                    System.out.println("Preço do produto");
                    prod.setPreco(Double.parseDouble(sc.nextLine()));

                    try {
                        System.out.println("Tipo do produto");
                        prod.setTipo(String.valueOf(sc.nextInt()));
                        if (prod.preco > 0) {
                        } else {
                            throw new InfoInvalidaException("O preço precisa ser maior que 0!");
                        }
                        arq.escrever(prod);
                        System.out.println("Produto adicionado com sucesso!");

                    }catch(InfoInvalidaException e){
                        System.out.println("Preço do produto inválido! Tente novamente!");
                        break;
                    }

                    break;

                case 2:
                    //armazena o retorno do medoto de leitura
                    ArrayList <Produto> funcs = arq.ler();

                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("INFORMACOES DO PRODUTO");
                        System.out.println(funcs.get(i).getNome());
                        System.out.println(funcs.get(i).getPreco());
                        System.out.println(funcs.get(i).getTipo());

                    }
                    break;

                case 3:
                    flag =false;
                    break;

            }

        }
    }
}