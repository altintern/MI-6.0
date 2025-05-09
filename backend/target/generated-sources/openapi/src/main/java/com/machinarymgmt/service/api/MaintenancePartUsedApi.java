/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.13.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.machinarymgmt.service.api;

import com.machinarymgmt.service.dto.MachinaryMgmtBaseApiResponse;
import com.machinarymgmt.service.dto.MaintenancePartUsedListResponse;
import com.machinarymgmt.service.dto.MaintenancePartUsedRequestDto;
import com.machinarymgmt.service.dto.MaintenancePartUsedResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-06T14:34:14.883037100+05:30[Asia/Calcutta]", comments = "Generator version: 7.13.0")
@Validated
@Tag(name = "Maintenance PartUsed", description = "Endpoints for recording and tracking spare parts and components used during equipment maintenance and repairs.")
public interface MaintenancePartUsedApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /maintenance/partused : Create new maintenance part used
     *
     * @param maintenancePartUsedRequestDto  (optional)
     * @return Maintenance Partused created successfully (status code 200)
     */
    @Operation(
        operationId = "createMaintenancePartUsed",
        summary = "Create new maintenance part used",
        tags = { "Maintenance PartUsed" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Maintenance Partused created successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MachinaryMgmtBaseApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/maintenance/partused",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<MachinaryMgmtBaseApiResponse> createMaintenancePartUsed(
        @Parameter(name = "MaintenancePartUsedRequestDto", description = "") @Valid @RequestBody(required = false) MaintenancePartUsedRequestDto maintenancePartUsedRequestDto
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /maintenance/partused/{id} : Delete maintenance part used
     *
     * @param id  (required)
     * @return Maintenance Part used deleted successfully (status code 200)
     */
    @Operation(
        operationId = "deleteMaintenancePartUsed",
        summary = "Delete maintenance part used",
        tags = { "Maintenance PartUsed" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Maintenance Part used deleted successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MachinaryMgmtBaseApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/maintenance/partused/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<MachinaryMgmtBaseApiResponse> deleteMaintenancePartUsed(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /maintenance/partused : Get all maintenance Partused
     *
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "getAllMaintenancePartused",
        summary = "Get all maintenance Partused",
        tags = { "Maintenance PartUsed" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MaintenancePartUsedListResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/maintenance/partused",
        produces = { "application/json" }
    )
    
    default ResponseEntity<MaintenancePartUsedListResponse> getAllMaintenancePartused(
        
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"maintenanceLog\" : { \"id\" : 4 }, \"item\" : { \"code\" : \"code\", \"id\" : 1 }, \"quantity\" : 6.027456183070403, \"id\" : 0 }, { \"maintenanceLog\" : { \"id\" : 4 }, \"item\" : { \"code\" : \"code\", \"id\" : 1 }, \"quantity\" : 6.027456183070403, \"id\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /maintenance/partused/{id} : Get maintenance Partused by ID
     *
     * @param id  (required)
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "getMaintenancePartUsedById",
        summary = "Get maintenance Partused by ID",
        tags = { "Maintenance PartUsed" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MaintenancePartUsedResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/maintenance/partused/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<MaintenancePartUsedResponse> getMaintenancePartUsedById(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"maintenanceLog\" : { \"id\" : 4 }, \"item\" : { \"code\" : \"code\", \"id\" : 1 }, \"quantity\" : 6.027456183070403, \"id\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /maintenance/partused/{id} : Update maintenance Part used
     *
     * @param id  (required)
     * @param maintenancePartUsedRequestDto  (optional)
     * @return Maintenance Part used updated successfully (status code 200)
     */
    @Operation(
        operationId = "updateMaintenancePartUsed",
        summary = "Update maintenance Part used",
        tags = { "Maintenance PartUsed" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Maintenance Part used updated successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MachinaryMgmtBaseApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/maintenance/partused/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<MachinaryMgmtBaseApiResponse> updateMaintenancePartUsed(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "MaintenancePartUsedRequestDto", description = "") @Valid @RequestBody(required = false) MaintenancePartUsedRequestDto maintenancePartUsedRequestDto
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
