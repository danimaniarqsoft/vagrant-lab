package mx.gob.cnbv.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import mx.gob.cnbv.web.api.model.SolicitudReporte;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dato
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class Dato   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("cveConcepto")
  private String cveConcepto = null;

  @JsonProperty("cveMoneda")
  private Integer cveMoneda = null;

  @JsonProperty("datoImporte")
  private String datoImporte = null;

  @JsonProperty("solicitudReporte")
  private SolicitudReporte solicitudReporte = null;

  public Dato id(String id) {
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

  public Dato cveConcepto(String cveConcepto) {
    this.cveConcepto = cveConcepto;
    return this;
  }

  /**
   * Get cveConcepto
   * @return cveConcepto
  **/
  @ApiModelProperty(value = "")


  public String getCveConcepto() {
    return cveConcepto;
  }

  public void setCveConcepto(String cveConcepto) {
    this.cveConcepto = cveConcepto;
  }

  public Dato cveMoneda(Integer cveMoneda) {
    this.cveMoneda = cveMoneda;
    return this;
  }

  /**
   * Get cveMoneda
   * @return cveMoneda
  **/
  @ApiModelProperty(value = "")


  public Integer getCveMoneda() {
    return cveMoneda;
  }

  public void setCveMoneda(Integer cveMoneda) {
    this.cveMoneda = cveMoneda;
  }

  public Dato datoImporte(String datoImporte) {
    this.datoImporte = datoImporte;
    return this;
  }

  /**
   * Get datoImporte
   * @return datoImporte
  **/
  @ApiModelProperty(value = "")


  public String getDatoImporte() {
    return datoImporte;
  }

  public void setDatoImporte(String datoImporte) {
    this.datoImporte = datoImporte;
  }

  public Dato solicitudReporte(SolicitudReporte solicitudReporte) {
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
    Dato dato = (Dato) o;
    return Objects.equals(this.id, dato.id) &&
        Objects.equals(this.cveConcepto, dato.cveConcepto) &&
        Objects.equals(this.cveMoneda, dato.cveMoneda) &&
        Objects.equals(this.datoImporte, dato.datoImporte) &&
        Objects.equals(this.solicitudReporte, dato.solicitudReporte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cveConcepto, cveMoneda, datoImporte, solicitudReporte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dato {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cveConcepto: ").append(toIndentedString(cveConcepto)).append("\n");
    sb.append("    cveMoneda: ").append(toIndentedString(cveMoneda)).append("\n");
    sb.append("    datoImporte: ").append(toIndentedString(datoImporte)).append("\n");
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

