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
 * Concepto
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class Concepto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("concepto")
  private String concepto = null;

  @JsonProperty("ordenPresentacion")
  private Integer ordenPresentacion = null;

  @JsonProperty("conceptoPadreId")
  private String conceptoPadreId = null;

  public Concepto id(String id) {
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

  public Concepto concepto(String concepto) {
    this.concepto = concepto;
    return this;
  }

  /**
   * Get concepto
   * @return concepto
  **/
  @ApiModelProperty(value = "")


  public String getConcepto() {
    return concepto;
  }

  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  public Concepto ordenPresentacion(Integer ordenPresentacion) {
    this.ordenPresentacion = ordenPresentacion;
    return this;
  }

  /**
   * Get ordenPresentacion
   * @return ordenPresentacion
  **/
  @ApiModelProperty(value = "")


  public Integer getOrdenPresentacion() {
    return ordenPresentacion;
  }

  public void setOrdenPresentacion(Integer ordenPresentacion) {
    this.ordenPresentacion = ordenPresentacion;
  }

  public Concepto conceptoPadreId(String conceptoPadreId) {
    this.conceptoPadreId = conceptoPadreId;
    return this;
  }

  /**
   * Get conceptoPadreId
   * @return conceptoPadreId
  **/
  @ApiModelProperty(value = "")


  public String getConceptoPadreId() {
    return conceptoPadreId;
  }

  public void setConceptoPadreId(String conceptoPadreId) {
    this.conceptoPadreId = conceptoPadreId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Concepto concepto = (Concepto) o;
    return Objects.equals(this.id, concepto.id) &&
        Objects.equals(this.concepto, concepto.concepto) &&
        Objects.equals(this.ordenPresentacion, concepto.ordenPresentacion) &&
        Objects.equals(this.conceptoPadreId, concepto.conceptoPadreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, concepto, ordenPresentacion, conceptoPadreId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Concepto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    concepto: ").append(toIndentedString(concepto)).append("\n");
    sb.append("    ordenPresentacion: ").append(toIndentedString(ordenPresentacion)).append("\n");
    sb.append("    conceptoPadreId: ").append(toIndentedString(conceptoPadreId)).append("\n");
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

