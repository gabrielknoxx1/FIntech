import java.util.Date;
import java.util.List;

public class Address {
    private String numCep;
    private String namePlace;
    private String numResidential;
    private String txtComplement;
    private String neighborhood;
    private String city;
    private String uf;
    private String codUser; // FK
    private String numCpf; // FK

    public String getAddressData() {
        return "Endereço: " + this.nomLogradouro + ", Bairro: " + this.nomBairro + ". O método getAddressData da classe Endereco foi executado.";
    }
}
