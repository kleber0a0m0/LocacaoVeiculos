public class VeiculoMedio implements Veiculo{
    private String modelo;

    public VeiculoMedio(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double precoDiaria() {//Preço Base: 150 reais
        return 150;
    }

    @Override
    public String getModelo() {
        return modelo;
    }
}
