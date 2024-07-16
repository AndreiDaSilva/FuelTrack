package dev.andrei.fueltrack.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "abastecimento")
public class Abastecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "abastecimento_id")
    private Long id;

    @Column(name = "km_atual", nullable = false)
    private Integer kmAtual;

    @Column(name = "km_ultimo", nullable = false)
    private Integer kmUltimo;

    @Column(name = "data_abastecimento", nullable = false)
    private Date dataAbastecimento;

    @Column(name = "tipo_combustivel", length = 50, nullable = false)
    private String tipoCombustivel;

    @Column(name = "preco_litro", precision = 10, nullable = false)
    private Double precoLitro;

    @Column(name = "combustivel_total", precision = 10, nullable = false)
    private Double qtdTotalCombustivel;

    @Column(name = "preco_total", precision = 10, nullable = false)
    private Double precoTotal;

    @Column(name = "tanque_cheio", nullable = false)
    private Boolean tanqueCheio;

    @ManyToOne
    @JoinColumn(name = "carro_user_id", nullable = false)
    private UsuarioVeiculo carroUsuario;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the kmAtual
     */
    public Integer getKmAtual() {
        return kmAtual;
    }

    /**
     * @param kmAtual the kmAtual to set
     */
    public void setKmAtual(Integer kmAtual) {
        this.kmAtual = kmAtual;
    }

    /**
     * @return the kmUltimo
     */
    public Integer getKmUltimo() {
        return kmUltimo;
    }

    /**
     * @param kmUltimo the kmUltimo to set
     */
    public void setKmUltimo(Integer kmUltimo) {
        this.kmUltimo = kmUltimo;
    }

    /**
     * @return the dataAbastecimento
     */
    public Date getDataAbastecimento() {
        return dataAbastecimento;
    }

    /**
     * @param dataAbastecimento the dataAbastecimento to set
     */
    public void setDataAbastecimento(Date dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
    }

    /**
     * @return the tipoCombustivel
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * @param tipoCombustivel the tipoCombustivel to set
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * @return the precoLitro
     */
    public Double getPrecoLitro() {
        return precoLitro;
    }

    /**
     * @param precoLitro the precoLitro to set
     */
    public void setPrecoLitro(Double precoLitro) {
        this.precoLitro = precoLitro;
    }

    /**
     * @return the qtdTotalCombustivel
     */
    public Double getQtdTotalCombustivel() {
        return qtdTotalCombustivel;
    }

    /**
     * @param qtdTotalCombustivel the qtdTotalCombustivel to set
     */
    public void setQtdTotalCombustivel(Double qtdTotalCombustivel) {
        this.qtdTotalCombustivel = qtdTotalCombustivel;
    }

    /**
     * @return the precoTotal
     */
    public Double getPrecoTotal() {
        return precoTotal;
    }

    /**
     * @param precoTotal the precoTotal to set
     */
    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    /**
     * @return the tanqueCheio
     */
    public Boolean getTanqueCheio() {
        return tanqueCheio;
    }

    /**
     * @param tanqueCheio the tanqueCheio to set
     */
    public void setTanqueCheio(Boolean tanqueCheio) {
        this.tanqueCheio = tanqueCheio;
    }

    /**
     * @return the carroUsuario
     */
    public UsuarioVeiculo getCarroUsuario() {
        return carroUsuario;
    }

    /**
     * @param carroUsuario the carroUsuario to set
     */
    public void setCarroUsuario(UsuarioVeiculo carroUsuario) {
        this.carroUsuario = carroUsuario;
    }

    
        
}
