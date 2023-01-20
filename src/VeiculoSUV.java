public class VeiculoSUV implements Veiculo{
    private String modelo;

    public VeiculoSUV(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double precoDiaria() {//Preço Base: 200 reais
        return 200;
    }

    @Override
    public String getModelo() {
        return modelo;
    }
}
