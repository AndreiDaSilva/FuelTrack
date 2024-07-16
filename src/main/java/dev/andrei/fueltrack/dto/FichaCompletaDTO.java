package dev.andrei.fueltrack.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FichaCompletaDTO {

    @JsonProperty("TipoVeiculo")
    private Long tipoVeiculo;

    @JsonProperty("Valor")
    private String valor;

    @JsonProperty("Marca")
    private String marca;

    @JsonProperty("Modelo")
    private String modelo;

    @JsonProperty("AnoModelo")
    private Long anoModelo;

    @JsonProperty("Combustivel")
    private String combustivel;

    @JsonProperty("CodigoFipe")
    private String codigoFipe;

    @JsonProperty("MesReferencia")
    private String mesReferencia;

    @JsonProperty("SiglaCombustivel")
    private char siglaCombustivel;

    /**
     * 
     */
    public FichaCompletaDTO() {
    }

    /**
     * @return the tipoVeiculo
     */
    public Long getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * @param tipoVeiculo the tipoVeiculo to set
     */
    public void setTipoVeiculo(Long tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the anoModelo
     */
    public Long getAnoModelo() {
        return anoModelo;
    }

    /**
     * @param anoModelo the anoModelo to set
     */
    public void setAnoModelo(Long anoModelo) {
        this.anoModelo = anoModelo;
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the codigoFipe
     */
    public String getCodigoFipe() {
        return codigoFipe;
    }

    /**
     * @param codigoFipe the codigoFipe to set
     */
    public void setCodigoFipe(String codigoFipe) {
        this.codigoFipe = codigoFipe;
    }

    /**
     * @return the mesReferencia
     */
    public String getMesReferencia() {
        return mesReferencia;
    }

    /**
     * @param mesReferencia the mesReferencia to set
     */
    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    /**
     * @return the siglaCombustivel
     */
    public char getSiglaCombustivel() {
        return siglaCombustivel;
    }

    /**
     * @param siglaCombustivel the siglaCombustivel to set
     */
    public void setSiglaCombustivel(char siglaCombustivel) {
        this.siglaCombustivel = siglaCombustivel;
    }

    
}
