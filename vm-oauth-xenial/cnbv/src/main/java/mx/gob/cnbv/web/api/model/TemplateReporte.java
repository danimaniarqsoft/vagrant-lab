package mx.gob.cnbv.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import mx.gob.cnbv.web.api.model.ColumnaReporte;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TemplateReporte
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class TemplateReporte   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  @JsonProperty("descripcionCorta")
  private String descripcionCorta = null;

  @JsonProperty("elementosPorPagina")
  private Integer elementosPorPagina = null;

  @JsonProperty("maxErrores")
  private Integer maxErrores = null;

  @JsonProperty("columnas")
  @Valid
  private List<ColumnaReporte> columnas = null;

  public TemplateReporte id(String id) {
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

  public TemplateReporte version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public TemplateReporte descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Get descripcion
   * @return descripcion
  **/
  @ApiModelProperty(value = "")


  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public TemplateReporte descripcionCorta(String descripcionCorta) {
    this.descripcionCorta = descripcionCorta;
    return this;
  }

  /**
   * Get descripcionCorta
   * @return descripcionCorta
  **/
  @ApiModelProperty(value = "")


  public String getDescripcionCorta() {
    return descripcionCorta;
  }

  public void setDescripcionCorta(String descripcionCorta) {
    this.descripcionCorta = descripcionCorta;
  }

  public TemplateReporte elementosPorPagina(Integer elementosPorPagina) {
    this.elementosPorPagina = elementosPorPagina;
    return this;
  }

  /**
   * Get elementosPorPagina
   * @return elementosPorPagina
  **/
  @ApiModelProperty(value = "")


  public Integer getElementosPorPagina() {
    return elementosPorPagina;
  }

  public void setElementosPorPagina(Integer elementosPorPagina) {
    this.elementosPorPagina = elementosPorPagina;
  }

  public TemplateReporte maxErrores(Integer maxErrores) {
    this.maxErrores = maxErrores;
    return this;
  }

  /**
   * Get maxErrores
   * @return maxErrores
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxErrores() {
    return maxErrores;
  }

  public void setMaxErrores(Integer maxErrores) {
    this.maxErrores = maxErrores;
  }

  public TemplateReporte columnas(List<ColumnaReporte> columnas) {
    this.columnas = columnas;
    return this;
  }

  public TemplateReporte addColumnasItem(ColumnaReporte columnasItem) {
    if (this.columnas == null) {
      this.columnas = new ArrayList<>();
    }
    this.columnas.add(columnasItem);
    return this;
  }

  /**
   * Get columnas
   * @return columnas
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ColumnaReporte> getColumnas() {
    return columnas;
  }

  public void setColumnas(List<ColumnaReporte> columnas) {
    this.columnas = columnas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateReporte templateReporte = (TemplateReporte) o;
    return Objects.equals(this.id, templateReporte.id) &&
        Objects.equals(this.version, templateReporte.version) &&
        Objects.equals(this.descripcion, templateReporte.descripcion) &&
        Objects.equals(this.descripcionCorta, templateReporte.descripcionCorta) &&
        Objects.equals(this.elementosPorPagina, templateReporte.elementosPorPagina) &&
        Objects.equals(this.maxErrores, templateReporte.maxErrores) &&
        Objects.equals(this.columnas, templateReporte.columnas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, descripcion, descripcionCorta, elementosPorPagina, maxErrores, columnas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateReporte {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    descripcionCorta: ").append(toIndentedString(descripcionCorta)).append("\n");
    sb.append("    elementosPorPagina: ").append(toIndentedString(elementosPorPagina)).append("\n");
    sb.append("    maxErrores: ").append(toIndentedString(maxErrores)).append("\n");
    sb.append("    columnas: ").append(toIndentedString(columnas)).append("\n");
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

