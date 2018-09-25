package mx.gob.cnbv.web.api;

import mx.gob.cnbv.web.api.model.Acuse;
import mx.gob.cnbv.web.api.model.Dato;
import mx.gob.cnbv.web.api.model.EstadoReporte;
import java.util.List;
import mx.gob.cnbv.web.api.model.Reporte;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ApiApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

public interface ApiApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * @see ApiApi#consultarReporteUsingGET
     */
    default ResponseEntity<List<Dato>> consultarReporteUsingGET( Long  id,
         Integer  page,
         Integer  size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    ApiUtil.setExampleResponse(request, "*/*", "{  \"cveMoneda\" : 0,  \"id\" : \"id\",  \"cveConcepto\" : \"cveConcepto\",  \"datoImporte\" : \"datoImporte\",  \"solicitudReporte\" : {    \"numeroEnvios\" : 6,    \"estadoReporte\" : {      \"descripcion\" : \"descripcion\",      \"id\" : \"id\",      \"nombre\" : \"nombre\"    },    \"id\" : \"id\",    \"tipoFlujo\" : {      \"descripcion\" : \"descripcion\",      \"id\" : \"id\",      \"nombre\" : \"nombre\"    },    \"fechaRecepcion\" : \"2000-01-23\",    \"reporte\" : {      \"fechaSolicitud\" : \"2000-01-23\",      \"periodo\" : {        \"fechaInicio\" : \"2000-01-23\",        \"id\" : \"id\",        \"fechaFin\" : \"2000-01-23\"      },      \"templateReporteCatalogoConceptos\" : {        \"periodicidad\" : \"periodicidad\",        \"vigenciaFin\" : \"vigenciaFin\",        \"TemplateReporte\" : {          \"descripcion\" : \"descripcion\",          \"elementosPorPagina\" : 6,          \"maxErrores\" : 1,          \"descripcionCorta\" : \"descripcionCorta\",          \"id\" : \"id\",          \"version\" : 0,          \"columnas\" : [ {            \"min\" : \"min\",            \"max\" : \"max\",            \"formato\" : \"formato\",            \"requerida\" : true,            \"id\" : \"id\",            \"catalogoRelacionado\" : \"catalogoRelacionado\",            \"nombre\" : \"nombre\"          }, {            \"min\" : \"min\",            \"max\" : \"max\",            \"formato\" : \"formato\",            \"requerida\" : true,            \"id\" : \"id\",            \"catalogoRelacionado\" : \"catalogoRelacionado\",            \"nombre\" : \"nombre\"          } ]        },        \"catalogoConceptos\" : {          \"conceptos\" : [ {            \"concepto\" : \"concepto\",            \"ordenPresentacion\" : 5,            \"id\" : \"id\",            \"conceptoPadreId\" : \"conceptoPadreId\"          }, {            \"concepto\" : \"concepto\",            \"ordenPresentacion\" : 5,            \"id\" : \"id\",            \"conceptoPadreId\" : \"conceptoPadreId\"          } ],          \"id\" : \"id\",          \"version\" : 5        },        \"vigenciaInicio\" : \"vigenciaInicio\",        \"id\" : \"id\"      },      \"fechaLimiteRecepcion\" : \"2000-01-23\",      \"tipoReporte\" : {        \"descripcion\" : \"descripcion\",        \"id\" : \"id\",        \"nombre\" : \"nombre\"      },      \"id\" : \"id\",      \"tipoFlujo\" : {        \"descripcion\" : \"descripcion\",        \"id\" : \"id\",        \"nombre\" : \"nombre\"      }    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * @see ApiApi#getReporteUsingGET
     */
    default ResponseEntity<Reporte> getReporteUsingGET( Long  id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    ApiUtil.setExampleResponse(request, "*/*", "{  \"fechaSolicitud\" : \"2000-01-23\",  \"periodo\" : {    \"fechaInicio\" : \"2000-01-23\",    \"id\" : \"id\",    \"fechaFin\" : \"2000-01-23\"  },  \"templateReporteCatalogoConceptos\" : {    \"periodicidad\" : \"periodicidad\",    \"vigenciaFin\" : \"vigenciaFin\",    \"TemplateReporte\" : {      \"descripcion\" : \"descripcion\",      \"elementosPorPagina\" : 6,      \"maxErrores\" : 1,      \"descripcionCorta\" : \"descripcionCorta\",      \"id\" : \"id\",      \"version\" : 0,      \"columnas\" : [ {        \"min\" : \"min\",        \"max\" : \"max\",        \"formato\" : \"formato\",        \"requerida\" : true,        \"id\" : \"id\",        \"catalogoRelacionado\" : \"catalogoRelacionado\",        \"nombre\" : \"nombre\"      }, {        \"min\" : \"min\",        \"max\" : \"max\",        \"formato\" : \"formato\",        \"requerida\" : true,        \"id\" : \"id\",        \"catalogoRelacionado\" : \"catalogoRelacionado\",        \"nombre\" : \"nombre\"      } ]    },    \"catalogoConceptos\" : {      \"conceptos\" : [ {        \"concepto\" : \"concepto\",        \"ordenPresentacion\" : 5,        \"id\" : \"id\",        \"conceptoPadreId\" : \"conceptoPadreId\"      }, {        \"concepto\" : \"concepto\",        \"ordenPresentacion\" : 5,        \"id\" : \"id\",        \"conceptoPadreId\" : \"conceptoPadreId\"      } ],      \"id\" : \"id\",      \"version\" : 5    },    \"vigenciaInicio\" : \"vigenciaInicio\",    \"id\" : \"id\"  },  \"fechaLimiteRecepcion\" : \"2000-01-23\",  \"tipoReporte\" : {    \"descripcion\" : \"descripcion\",    \"id\" : \"id\",    \"nombre\" : \"nombre\"  },  \"id\" : \"id\",  \"tipoFlujo\" : {    \"descripcion\" : \"descripcion\",    \"id\" : \"id\",    \"nombre\" : \"nombre\"  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * @see ApiApi#notificarEstadoUsingPUT
     */
    default ResponseEntity<List<EstadoReporte>> notificarEstadoUsingPUT( Long  id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    ApiUtil.setExampleResponse(request, "*/*", "{  \"descripcion\" : \"descripcion\",  \"id\" : \"id\",  \"nombre\" : \"nombre\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * @see ApiApi#notificarEstadoUsingPUT
     */
    default ResponseEntity<Acuse> notificarEstadoUsingPUT( Long  id,
         EstadoReporte  estadoReporte) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    ApiUtil.setExampleResponse(request, "*/*", "{  \"cadenaOriginal\" : \"cadenaOriginal\",  \"fechaAcuse\" : \"2000-01-23\",  \"id\" : \"id\",  \"selloDigital\" : \"selloDigital\",  \"solicitudReporte\" : {    \"numeroEnvios\" : 6,    \"estadoReporte\" : {      \"descripcion\" : \"descripcion\",      \"id\" : \"id\",      \"nombre\" : \"nombre\"    },    \"id\" : \"id\",    \"tipoFlujo\" : {      \"descripcion\" : \"descripcion\",      \"id\" : \"id\",      \"nombre\" : \"nombre\"    },    \"fechaRecepcion\" : \"2000-01-23\",    \"reporte\" : {      \"fechaSolicitud\" : \"2000-01-23\",      \"periodo\" : {        \"fechaInicio\" : \"2000-01-23\",        \"id\" : \"id\",        \"fechaFin\" : \"2000-01-23\"      },      \"templateReporteCatalogoConceptos\" : {        \"periodicidad\" : \"periodicidad\",        \"vigenciaFin\" : \"vigenciaFin\",        \"TemplateReporte\" : {          \"descripcion\" : \"descripcion\",          \"elementosPorPagina\" : 6,          \"maxErrores\" : 1,          \"descripcionCorta\" : \"descripcionCorta\",          \"id\" : \"id\",          \"version\" : 0,          \"columnas\" : [ {            \"min\" : \"min\",            \"max\" : \"max\",            \"formato\" : \"formato\",            \"requerida\" : true,            \"id\" : \"id\",            \"catalogoRelacionado\" : \"catalogoRelacionado\",            \"nombre\" : \"nombre\"          }, {            \"min\" : \"min\",            \"max\" : \"max\",            \"formato\" : \"formato\",            \"requerida\" : true,            \"id\" : \"id\",            \"catalogoRelacionado\" : \"catalogoRelacionado\",            \"nombre\" : \"nombre\"          } ]        },        \"catalogoConceptos\" : {          \"conceptos\" : [ {            \"concepto\" : \"concepto\",            \"ordenPresentacion\" : 5,            \"id\" : \"id\",            \"conceptoPadreId\" : \"conceptoPadreId\"          }, {            \"concepto\" : \"concepto\",            \"ordenPresentacion\" : 5,            \"id\" : \"id\",            \"conceptoPadreId\" : \"conceptoPadreId\"          } ],          \"id\" : \"id\",          \"version\" : 5        },        \"vigenciaInicio\" : \"vigenciaInicio\",        \"id\" : \"id\"      },      \"fechaLimiteRecepcion\" : \"2000-01-23\",      \"tipoReporte\" : {        \"descripcion\" : \"descripcion\",        \"id\" : \"id\",        \"nombre\" : \"nombre\"      },      \"id\" : \"id\",      \"tipoFlujo\" : {        \"descripcion\" : \"descripcion\",        \"id\" : \"id\",        \"nombre\" : \"nombre\"      }    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * @see ApiApi#recibirReporteUsingPUT
     */
    default ResponseEntity<Acuse> recibirReporteUsingPUT( Long  id,
         Boolean  reporteCompletado,
         List<Dato>  dato) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    ApiUtil.setExampleResponse(request, "*/*", "{  \"cadenaOriginal\" : \"cadenaOriginal\",  \"fechaAcuse\" : \"2000-01-23\",  \"id\" : \"id\",  \"selloDigital\" : \"selloDigital\",  \"solicitudReporte\" : {    \"numeroEnvios\" : 6,    \"estadoReporte\" : {      \"descripcion\" : \"descripcion\",      \"id\" : \"id\",      \"nombre\" : \"nombre\"    },    \"id\" : \"id\",    \"tipoFlujo\" : {      \"descripcion\" : \"descripcion\",      \"id\" : \"id\",      \"nombre\" : \"nombre\"    },    \"fechaRecepcion\" : \"2000-01-23\",    \"reporte\" : {      \"fechaSolicitud\" : \"2000-01-23\",      \"periodo\" : {        \"fechaInicio\" : \"2000-01-23\",        \"id\" : \"id\",        \"fechaFin\" : \"2000-01-23\"      },      \"templateReporteCatalogoConceptos\" : {        \"periodicidad\" : \"periodicidad\",        \"vigenciaFin\" : \"vigenciaFin\",        \"TemplateReporte\" : {          \"descripcion\" : \"descripcion\",          \"elementosPorPagina\" : 6,          \"maxErrores\" : 1,          \"descripcionCorta\" : \"descripcionCorta\",          \"id\" : \"id\",          \"version\" : 0,          \"columnas\" : [ {            \"min\" : \"min\",            \"max\" : \"max\",            \"formato\" : \"formato\",            \"requerida\" : true,            \"id\" : \"id\",            \"catalogoRelacionado\" : \"catalogoRelacionado\",            \"nombre\" : \"nombre\"          }, {            \"min\" : \"min\",            \"max\" : \"max\",            \"formato\" : \"formato\",            \"requerida\" : true,            \"id\" : \"id\",            \"catalogoRelacionado\" : \"catalogoRelacionado\",            \"nombre\" : \"nombre\"          } ]        },        \"catalogoConceptos\" : {          \"conceptos\" : [ {            \"concepto\" : \"concepto\",            \"ordenPresentacion\" : 5,            \"id\" : \"id\",            \"conceptoPadreId\" : \"conceptoPadreId\"          }, {            \"concepto\" : \"concepto\",            \"ordenPresentacion\" : 5,            \"id\" : \"id\",            \"conceptoPadreId\" : \"conceptoPadreId\"          } ],          \"id\" : \"id\",          \"version\" : 5        },        \"vigenciaInicio\" : \"vigenciaInicio\",        \"id\" : \"id\"      },      \"fechaLimiteRecepcion\" : \"2000-01-23\",      \"tipoReporte\" : {        \"descripcion\" : \"descripcion\",        \"id\" : \"id\",        \"nombre\" : \"nombre\"      },      \"id\" : \"id\",      \"tipoFlujo\" : {        \"descripcion\" : \"descripcion\",        \"id\" : \"id\",        \"nombre\" : \"nombre\"      }    }  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
