package padroesestruturais.flyweight;

import padroesestruturais.flyweight.Cidade;

public class Professor {

    private String nome;
    private Cidade cidadeFaculdade;

    public Medico(String nome, Cidade cidadeHospital) {
        this.nome = nome;
        this.cidadeHospital = cidadeHospital;
    }

    public String obterMedico() {
        return "Professor{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeFaculdade.getNome() + '\'' +
                ", uf='" + cidadeFaculdade.getUf() + '\'' +
                '}';
    }
}
