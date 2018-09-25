package mx.gob.cnbv.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import mx.gob.cnbv.web.api.model.SolicitudReporte;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Acuse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class Acuse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("cadenaOriginal")
  private String cadenaOriginal = null;

  @JsonProperty("fechaAcuse")
  private LocalDate fechaAcuse = null;

  @JsonProperty("selloDigital")
  private String selloDigital = null;

  @JsonProperty("solicitudReporte")
  private SolicitudReporte solicitudReporte = null;

  public Acuse id(String id) {
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

  public Acuse cadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
    return this;
  }

  /**
   * Get cadenaOriginal
   * @return cadenaOriginal
  **/
  @ApiModelProperty(value = "")


  public String getCadenaOriginal() {
    return cadenaOriginal;
  }

  public void setCadenaOriginal(String cadenaOriginal) {
    this.cadenaOriginal = cadenaOriginal;
  }

  public Acuse fechaAcuse(LocalDate fechaAcuse) {
    this.fechaAcuse = fechaAcuse;
    return this;
  }

  /**
   * Get fechaAcuse
   * @return fechaAcuse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getFechaAcuse() {
    return fechaAcuse;
  }

  public void setFechaAcuse(LocalDate fechaAcuse) {
    this.fechaAcuse = fechaAcuse;
  }

  public Acuse selloDigital(String selloDigital) {
    this.selloDigital = selloDigital;
    return this;
  }

  /**
   * Get selloDigital
   * @return selloDigital
  **/
  @ApiModelProperty(value = "")


  public String getSelloDigital() {
    return selloDigital;
  }

  public void setSelloDigital(String selloDigital) {
    this.selloDigital = selloDigital;
  }

  public Acuse solicitudReporte(SolicitudReporte solicitudReporte) {
    this.solicitudReporte = solicitudReporte;
    return this;
  }

  /**
   * Get solicitudReporte
   * @return solicitudReporte
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SolicitudReporte getSolicitudReporte() {
    return solicitudReporte;
  }

  public void setSolicitudReporte(SolicitudReporte solicitudReporte) {
    this.solicitudReporte = solicitudReporte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Acuse acuse = (Acuse) o;
    return Objects.equals(this.id, acuse.id) &&
        Objects.equals(this.cadenaOriginal, acuse.cadenaOriginal) &&
        Objects.equals(this.fechaAcuse, acuse.fechaAcuse) &&
        Objects.equals(this.selloDigital, acuse.selloDigital) &&
        Objects.equals(this.solicitudReporte, acuse.solicitudReporte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cadenaOriginal, fechaAcuse, selloDigital, solicitudReporte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Acuse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cadenaOriginal: ").append(toIndentedString(cadenaOriginal)).append("\n");
    sb.append("    fechaAcuse: ").append(toIndentedString(fechaAcuse)).append("\n");
    sb.append("    selloDigital: ").append(toIndentedString(selloDigital)).append("\n");
    sb.append("    solicitudReporte: ").append(toIndentedString(solicitudReporte)).append("\n");
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

