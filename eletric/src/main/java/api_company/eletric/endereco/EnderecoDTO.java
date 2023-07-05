package api_company.eletric.endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class EnderecoDTO {

    @NotBlank(message = "O campo rua é obrigatório")
    private String rua;
    @Pattern(regexp = "\\d+", message = "O campo número deve conter apenas dígitos")
    private String numero;
    @NotBlank(message = "O campo bairro é obrigatório")
    private String bairro;
    @NotBlank(message = "O campo cidade é obrigatório")
    private String cidade;
    @NotBlank(message = "O campo estado é obrigatório")
    private String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
