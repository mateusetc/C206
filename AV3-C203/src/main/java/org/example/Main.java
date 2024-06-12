package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;


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




        while (flag) {


            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar Produtos!");
            System.out.println("2-Listar produtos");
            System.out.println("4-Produtos em ordem decrescente");
            int op = sc.nextInt();
            sc.nextLine();


            switch (op) {
                case 1:
                    System.out.println("Nome do Produto");
                    prod.setNome(sc.nextLine());
                    System.out.println("Preço do produto");
                    prod.setPreco(sc.nextDouble());
                    sc.nextLine();


                    try {
                        System.out.println("Tipo do produto");
                        prod.setTipo(String.valueOf(sc.nextLine()));
                        if (prod.preco > 0) {
                        } else {
                            throw new InfoInvalidaException("O preço precisa ser maior que 0!");
                        }
                        arq.escrever(prod);
                        System.out.println("Produto adicionado com sucesso!");
                        sc.nextLine();


                    } catch (InfoInvalidaException e) {
                        System.out.println("Preço do produto inválido! Tente novamente!");
                        break;
                    }
                case 2:
                    //armazena o retorno do medoto de leitura
                    ArrayList<Produto> funcs = arq.ler();
                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("INFORMACOES DO PRODUTO");
                        System.out.println(funcs.get(i).getNome());
                        System.out.println(funcs.get(i).getPreco());
                        System.out.println(funcs.get(i).getTipo());
                    }
                    break;


                case 3: {
                    ArrayList<Produto> funcs1 = arq.ler();
                    Collections.sort(funcs1, Collections.reverseOrder());
                    System.out.println("Lista em ordem decrescente:");
                    for (int i = 0; i < funcs1.size(); i++) {
                        System.out.println("Nome do Produto: " + funcs1.get(i).getNome());
                        System.out.println("Tipo do Produto: " + funcs1.get(i).getTipo());
                        System.out.println("Preco do Produto: " + funcs1.get(i).getPreco());
                        System.out.println("-------------------");
                    }
                    break;
                }
                case 4: {

                }
                case 5: {


                    flag = false;
                    break;


                }
            }
        }
    }
}
