package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private List<Professor> professor = new ArrayList<>();

    public void aula(String nomeProfessor, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Professor professor = new main.Professor(nomeProfessor, cidade);
        professores.add(professor);
    }

    public List<String> obterProfessores() {
        List<String> saida = new ArrayList<String>();
        for (Professor professor : this.professores) {
            saida.add(professor.obterProfessor());
        }
        return saida;
    }


}
