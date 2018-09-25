package mx.gob.cnbv.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import mx.gob.cnbv.web.api.model.Periodo;
import mx.gob.cnbv.web.api.model.TemplateReporteCatalogoConceptos;
import mx.gob.cnbv.web.api.model.TipoFlujo;
import mx.gob.cnbv.web.api.model.TipoReporte;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reporte
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class Reporte   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("fechaLimiteRecepcion")
  private LocalDate fechaLimiteRecepcion = null;

  @JsonProperty("fechaSolicitud")
  private LocalDate fechaSolicitud = null;

  @JsonProperty("periodo")
  private Periodo periodo = null;

  @JsonProperty("tipoFlujo")
  private TipoFlujo tipoFlujo = null;

  @JsonProperty("tipoReporte")
  private TipoReporte tipoReporte = null;

  @JsonProperty("templateReporteCatalogoConceptos")
  private TemplateReporteCatalogoConceptos templateReporteCatalogoConceptos = null;

  public Reporte id(String id) {
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

  public Reporte fechaLimiteRecepcion(LocalDate fechaLimiteRecepcion) {
    this.fechaLimiteRecepcion = fechaLimiteRecepcion;
    return this;
  }

  /**
   * Get fechaLimiteRecepcion
   * @return fechaLimiteRecepcion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getFechaLimiteRecepcion() {
    return fechaLimiteRecepcion;
  }

  public void setFechaLimiteRecepcion(LocalDate fechaLimiteRecepcion) {
    this.fechaLimiteRecepcion = fechaLimiteRecepcion;
  }

  public Reporte fechaSolicitud(LocalDate fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
    return this;
  }

  /**
   * Get fechaSolicitud
   * @return fechaSolicitud
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getFechaSolicitud() {
    return fechaSolicitud;
  }

  public void setFechaSolicitud(LocalDate fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
  }

  public Reporte periodo(Periodo periodo) {
    this.periodo = periodo;
    return this;
  }

  /**
   * Get periodo
   * @return periodo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Periodo getPeriodo() {
    return periodo;
  }

  public void setPeriodo(Periodo periodo) {
    this.periodo = periodo;
  }

  public Reporte tipoFlujo(TipoFlujo tipoFlujo) {
    this.tipoFlujo = tipoFlujo;
    return this;
  }

  /**
   * Get tipoFlujo
   * @return tipoFlujo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TipoFlujo getTipoFlujo() {
    return tipoFlujo;
  }

  public void setTipoFlujo(TipoFlujo tipoFlujo) {
    this.tipoFlujo = tipoFlujo;
  }

  public Reporte tipoReporte(TipoReporte tipoReporte) {
    this.tipoReporte = tipoReporte;
    return this;
  }

  /**
   * Get tipoReporte
   * @return tipoReporte
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TipoReporte getTipoReporte() {
    return tipoReporte;
  }

  public void setTipoReporte(TipoReporte tipoReporte) {
    this.tipoReporte = tipoReporte;
  }

  public Reporte templateReporteCatalogoConceptos(TemplateReporteCatalogoConceptos templateReporteCatalogoConceptos) {
    this.templateReporteCatalogoConceptos = templateReporteCatalogoConceptos;
    return this;
  }

  /**
   * Get templateReporteCatalogoConceptos
   * @return templateReporteCatalogoConceptos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TemplateReporteCatalogoConceptos getTemplateReporteCatalogoConceptos() {
    return templateReporteCatalogoConceptos;
  }

  public void setTemplateReporteCatalogoConceptos(TemplateReporteCatalogoConceptos templateReporteCatalogoConceptos) {
    this.templateReporteCatalogoConceptos = templateReporteCatalogoConceptos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reporte reporte = (Reporte) o;
    return Objects.equals(this.id, reporte.id) &&
        Objects.equals(this.fechaLimiteRecepcion, reporte.fechaLimiteRecepcion) &&
        Objects.equals(this.fechaSolicitud, reporte.fechaSolicitud) &&
        Objects.equals(this.periodo, reporte.periodo) &&
        Objects.equals(this.tipoFlujo, reporte.tipoFlujo) &&
        Objects.equals(this.tipoReporte, reporte.tipoReporte) &&
        Objects.equals(this.templateReporteCatalogoConceptos, reporte.templateReporteCatalogoConceptos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fechaLimiteRecepcion, fechaSolicitud, periodo, tipoFlujo, tipoReporte, templateReporteCatalogoConceptos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reporte {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fechaLimiteRecepcion: ").append(toIndentedString(fechaLimiteRecepcion)).append("\n");
    sb.append("    fechaSolicitud: ").append(toIndentedString(fechaSolicitud)).append("\n");
    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
    sb.append("    tipoFlujo: ").append(toIndentedString(tipoFlujo)).append("\n");
    sb.append("    tipoReporte: ").append(toIndentedString(tipoReporte)).append("\n");
    sb.append("    templateReporteCatalogoConceptos: ").append(toIndentedString(templateReporteCatalogoConceptos)).append("\n");
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

