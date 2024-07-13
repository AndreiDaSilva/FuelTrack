package dev.andrei.fueltrack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Carro")
public class Veiculo {
    @Id
    @Column(name = "codigo_carro")
    private Long codigoCarro;

    @Column(length = 50, nullable = false)
    private String marca;

    @Column(length = 50, nullable = false)
    private String modelo;

    @Column(length = 50, nullable = false)
    private String tipo;

    /**
     * @return the id
     */
    public Long getId() {
        return codigoCarro;
    }

    /**
     * @param codigoCarro the marca to set
     */
    public void setCodigoCarro(Long codigoCarro){
        this.codigoCarro = codigoCarro;
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
    
    
}   