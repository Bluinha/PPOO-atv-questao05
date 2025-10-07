package car;

import java.util.ArrayList;
import java.util.List;

public class PecaComposta implements ComponenteCarro {
    private String nome;
    private List<ComponenteCarro> componentes = new ArrayList<>();

    public PecaComposta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteCarro componente) {
        componentes.add(componente);
    }

    public void remover(ComponenteCarro componente) {
        componentes.remove(componente);
    }

    @Override
    public double getPeso() {
        double total = 0;
        for (ComponenteCarro c : componentes) {
            total += c.getPeso();
        }
        return total;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
