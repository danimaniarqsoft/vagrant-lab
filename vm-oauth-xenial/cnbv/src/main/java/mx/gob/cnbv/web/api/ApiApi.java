/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package mx.gob.cnbv.web.api;

import mx.gob.cnbv.web.api.model.Acuse;
import mx.gob.cnbv.web.api.model.Dato;
import mx.gob.cnbv.web.api.model.EstadoReporte;
import java.util.List;
import mx.gob.cnbv.web.api.model.Reporte;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-09-13T06:32:49.552Z[Etc/UTC]")

@Api(value = "api", description = "the api API")
public interface ApiApi {

    default ApiApiDelegate getDelegate() {
        return new ApiApiDelegate() {};
    }

    @ApiOperation(value = "consultarReporte", nickname = "consultarReporteUsingGET", notes = "", response = Dato.class, responseContainer = "List", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "solicitud-reporte-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Dato.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/solicitudReportes/{id}/datos",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Dato>> consultarReporteUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size) {
        return getDelegate().consultarReporteUsingGET(id, page, size);
    }


    @ApiOperation(value = "consultarReporteInfo", nickname = "getReporteUsingGET", notes = "", response = Reporte.class, authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "reporte-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Reporte.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reportes/{id}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Reporte> getReporteUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        return getDelegate().getReporteUsingGET(id);
    }


    @ApiOperation(value = "consultarEstado", nickname = "notificarEstadoUsingPUT", notes = "", response = EstadoReporte.class, responseContainer = "List", authorizations = {
        @Authorization(value = "cnbv_auth", scopes = {
            @AuthorizationScope(scope = "write:acuses", description = "crear notificaciones"),
            @AuthorizationScope(scope = "read:reportes", description = "consultar reportes")
            })
    }, tags={ "solicitud-reporte-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EstadoReporte.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/solicitudReportes/{id}/estadoReporte",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<EstadoReporte>> notificarEstadoUsingPUT(@ApiParam(value = "id",required=true) @PathVariable("id") Long id) {
        return getDelegate().notificarEstadoUsingPUT(id);
    }


    @ApiOperation(value = "notificarEstado", nickname = "notificarEstadoUsingPUT", notes = "", response = Acuse.class, authorizations = {
        @Authorization(value = "cnbv_auth", scopes = {
            @AuthorizationScope(scope = "write:acuses", description = "crear notificaciones"),
            @AuthorizationScope(scope = "read:reportes", description = "consultar reportes")
            })
    }, tags={ "solicitud-reporte-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Acuse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/solicitudReportes/{id}/estadoReporte",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Acuse> notificarEstadoUsingPUT(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "estadoReporte" ,required=true )  @Valid @RequestBody EstadoReporte estadoReporte) {
        return getDelegate().notificarEstadoUsingPUT(id, estadoReporte);
    }


    @ApiOperation(value = "recibirReporte", nickname = "recibirReporteUsingPUT", notes = "", response = Acuse.class, authorizations = {
        @Authorization(value = "cnbv_auth", scopes = {
            @AuthorizationScope(scope = "write:acuses", description = "crear notificaciones"),
            @AuthorizationScope(scope = "read:reportes", description = "consultar reportes")
            })
    }, tags={ "solicitud-reporte-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Acuse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/solicitudReportes/{id}/datos",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Acuse> recibirReporteUsingPUT(@ApiParam(value = "id",required=true) @PathVariable("id") Long id,@ApiParam(value = "Especifica si el paquete de datos es el ultimo y por tanto la transferencia del reporte se ha completado" ,required=true) @RequestHeader(value="reporteCompletado", required=true) Boolean reporteCompletado,@ApiParam(value = "datos" ,required=true )  @Valid @RequestBody List<Dato> dato) {
        return getDelegate().recibirReporteUsingPUT(id, reporteCompletado, dato);
    }

}
