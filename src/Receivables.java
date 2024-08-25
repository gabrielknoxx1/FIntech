import java.util.Date;
import java.util.List;

public class Receivables {
    private String codRecebivel; // UNIQUEIDENTIFIER
    private String desRecebivel;
    private double valRecebivelMes;
    private String codUser; // FK
    private String numCpf; // FK

    public String getRecebivelData() {
        return "Recebível: " + this.desRecebivel + ", Valor: " + this.valRecebivelMes + ". O método getRecebivelData da classe Recebivel foi executado.";
    }
}
