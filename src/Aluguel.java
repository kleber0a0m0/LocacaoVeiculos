import com.sun.org.apache.bcel.internal.generic.RET;
import javafx.scene.input.DataFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aluguel {
    Veiculo veiculo;
    Cliente cliente;

    int dias;
    LocalDateTime dataAluguel;

    public Aluguel(Veiculo veiculo, Cliente cliente, int dias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dias = dias;
        this.dataAluguel = LocalDateTime.now();
        this.detalhesAluguel();
    }

    private double desconto(int dias){
        if(this.cliente.getClass().getSimpleName().equals("PessoaFisica") && dias>5){
            return 5;
        }else if(this.cliente.getClass().getSimpleName().equals("PessoaJuridica") && dias>3){
            return 10;
        }else{
            return 0;
        }
    }

    public void detalhesAluguel(){
        System.out.println("=================================");
        System.out.println("Data Aluguel: "+dataAluguel.format(DateTimeFormatter.ofPattern("dd/MM/uuuu")));
        System.out.println("Cliente: "+cliente.getNome());
        System.out.println("Tipo Cliente: "+cliente.getTipo());
        System.out.println("Veiculo: "+veiculo.getModelo());
        System.out.println("Total de diarias: "+this.dias);
        System.out.println("Valor por diaria: R$"+veiculo.precoDiaria());
        System.out.println("Valor total sem desconto: R$"+(this.dias*veiculo.precoDiaria()));
        System.out.println("Desconto: "+this.desconto(this.dias)+"%");
        System.out.println("Valor total com desconto: R$"+(this.dias*veiculo.precoDiaria()-this.dias*veiculo.precoDiaria()*this.desconto(this.dias)/100));
        System.out.println("=================================");
    }
}
