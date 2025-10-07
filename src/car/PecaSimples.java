package car;

public class PecaSimples implements ComponenteCarro {
	 private String nome;
	    private double peso;

	    public PecaSimples(String nome, double peso) {
	        this.nome = nome;
	        this.peso = peso;
	    }

	    @Override
	    public double getPeso() {
	        return peso;
	    }

	    @Override
	    public String getNome() {
	        return nome;
	    }
}
