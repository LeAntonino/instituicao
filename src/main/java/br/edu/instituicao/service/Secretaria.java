package br.edu.instituicao.service;

import br.edu.instituicao.model.Aluno;
import br.edu.instituicao.model.Coordenador;
import java.util.ArrayList;
import br.edu.instituicao.model.Pessoa;
import br.edu.instituicao.model.Professor;

public class Secretaria {
    private final ArrayList<Pessoa> Pessoas = new ArrayList<>();
    
    /*
    [PADRAO] o padrão Singleton foi implementado a seguir, para evitar que multiplas instâncias de Secretaria sejam
    criadas, assim evitando a possibilidade de conflitos entre multiplas instancias e evitando o desperdicio de
    memoria potencialmente criado caso multiplas instâncias existirem
    */
    
    private static Secretaria instance;

    private Secretaria() {
    }
    
    public static Secretaria getInstance(){ 
        if(instance == null){
            instance = new Secretaria();
        }    
        return instance;
    }
    
    /*
    Fim do padrão Singleton
    */
    
    public void Adicionar(Pessoa p){
        for(Pessoa q : Pessoas){
            if (p.getCpf() == q.getCpf()){
                System.out.println("ERRO, CPF JA CADASTRADO");
                return;
            }
            else if(p instanceof Aluno aluno && q instanceof Aluno aluno2){
                if(aluno.getMatricula() == aluno2.getMatricula()){
                    System.out.println("ERRO, MATRICULA JA CADASTRADA");
                    return;
                }
            }
            else if(p instanceof Professor professor && q instanceof Professor professor2){
                if(professor.getSiape() == professor2.getSiape()){
                    System.out.println("ERRO, SIAPE JA CADASTRADO");
                    return;
                }
            }
        }
        Pessoas.add(p);

    }
    
    public void Listar(){
        for(Pessoa p : Pessoas){
            if (p instanceof Aluno aluno){
                
                System.out.println("ALUNO | NOME: " + aluno.getNome() + " | CPF: " + aluno.getCpf() + " | EMAIL: " + aluno.getEmail() + 
                    " | MATRICULA: " + aluno.getMatricula() + " | MEDIA FINAL: " + aluno.getMediaFinal()
                );
                
            }else if (p instanceof Professor professor && !(p instanceof Coordenador)){
                
                System.out.println("PROFESSOR | NOME: " + professor.getNome() + " | CPF: " + professor.getCpf() + " | EMAIL: " + professor.getEmail() + 
                    " | SIAPE: " + professor.getSiape());
                
            }else if (p instanceof Coordenador coordenador){
                
                System.out.println("COORDENADOR | NOME: " + coordenador.getNome() + " | CPF: " + coordenador.getCpf() + " | EMAIL: " + coordenador.getEmail() + 
                    " | SIAPE: " + coordenador.getSiape());
                
            }
        }
    }
    
    public Aluno Localizar(long Matricula){
        for(Pessoa p : Pessoas){
            if(p instanceof Aluno aluno){
                if(aluno.getMatricula() == Matricula){
                    return aluno;
                }
            }
            else{
                System.out.println("Erro, matricula nao cadastrada");
                return null;
            }
        }
        return null;
    }
    
    public Professor LocalizarProfessor (long Siape){
        for(Pessoa p : Pessoas){
            if(p instanceof Professor professor){
                if(professor.getSiape() == Siape){
                    return professor;
                }
            }
            else{
                System.out.println("Erro, Siape nao cadastrado");
                return null;
            }
        }
        return null;
    }
    
    
    
}
