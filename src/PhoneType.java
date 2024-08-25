import java.util.Date;
import java.util.List;

public class PhoneType {
    private int seqIdTipoFone; // PK
    private String descriptionPhone;

    public String getTypePhoneData() {
        return "Tipo de Telefone: " + this.descriptionPhone + ". O método getTypePhoneData da classe TipoTelefone foi executado.";
    }
}
