import java.util.Date;
import java.util.List;

public class Expenses {

    private String codGasto; // UNIQUEIDENTIFIER
    private String descriptionExpanses;
    private double valueExpansesMonth;
    private String codUser; // FK
    private String numCpf; // FK

    public String getExpansesData() {
        return "Expanses: " + this.descriptionExpanses + ", Valor: " + this.valueExpansesMonth + ". O método getExpansesData da classe Gasto foi executado.";
    }
}
