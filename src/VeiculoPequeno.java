public class VeiculoPequeno implements Veiculo{

    String modelo;

    public VeiculoPequeno(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double precoDiaria() {//Preço Base: 100 reais
        return 100;
    }

    @Override
    public String getModelo() {
        return modelo;
    }
}
