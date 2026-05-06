package br.edu.instituicao.model;

import br.edu.instituicao.interfaces.Autenticavel;


public class Coordenador extends Professor implements Autenticavel {
    @Override
    public boolean login(String senha){
        String senhareal = "senhadocoordenador";
        boolean flag = false;
        if (senha.equals(senhareal)){
            flag = true;
        }
        return flag;
    }
}
