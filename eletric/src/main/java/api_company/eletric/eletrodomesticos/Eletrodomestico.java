package api_company.eletric.eletrodomesticos;
import java.time.LocalDate;

public class Eletrodomestico {
    private String nome;
    private String modelo;
    private double potencia;
    private LocalDate dataFabricacao;
    private String fabricante;

    public Eletrodomestico() {
    }

    public Eletrodomestico(String nome, String modelo, double potencia, LocalDate dataFabricacao, String fabricante) {
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

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
