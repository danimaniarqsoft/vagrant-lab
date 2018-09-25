package mx.gob.cnbv.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ColumnaReporte
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class ColumnaReporte   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("min")
  private String min = null;

  @JsonProperty("max")
  private String max = null;

  @JsonProperty("requerida")
  private Boolean requerida = null;

  @JsonProperty("formato")
  private String formato = null;

  @JsonProperty("catalogoRelacionado")
  private String catalogoRelacionado = null;

  public ColumnaReporte id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ColumnaReporte nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(value = "")


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ColumnaReporte min(String min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
  **/
  @ApiModelProperty(value = "")


  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }

  public ColumnaReporte max(String max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
  **/
  @ApiModelProperty(value = "")


  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public ColumnaReporte requerida(Boolean requerida) {
    this.requerida = requerida;
    return this;
  }

  /**
   * Get requerida
   * @return requerida
  **/
  @ApiModelProperty(value = "")


  public Boolean isRequerida() {
    return requerida;
  }

  public void setRequerida(Boolean requerida) {
    this.requerida = requerida;
  }

  public ColumnaReporte formato(String formato) {
    this.formato = formato;
    return this;
  }

  /**
   * Get formato
   * @return formato
  **/
  @ApiModelProperty(value = "")


  public String getFormato() {
    return formato;
  }

  public void setFormato(String formato) {
    this.formato = formato;
  }

  public ColumnaReporte catalogoRelacionado(String catalogoRelacionado) {
    this.catalogoRelacionado = catalogoRelacionado;
    return this;
  }

  /**
   * Get catalogoRelacionado
   * @return catalogoRelacionado
  **/
  @ApiModelProperty(value = "")


  public String getCatalogoRelacionado() {
    return catalogoRelacionado;
  }

  public void setCatalogoRelacionado(String catalogoRelacionado) {
    this.catalogoRelacionado = catalogoRelacionado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnaReporte columnaReporte = (ColumnaReporte) o;
    return Objects.equals(this.id, columnaReporte.id) &&
        Objects.equals(this.nombre, columnaReporte.nombre) &&
        Objects.equals(this.min, columnaReporte.min) &&
        Objects.equals(this.max, columnaReporte.max) &&
        Objects.equals(this.requerida, columnaReporte.requerida) &&
        Objects.equals(this.formato, columnaReporte.formato) &&
        Objects.equals(this.catalogoRelacionado, columnaReporte.catalogoRelacionado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, min, max, requerida, formato, catalogoRelacionado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnaReporte {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    requerida: ").append(toIndentedString(requerida)).append("\n");
    sb.append("    formato: ").append(toIndentedString(formato)).append("\n");
    sb.append("    catalogoRelacionado: ").append(toIndentedString(catalogoRelacionado)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

