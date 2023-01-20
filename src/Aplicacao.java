public class Aplicacao {
    public static void main(String[] args) {

        Veiculo cheryqq = new VeiculoPequeno("CAOA Chery QQ");
        Veiculo palio = new VeiculoMedio("Fiat Palio");
        Veiculo blazer = new VeiculoSUV("Chevrolet Blazer");


        Cliente kleber = new PessoaFisica("Kleber Albino Moreira");
        Cliente kaua = new PessoaFisica("Kauã Francisco Moreira");
        Cliente arrozLTDA = new PessoaJuridica("Distribuidora Arroz LTDA");

        Aluguel alugarBlazerKleber = new Aluguel(blazer,kleber,8);
        Aluguel alugarCheryqqKleber = new Aluguel(cheryqq,kleber,2);
        Aluguel alugarpalioKaua = new Aluguel(palio,kaua,6);
        Aluguel aluguarPalioArrozLTDA = new Aluguel(palio,arrozLTDA,6);



    }
}