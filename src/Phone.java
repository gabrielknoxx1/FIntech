import java.util.Date;
import java.util.List;

public class Phone {
    private String numDdd;
    private String numPhone;
    private String numRamal;
    private int seqIdTipoPhone; // FK
    private String codUser; // FK
    private String numCpf; // FK

    public String getPhoneData() {
        return "Telefone: (" + this.numDdd + ") " + this.numTelefone + ". O método getPhoneData da classe Telefone foi executado.";
    }

}
