package br.edu.instituicao.service;

import br.edu.instituicao.interfaces.Avaliavel;

public class RelatorioAcademico { 
    
    private double mediaglobal;
    private int numerodealunos;
    
    public double getMediaglobal() {
        return mediaglobal;
    }

    public int getNumerodealunos() {
        return numerodealunos;
    }
    
    
    public double adicionarDados(Avaliavel objeto){
        double somatotal = (objeto.getMediaFinal() + (mediaglobal * numerodealunos));
        numerodealunos += 1;
        
        mediaglobal = somatotal/numerodealunos;
        return mediaglobal;
    }
}
