package car;

public class Carro extends PecaComposta {
    public Carro(String nome) {
        super(nome);
    }

    public void exibirDetalhes() {
        System.out.println("\n=== " + getNome() + " ===");
        double pesoTotal = getPeso();
        System.out.println("\nPeso total do carro: " + pesoTotal + " kg");
    }
}
