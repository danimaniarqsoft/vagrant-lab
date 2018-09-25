package mx.gob.cnbv.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import mx.gob.cnbv.web.api.model.CatalogoConceptos;
import mx.gob.cnbv.web.api.model.TemplateReporte;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TemplateReporteCatalogoConceptos
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class TemplateReporteCatalogoConceptos   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("periodicidad")
  private String periodicidad = null;

  @JsonProperty("vigenciaInicio")
  private String vigenciaInicio = null;

  @JsonProperty("vigenciaFin")
  private String vigenciaFin = null;

  @JsonProperty("TemplateReporte")
  private TemplateReporte templateReporte = null;

  @JsonProperty("catalogoConceptos")
  private CatalogoConceptos catalogoConceptos = null;

  public TemplateReporteCatalogoConceptos id(String id) {
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

  public TemplateReporteCatalogoConceptos periodicidad(String periodicidad) {
    this.periodicidad = periodicidad;
    return this;
  }

  /**
   * Get periodicidad
   * @return periodicidad
  **/
  @ApiModelProperty(value = "")


  public String getPeriodicidad() {
    return periodicidad;
  }

  public void setPeriodicidad(String periodicidad) {
    this.periodicidad = periodicidad;
  }

  public TemplateReporteCatalogoConceptos vigenciaInicio(String vigenciaInicio) {
    this.vigenciaInicio = vigenciaInicio;
    return this;
  }

  /**
   * Get vigenciaInicio
   * @return vigenciaInicio
  **/
  @ApiModelProperty(value = "")


  public String getVigenciaInicio() {
    return vigenciaInicio;
  }

  public void setVigenciaInicio(String vigenciaInicio) {
    this.vigenciaInicio = vigenciaInicio;
  }

  public TemplateReporteCatalogoConceptos vigenciaFin(String vigenciaFin) {
    this.vigenciaFin = vigenciaFin;
    return this;
  }

  /**
   * Get vigenciaFin
   * @return vigenciaFin
  **/
  @ApiModelProperty(value = "")


  public String getVigenciaFin() {
    return vigenciaFin;
  }

  public void setVigenciaFin(String vigenciaFin) {
    this.vigenciaFin = vigenciaFin;
  }

  public TemplateReporteCatalogoConceptos templateReporte(TemplateReporte templateReporte) {
    this.templateReporte = templateReporte;
    return this;
  }

  /**
   * Get templateReporte
   * @return templateReporte
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TemplateReporte getTemplateReporte() {
    return templateReporte;
  }

  public void setTemplateReporte(TemplateReporte templateReporte) {
    this.templateReporte = templateReporte;
  }

  public TemplateReporteCatalogoConceptos catalogoConceptos(CatalogoConceptos catalogoConceptos) {
    this.catalogoConceptos = catalogoConceptos;
    return this;
  }

  /**
   * Get catalogoConceptos
   * @return catalogoConceptos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CatalogoConceptos getCatalogoConceptos() {
    return catalogoConceptos;
  }

  public void setCatalogoConceptos(CatalogoConceptos catalogoConceptos) {
    this.catalogoConceptos = catalogoConceptos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateReporteCatalogoConceptos templateReporteCatalogoConceptos = (TemplateReporteCatalogoConceptos) o;
    return Objects.equals(this.id, templateReporteCatalogoConceptos.id) &&
        Objects.equals(this.periodicidad, templateReporteCatalogoConceptos.periodicidad) &&
        Objects.equals(this.vigenciaInicio, templateReporteCatalogoConceptos.vigenciaInicio) &&
        Objects.equals(this.vigenciaFin, templateReporteCatalogoConceptos.vigenciaFin) &&
        Objects.equals(this.templateReporte, templateReporteCatalogoConceptos.templateReporte) &&
        Objects.equals(this.catalogoConceptos, templateReporteCatalogoConceptos.catalogoConceptos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, periodicidad, vigenciaInicio, vigenciaFin, templateReporte, catalogoConceptos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateReporteCatalogoConceptos {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    periodicidad: ").append(toIndentedString(periodicidad)).append("\n");
    sb.append("    vigenciaInicio: ").append(toIndentedString(vigenciaInicio)).append("\n");
    sb.append("    vigenciaFin: ").append(toIndentedString(vigenciaFin)).append("\n");
    sb.append("    templateReporte: ").append(toIndentedString(templateReporte)).append("\n");
    sb.append("    catalogoConceptos: ").append(toIndentedString(catalogoConceptos)).append("\n");
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

