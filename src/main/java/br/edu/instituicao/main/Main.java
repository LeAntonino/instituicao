package br.edu.instituicao.main;

import br.edu.instituicao.model.Aluno;
import br.edu.instituicao.model.Coordenador;
import br.edu.instituicao.service.RelatorioAcademico;
import br.edu.instituicao.model.Professor;
import br.edu.instituicao.service.Secretaria;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Secretaria sec = Secretaria.getInstance();
        RelatorioAcademico rel = new RelatorioAcademico();
        
        boolean islooping = true;
        while (islooping){
            System.out.println("===== SISTEMA ACADEMICO =====");
            Scanner scan = new Scanner(System.in);
            System.out.println("1 - Adicionar Aluno ao sistema");
            System.out.println("2 - Adicionar Professor/Coordenador ao sistema");
            System.out.println("3 - Lancar notas de aluno");
            System.out.println("4 - Listar todos individuos ");
            System.out.println("5 - Exibir media Global");
            System.out.println("6 - Testar Login de Professor/Coordenador");
            System.out.println("7 - Sair");
            int opcao = scan.nextInt();
            
            switch (opcao) {
                
                
                case 1 -> {
                    
                    Aluno p = new Aluno();
                        
                        try{
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
                                            
                        sec.Adicionar(p);
                        
                        }catch(Exception e){
                            System.out.println("Erro, insira os dados corretamente");
                        }
                    
                }
                
                
                case 2 -> {           
                    System.out.println("por favor, insira o tipo de individuo a ser cadastrado: ");
                    System.out.println("1 - Professor");
                    System.out.println("2 - Coordenador");
                    int tipodepessoa = scan.nextInt();
                    
                    switch(tipodepessoa){
                                              
                        case 1 -> {
                            Professor p = new Professor();
                            
                            try{
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
                            
                            System.out.println("Insira a senha do Professor");
                            String senha = scan.next();
                            p.setSenha(senha);
                            
                            sec.Adicionar(p);
                            
                            }catch(Exception e){
                                System.out.println("Erro, insira os dados corretamente");
                            }
                           
                        }
                        
                        case 2 -> {
                            Coordenador p = new Coordenador();
                            
                            try{
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
                            
                            System.out.println("Insira a senha do Coordenador");
                            String senha = scan.next();
                            p.setSenha(senha);
                            
                            sec.Adicionar(p);
                            }catch(Exception e){
                                System.out.println("Erro, insira os dados corretamente");
                            }
                        }
                        
                        default -> {
                        System.out.println("Valor invalido ");
                        }
                        
                    }
                }
                
                case 3 ->{
                    System.out.println("Insira a matricula do Aluno: ");
                    long matricula = scan.nextLong();
                    Aluno aluno = sec.Localizar(matricula);
                    double[] notas = new double[4];
                    
                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Insira a " + (i+1) + " nota do Aluno: ");
                        notas[i] = scan.nextDouble();
                    }
                    
                    try{
                        aluno.setNotas(notas);
                        rel.adicionarDados(aluno);
                    }catch(Exception e){
                        System.out.println("ERRO, aluno nao cadastrado");
                    }
                    
                    
                }
                
                case 4 ->{
                    System.out.println("===== LISTA DE INDIVIDUOS =====");    
                    sec.Listar();                 
                }
                
                case 5 ->{
                    System.out.println("Media Geral da Instituicao: " + rel.getMediaglobal());
                }
                
                case 6 ->{        
                    try{
                        System.out.println("Insira o Siape do Professor/Coordenador");
                        long siape = scan.nextLong();
                        Professor professor = sec.LocalizarProfessor(siape);
                    
                        System.out.println("Insira a senha: ");
                        String senha = scan.next();
                    
                        if(professor.login(senha)){
                            System.out.println("Login efetuado");
                        }else{
                            System.out.println("Senha incorreta");
                        }
                    }catch(Exception e){
                        System.out.println("ERRO, Siape nao cadastrado");
                    }
                }
                
                case 7 -> {
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
