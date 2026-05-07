package br.edu.instituicao.model;

import br.edu.instituicao.interfaces.Avaliavel;

public class Aluno extends Pessoa implements Avaliavel {
    private long matricula;
    private double[] notas = {0,0,0,0};

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    @Override
    public double getMediaFinal(){
        double soma = 0;
        for(double i : notas){
            soma += i;
        }
        double media = soma/notas.length;
        return media;
    } 

    
}
