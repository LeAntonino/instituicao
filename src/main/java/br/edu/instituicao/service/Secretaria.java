package br.edu.instituicao.service;

import br.edu.instituicao.model.Aluno;
import br.edu.instituicao.model.Coordenador;
import java.util.ArrayList;
import br.edu.instituicao.model.Pessoa;
import br.edu.instituicao.model.Professor;

public class Secretaria {
    private final ArrayList<Pessoa> Pessoas = new ArrayList<>();
    
    
    public void Adicionar(Pessoa p){
        for(Pessoa q : Pessoas){
            if (p.getCpf() == q.getCpf()){
                System.out.println("ERRO, CPF JA CADASTRADO");
            }
            if(p instanceof Aluno aluno && q instanceof Aluno aluno2){
                if(aluno.getMatricula() == aluno2.getMatricula()){
                    System.out.println("ERRO, MATRICULA JA CADASTRADA");
                }
            }
        }

    }
    
    public void Listar(){
        for(Pessoa p : Pessoas){
            if (p instanceof Aluno aluno){
                
                System.out.println("ALUNO | NOME: " + aluno.getNome() + " | CPF: " + aluno.getCpf() + " | EMAIL: " + aluno.getEmail() + 
                    " | MATRICULA: " + aluno.getMatricula() + " | MEDIA FINAL: " + aluno.getMediaFinal()
                );
                
            }else if (p instanceof Professor professor){
                
                System.out.println("PROFESSOR | NOME: " + professor.getNome() + " | CPF: " + professor.getCpf() + " | EMAIL: " + professor.getEmail() + 
                    " | SIAPE: " + professor.getSiape());
                
            }else if (p instanceof Coordenador coordenador){
                
                System.out.println("COORDENADOR | NOME: " + coordenador.getNome() + " | CPF: " + coordenador.getCpf() + " | EMAIL: " + coordenador.getEmail() + 
                    " | SIAPE: " + coordenador.getSiape());
                
            }
        }
    }
    
    public Aluno Localizar(int Matricula){
        for(Pessoa p : Pessoas){
            if(p instanceof Aluno aluno){
                if(aluno.getMatricula() == Matricula){
                    return aluno;
                }
            }      
        }
        return null;
    }
    
    
    
}
