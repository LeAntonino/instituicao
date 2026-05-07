package br.edu.instituicao.model;

import br.edu.instituicao.interfaces.Avaliavel;

public class Aluno extends Pessoa implements Avaliavel {
    private int matricula;
    private float[] notas = {0,0,0,0};

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
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
