package br.edu.instituicao.model;
import br.edu.instituicao.interfaces.Autenticavel;


public class Professor extends Pessoa implements Autenticavel{
    private int siape;
    private String senha;

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    @Override
    public boolean login(String senha){
        String senhareal = "senhadoprofessor";
        boolean flag = false;
        if (senha.equals(senhareal)){
            flag = true;
        }
        return flag;
    }
    
}
