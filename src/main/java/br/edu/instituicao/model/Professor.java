package br.edu.instituicao.model;
import br.edu.instituicao.interfaces.Autenticavel;


public class Professor extends Pessoa implements Autenticavel{
    private long siape;
    private String senha;

    public long getSiape() {
        return siape;
    }

    public void setSiape(long siape) {
        this.siape = siape;
    }

    protected String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean login(String senha){
        String senhareal = this.getSenha();
        boolean flag = false;
        if (senha.equals(senhareal)){
            flag = true;
        }
        return flag;
    }
    
}
