package mx.gob.cnbv.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import mx.gob.cnbv.web.api.model.Concepto;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CatalogoConceptos
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class CatalogoConceptos   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("conceptos")
  @Valid
  private List<Concepto> conceptos = null;

  public CatalogoConceptos id(String id) {
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

  public CatalogoConceptos version(Integer version) {
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

  public CatalogoConceptos conceptos(List<Concepto> conceptos) {
    this.conceptos = conceptos;
    return this;
  }

  public CatalogoConceptos addConceptosItem(Concepto conceptosItem) {
    if (this.conceptos == null) {
      this.conceptos = new ArrayList<>();
    }
    this.conceptos.add(conceptosItem);
    return this;
  }

  /**
   * Get conceptos
   * @return conceptos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Concepto> getConceptos() {
    return conceptos;
  }

  public void setConceptos(List<Concepto> conceptos) {
    this.conceptos = conceptos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogoConceptos catalogoConceptos = (CatalogoConceptos) o;
    return Objects.equals(this.id, catalogoConceptos.id) &&
        Objects.equals(this.version, catalogoConceptos.version) &&
        Objects.equals(this.conceptos, catalogoConceptos.conceptos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, conceptos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogoConceptos {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    conceptos: ").append(toIndentedString(conceptos)).append("\n");
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

