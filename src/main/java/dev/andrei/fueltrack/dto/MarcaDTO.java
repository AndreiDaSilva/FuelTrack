package dev.andrei.fueltrack.dto;

public class MarcaDTO {
    private Long codigo;
    private String nome;

    public MarcaDTO(){
    }

    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the marca
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param marca the marca to set
     */
    public void setNome(String marca) {
        this.nome = marca;
    }

}