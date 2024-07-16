package dev.andrei.fueltrack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carro_usuario")
public class UsuarioVeiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carro_user_id")
    private Long id;

    @Column(name = "capacidade_tanque", precision = 10, nullable = false)
    private Double totalTanque;

    @Column(name = "km_inicial", nullable = false)
    private Integer kmInicial;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "carro_id", nullable = false)
    private Veiculo carro;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the totalTanque
     */
    public Double getTotalTanque() {
        return totalTanque;
    }

    /**
     * @param totalTanque the totalTanque to set
     */
    public void setTotalTanque(Double totalTanque) {
        this.totalTanque = totalTanque;
    }

    /**
     * @return the kmInicial
     */
    public Integer getKmInicial() {
        return kmInicial;
    }

    /**
     * @param kmInicial the kmInicial to set
     */
    public void setKmInicial(Integer kmInicial) {
        this.kmInicial = kmInicial;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the carro
     */
    public Veiculo getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }

    
}
