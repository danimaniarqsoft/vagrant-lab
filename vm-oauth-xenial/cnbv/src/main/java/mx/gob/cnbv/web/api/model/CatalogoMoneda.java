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
 * CatalogoMoneda
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public class CatalogoMoneda   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("moneda")
  private String moneda = null;

  public CatalogoMoneda id(String id) {
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

  public CatalogoMoneda moneda(String moneda) {
    this.moneda = moneda;
    return this;
  }

  /**
   * Get moneda
   * @return moneda
  **/
  @ApiModelProperty(value = "")


  public String getMoneda() {
    return moneda;
  }

  public void setMoneda(String moneda) {
    this.moneda = moneda;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogoMoneda catalogoMoneda = (CatalogoMoneda) o;
    return Objects.equals(this.id, catalogoMoneda.id) &&
        Objects.equals(this.moneda, catalogoMoneda.moneda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, moneda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogoMoneda {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    moneda: ").append(toIndentedString(moneda)).append("\n");
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

