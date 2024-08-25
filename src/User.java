import java.util.Date;
import java.util.List;

public class User {
    private String codUser;
    private String codEmail;
    private String txtPassword;
    private String nomUser;
    private String numCpf;
    private Date datNascimento;
    private String txtNaturalidade;
    private String txtUfNaturalidade;
    private String nomFiliacao1;
    private String nomFiliacao2;
    private int indSexo;
    private int indEstadoCivil;
    private int indRaca;
    private List<Recebivel> recebiveis;
    private List<Gasto> gastos;
    private List<Endereco> enderecos;
    private List<Telefone> telefones;

    public String getUserData() {
        return "User Data: " + this.nomUser + ", CPF: " + this.numCpf + ". O método getUserData da classe User foi executado.";
    }

}
