package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando produtos
        Aluno prod = new Aluno();
        //variavel para escanear
        Scanner sc = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;
        ArrayList<Aluno> funcs = new ArrayList<>();

        while (flag) {


            System.out.println("Bem vindo ao menu!");
            System.out.println("1 - Cadastrar alunos!");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Listar alunos em ordem crescente de média");
            System.out.println("4 - Sair do menu!");
            int op = sc.nextInt();
            sc.nextLine();


            switch (op) {
                case 1:
                    System.out.println("Nome do Aluno");
                    prod.setNome(sc.nextLine());
                    System.out.println("Média do aluno");
                    prod.setMedia(sc.nextFloat());
                    sc.nextLine();
                    System.out.println("Curso do aluno:");
                    prod.setCurso(sc.nextLine());
                    try {
                        System.out.println("Matrícula do aluno");
                        prod.setMatricula((sc.nextInt()));
                        if (prod.getMatricula() > 0) {
                        } else {
                            throw new InfoInvalidaException("A matrícula precisa ser maior que 0!");
                        }

                        arq.escrever(prod);
                        System.out.println("Aluno adicionado com sucesso!");
                        sc.nextLine();


                    } catch (InfoInvalidaException e) {
                        System.out.println("Matricula do aluno inválido! Tente novamente!");
                        break;
                    }
                case 2:
                    funcs = arq.ler();
                    //armazena o retorno do medoto de leitura
                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("INFORMACOES DO ALUNO");
                        System.out.println("Nome do aluno: "+funcs.get(i).getNome());
                        System.out.println("Matricula do aluno: "+funcs.get(i).getMatricula());
                        System.out.println("Curso do aluno: "+funcs.get(i).getCurso());
                        System.out.println("Media do aluno: "+funcs.get(i).getMedia());
                    }
                    break;
                case 3:
                    funcs = arq.ler();
                    Collections.sort(funcs);
                    System.out.println("Lista em ordem crescente:");
                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("Nome do aluno: "+funcs.get(i).getNome());
                        System.out.println("Matricula do aluno: "+funcs.get(i).getMatricula());
                        System.out.println("Curso do aluno: "+funcs.get(i).getCurso());
                        System.out.println("Media do aluno: "+funcs.get(i).getMedia());
                        System.out.println("-------------------");
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                }
            }
        }
    }