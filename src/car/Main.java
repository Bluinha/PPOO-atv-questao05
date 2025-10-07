package car;

public class Main {
	
	public static void main(String[] args) {
        // Peças simples
        ComponenteCarro motor = new PecaSimples("Motor", 250);
        ComponenteCarro transmissao = new PecaSimples("Transmissão", 100);
        ComponenteCarro diferencial = new PecaSimples("Diferencial", 80);
        ComponenteCarro rodas = new PecaSimples("Rodas", 50);
        ComponenteCarro suspensao = new PecaSimples("Suspensão", 40);
        ComponenteCarro carroceria = new PecaSimples("Carroceria", 300);
        ComponenteCarro capo = new PecaSimples("Capô", 30);

        // Trem de força
        PecaComposta tremDeForca = new PecaComposta("Trem de Força");
        tremDeForca.adicionar(motor);
        tremDeForca.adicionar(transmissao);
        tremDeForca.adicionar(diferencial);
        tremDeForca.adicionar(rodas);

        // Chassi
        PecaComposta chassi = new PecaComposta("Chassi");
        chassi.adicionar(tremDeForca);
        chassi.adicionar(suspensao);

        // Carro (classe concreta que estende PecaComposta)
        Carro carro = new Carro("Carro Esportivo");
        carro.adicionar(chassi);
        carro.adicionar(carroceria);
        carro.adicionar(capo);

        // Exibir resultado
        carro.exibirDetalhes();
    }


}
