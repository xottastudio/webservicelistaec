package com.xotta.consumirweb.dto;

public class InstitucionDTO {
    private String institucion;
    private String siglas;
    private String descripcion;
    private String url;

    // Constructor vacío
    public InstitucionDTO() {}

    // Constructor con parámetros
    public InstitucionDTO(String institucion, String siglas, String descripcion, String url) {
        this.institucion = institucion;
        this.siglas = siglas;
        this.descripcion = descripcion;
        this.url = url;
    }

    // Getters manuales (esto quitará el color rojo)
    public String getInstitucion() { return institucion; }
    public String getSiglas() { return siglas; }
    public String getDescripcion() { return descripcion; }
    public String getUrl() { return url; }

    // Setters manuales
    public void setInstitucion(String institucion) { this.institucion = institucion; }
    public void setSiglas(String siglas) { this.siglas = siglas; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setUrl(String url) { this.url = url; }
}

/*package com.xotta.consumirweb.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data // Esto genera Getters y Setters automáticamente con Lombok
@NoArgsConstructor
@AllArgsConstructor
public class InstitucionDTO {
    private String nombre;
    private String siglas;
    private String descripcion;
    private String contacto;
    // Puedes agregar más campos según lo que veas en el JSON de gob.ec
}*/