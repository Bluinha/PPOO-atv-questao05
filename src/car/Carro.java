package car;

public class Carro extends PecaComposta {

    public Carro(String nome) {
        super(nome);
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    public void exibirDetalhes() {
        System.out.println("==== " + getNome() + " ====");
        System.out.println("Peso total: " + getPeso() + " kg");
    }
}
