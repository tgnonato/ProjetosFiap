package api_company.eletric.eletrodomesticos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class EletrodomesticoDTO {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O modelo é obrigatório")
    private String modelo;

    @NotNull(message = "A potência é obrigatória")
    private Double potencia;

    @NotBlank(message = "A data de fabricação é obrigatória")
    private String dataFabricacao;

    @NotBlank(message = "O fabricante é obrigatório")
    private String fabricante;

    public EletrodomesticoDTO() {
    }

    public EletrodomesticoDTO(String nome, String modelo, Double potencia, String dataFabricacao, String fabricante) {
        this.nome = nome;
        this.modelo = modelo;
        this.potencia = potencia;
        this.dataFabricacao = dataFabricacao;
        this.fabricante = fabricante;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
