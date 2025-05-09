/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.13.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.machinarymgmt.service.api;

import com.machinarymgmt.service.dto.MachinaryMgmtBaseApiResponse;
import com.machinarymgmt.service.dto.OvertimeReportListResponse;
import com.machinarymgmt.service.dto.OvertimeReportRequestDto;
import com.machinarymgmt.service.dto.OvertimeReportResponse;
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
@Tag(name = "OvertimeReport", description = "Endpoints for managing employee overtime reports.")
public interface OvertimeReportApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /overtimereport : Create new Overtime Record
     *
     * @param overtimeReportRequestDto  (optional)
     * @return Overtime Report created successfully (status code 200)
     */
    @Operation(
        operationId = "createOvertimeReport",
        summary = "Create new Overtime Record",
        tags = { "OvertimeReport" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Overtime Report created successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MachinaryMgmtBaseApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/overtimereport",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<MachinaryMgmtBaseApiResponse> createOvertimeReport(
        @Parameter(name = "OvertimeReportRequestDto", description = "") @Valid @RequestBody(required = false) OvertimeReportRequestDto overtimeReportRequestDto
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
     * DELETE /overtimereport/{id} : Delete Overtime Report by ID
     *
     * @param id  (required)
     * @return Overtime Report deleted successfully (status code 200)
     */
    @Operation(
        operationId = "deleteOvertimeReport",
        summary = "Delete Overtime Report by ID",
        tags = { "OvertimeReport" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Overtime Report deleted successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MachinaryMgmtBaseApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/overtimereport/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<MachinaryMgmtBaseApiResponse> deleteOvertimeReport(
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
     * GET /overtimereport : Get all Overtime Record
     *
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "getOvertimeReport",
        summary = "Get all Overtime Record",
        tags = { "OvertimeReport" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OvertimeReportListResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/overtimereport",
        produces = { "application/json" }
    )
    
    default ResponseEntity<OvertimeReportListResponse> getOvertimeReport(
        
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"date\" : \"2000-01-23\", \"presentDays\" : 6, \"otHours\" : 1.4658129805029452, \"id\" : 0, \"employee\" : { \"name\" : \"name\", \"id\" : 6 }, \"remarks\" : \"remarks\" }, { \"date\" : \"2000-01-23\", \"presentDays\" : 6, \"otHours\" : 1.4658129805029452, \"id\" : 0, \"employee\" : { \"name\" : \"name\", \"id\" : 6 }, \"remarks\" : \"remarks\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /overtimereport/{id} : Get Overtime report by ID
     *
     * @param id  (required)
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "getOvertimeReportById",
        summary = "Get Overtime report by ID",
        tags = { "OvertimeReport" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OvertimeReportResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/overtimereport/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<OvertimeReportResponse> getOvertimeReportById(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"date\" : \"2000-01-23\", \"presentDays\" : 6, \"otHours\" : 1.4658129805029452, \"id\" : 0, \"employee\" : { \"name\" : \"name\", \"id\" : 6 }, \"remarks\" : \"remarks\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /overtimereport/{id} : Update Overtime reports
     *
     * @param id  (required)
     * @param overtimeReportRequestDto  (optional)
     * @return Overtime report updated successfully (status code 200)
     */
    @Operation(
        operationId = "updateOvertimeReport",
        summary = "Update Overtime reports",
        tags = { "OvertimeReport" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Overtime report updated successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = MachinaryMgmtBaseApiResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/overtimereport/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<MachinaryMgmtBaseApiResponse> updateOvertimeReport(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "OvertimeReportRequestDto", description = "") @Valid @RequestBody(required = false) OvertimeReportRequestDto overtimeReportRequestDto
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
