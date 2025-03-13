package com.sena.crud_basic.DTO;

public class responseDTO {

    private String mensagesDTO;
    private String status;

    public responseDTO(String mensagesDTO, String status) {
        this.mensagesDTO = mensagesDTO;
        this.status = status;
    }

    public String getMensagesDTO() {
        return mensagesDTO;
    }

    public String getStatus() {
        return status;
    }
    
    public void setMensagesDTO(String mensagesDTO) {
        this.mensagesDTO = mensagesDTO;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
