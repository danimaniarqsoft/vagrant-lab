package mx.gob.cnbv.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import mx.gob.cnbv.web.api.model.EstadoReporte;
import mx.gob.cnbv.web.api.model.Reporte;
import mx.gob.cnbv.web.api.model.TipoFlujo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolicitudReporte
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class SolicitudReporte   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("estadoReporte")
  private EstadoReporte estadoReporte = null;

  @JsonProperty("fechaRecepcion")
  private LocalDate fechaRecepcion = null;

  @JsonProperty("numeroEnvios")
  private Integer numeroEnvios = null;

  @JsonProperty("reporte")
  private Reporte reporte = null;

  @JsonProperty("tipoFlujo")
  private TipoFlujo tipoFlujo = null;

  public SolicitudReporte id(String id) {
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

  public SolicitudReporte estadoReporte(EstadoReporte estadoReporte) {
    this.estadoReporte = estadoReporte;
    return this;
  }

  /**
   * Get estadoReporte
   * @return estadoReporte
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EstadoReporte getEstadoReporte() {
    return estadoReporte;
  }

  public void setEstadoReporte(EstadoReporte estadoReporte) {
    this.estadoReporte = estadoReporte;
  }

  public SolicitudReporte fechaRecepcion(LocalDate fechaRecepcion) {
    this.fechaRecepcion = fechaRecepcion;
    return this;
  }

  /**
   * Get fechaRecepcion
   * @return fechaRecepcion
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getFechaRecepcion() {
    return fechaRecepcion;
  }

  public void setFechaRecepcion(LocalDate fechaRecepcion) {
    this.fechaRecepcion = fechaRecepcion;
  }

  public SolicitudReporte numeroEnvios(Integer numeroEnvios) {
    this.numeroEnvios = numeroEnvios;
    return this;
  }

  /**
   * Get numeroEnvios
   * @return numeroEnvios
  **/
  @ApiModelProperty(value = "")


  public Integer getNumeroEnvios() {
    return numeroEnvios;
  }

  public void setNumeroEnvios(Integer numeroEnvios) {
    this.numeroEnvios = numeroEnvios;
  }

  public SolicitudReporte reporte(Reporte reporte) {
    this.reporte = reporte;
    return this;
  }

  /**
   * Get reporte
   * @return reporte
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Reporte getReporte() {
    return reporte;
  }

  public void setReporte(Reporte reporte) {
    this.reporte = reporte;
  }

  public SolicitudReporte tipoFlujo(TipoFlujo tipoFlujo) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudReporte solicitudReporte = (SolicitudReporte) o;
    return Objects.equals(this.id, solicitudReporte.id) &&
        Objects.equals(this.estadoReporte, solicitudReporte.estadoReporte) &&
        Objects.equals(this.fechaRecepcion, solicitudReporte.fechaRecepcion) &&
        Objects.equals(this.numeroEnvios, solicitudReporte.numeroEnvios) &&
        Objects.equals(this.reporte, solicitudReporte.reporte) &&
        Objects.equals(this.tipoFlujo, solicitudReporte.tipoFlujo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, estadoReporte, fechaRecepcion, numeroEnvios, reporte, tipoFlujo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudReporte {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    estadoReporte: ").append(toIndentedString(estadoReporte)).append("\n");
    sb.append("    fechaRecepcion: ").append(toIndentedString(fechaRecepcion)).append("\n");
    sb.append("    numeroEnvios: ").append(toIndentedString(numeroEnvios)).append("\n");
    sb.append("    reporte: ").append(toIndentedString(reporte)).append("\n");
    sb.append("    tipoFlujo: ").append(toIndentedString(tipoFlujo)).append("\n");
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

