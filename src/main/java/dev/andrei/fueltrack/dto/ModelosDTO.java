package dev.andrei.fueltrack.dto;

import java.util.List;

public class ModelosDTO {

    private List<ModeloDTO> modelos;
    private List<AnoDTO> anos;

    /**
     * 
     */
    public ModelosDTO() {
    }

    /**
     * @return the modelos
     */
    public List<ModeloDTO> getModelos() {
        return modelos;
    }

    /**
     * @param modelos the modelos to set
     */
    public void setModelos(List<ModeloDTO> modelos) {
        this.modelos = modelos;
    }

    /**
     * @return the anos
     */
    public List<AnoDTO> getAnos() {
        return anos;
    }

    /**
     * @param anos the anos to set
     */
    public void setAnos(List<AnoDTO> anos) {
        this.anos = anos;
    }

    
}   
