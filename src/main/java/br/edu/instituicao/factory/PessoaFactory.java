
package br.edu.instituicao.factory;

import br.edu.instituicao.model.Aluno;
import br.edu.instituicao.model.Coordenador;
import br.edu.instituicao.model.Pessoa;
import br.edu.instituicao.model.Professor;

/*
    [PADRAO] o Padrão factory foi criado a seguir, para separar a criação de objetos do main, assim
    mantendo a responsabilidade da criação de objetos para uma classe específicamente designada para isso
*/

public abstract class PessoaFactory {
    
    public static Pessoa criarPessoa(String request) {
        
        if(null != request)switch (request) {
            case "aluno" -> {
                return new Aluno();
            }
            case "professor" -> {
                return new Professor();
            }
            case "coordenador" -> {
                return new Coordenador();
            }
            default -> {
            }
        }
        return null;
    }
    
}
