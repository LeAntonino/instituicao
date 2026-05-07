package br.edu.instituicao.main;

import br.edu.instituicao.model.Aluno;
import br.edu.instituicao.model.Coordenador;
import br.edu.instituicao.model.Pessoa;
import br.edu.instituicao.model.Professor;
import br.edu.instituicao.service.Secretaria;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Secretaria sec = new Secretaria();
        
        boolean islooping = true;
        while (islooping){
            System.out.println("===== SISTEMA ACADEMICO =====");
            Scanner scan = new Scanner(System.in);
            System.out.println("1 - Adicionar individuo ao sistema");
            System.out.println("2 - Listar todos individuos ");
            System.out.println("0 - Sair");
            int opcao = scan.nextInt();
            
            switch (opcao) {
                
                case 1 -> {           
                    System.out.println("por favor, insira o tipo de individuo a ser cadastrado: ");
                    System.out.println("1 - Aluno");
                    System.out.println("2 - Professor");
                    System.out.println("3 - Coordenador");
                    int tipodepessoa = scan.nextInt();
                    
                    switch(tipodepessoa){
                        
                        case 1 -> {
                            Aluno p = new Aluno();
                            
                            System.out.println("Insira o nome do Aluno: ");
                            String Nome = scan.next();
                            p.setNome(Nome);
                            
                            System.out.println("Insira o CPF do Aluno: ");
                            long cpf = scan.nextLong();
                            p.setCpf(cpf);
                            
                            System.out.println("Insira o Email do Aluno: ");
                            String email = scan.next();
                            p.setEmail(email);
                            
                            System.out.println("Insira a Matricula do Aluno: ");
                            long matricula = scan.nextLong();
                            p.setMatricula(matricula);
                            
                            double[] notas = new double[4];
                            for (int i = 0; i < notas.length; i++) {
                                System.out.println("Insira a " + (i+1) + " nota do Aluno: ");
                                notas[i] = scan.nextDouble();
                            }
                            p.setNotas(notas);                            
                            
                            sec.Adicionar(p);                    
                        }
                        
                        case 2 -> {
                            Professor p = new Professor();
                            
                            System.out.println("Insira o nome do Professor: ");
                            String Nome = scan.next();
                            p.setNome(Nome);
                            
                            System.out.println("Insira o CPF do Professor: ");
                            long cpf = scan.nextLong();
                            p.setCpf(cpf);
                            
                            System.out.println("Insira o Email do Professor: ");
                            String email = scan.next();
                            p.setEmail(email);
                            
                            System.out.println("Insira o Siape do Professor: ");
                            long siape = scan.nextLong();
                            p.setSiape(siape);
                            
                            sec.Adicionar(p);                                                                        
                        }
                        
                        case 3 -> {
                            Coordenador p = new Coordenador();
                            
                            System.out.println("Insira o nome do Coordenador: ");
                            String Nome = scan.next();
                            p.setNome(Nome);
                            
                            System.out.println("Insira o CPF do Coordenador: ");
                            long cpf = scan.nextLong();
                            p.setCpf(cpf);
                            
                            System.out.println("Insira o Email do Coordenador: ");
                            String email = scan.next();
                            p.setEmail(email);
                            
                            System.out.println("Insira o Siape do Coordenador: ");
                            long siape = scan.nextLong();
                            p.setSiape(siape);
                            
                            sec.Adicionar(p);
                        }
                        
                        default -> {
                        System.out.println("Valor invalido ");
                        }
                        
                    }
                }
                
                case 2 ->{
                    System.out.println("===== LISTA DE INDIVIDUOS =====");    
                    sec.Listar();                 
                }
                
                case 0 -> {
                    System.out.println("Ate a proxima!");
                    islooping = false;
                    break;
                }
                
                default -> {
                    System.out.println("Valor invalido ");
                }
                               
            }
           
        } 
        
    }
    
}
