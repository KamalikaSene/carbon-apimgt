package org.wso2.carbon.apimgt.governance.rest.api;

import org.wso2.carbon.apimgt.governance.rest.api.dto.ErrorDTO;
import org.wso2.carbon.apimgt.governance.rest.api.dto.GovernancePolicyInfoDTO;
import org.wso2.carbon.apimgt.governance.rest.api.dto.GovernancePolicyInfoWithRulesetIdsDTO;
import org.wso2.carbon.apimgt.governance.rest.api.dto.GovernancePolicyListDTO;
import org.wso2.carbon.apimgt.governance.rest.api.GovernancePoliciesApiService;
import org.wso2.carbon.apimgt.governance.rest.api.impl.GovernancePoliciesApiServiceImpl;
import org.wso2.carbon.apimgt.governance.api.error.GovernanceException;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/governance-policies")

@Api(description = "the governance-policies API")




public class GovernancePoliciesApi  {

  @Context MessageContext securityContext;

GovernancePoliciesApiService delegate = new GovernancePoliciesApiServiceImpl();


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a new governance policy.", notes = "Creates a new governance policy for the user's organization.", response = GovernancePolicyInfoDTO.class, authorizations = {
        @Authorization(value = "OAuth2Security", scopes = {
            @AuthorizationScope(scope = "apim:gov_policy_manage", description = "Manage governance policies")
        })
    }, tags={ "Governance Policies", "External",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK. Governance policy created successfully.", response = GovernancePolicyInfoDTO.class),
        @ApiResponse(code = 400, message = "Client error.", response = ErrorDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDTO.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDTO.class),
        @ApiResponse(code = 500, message = "Internal Server Error.", response = ErrorDTO.class) })
    public Response createGovernancePolicy(@ApiParam(value = "JSON object containing the details of the new governance policy." ,required=true) GovernancePolicyInfoWithRulesetIdsDTO governancePolicyInfoWithRulesetIdsDTO) throws GovernanceException{
        return delegate.createGovernancePolicy(governancePolicyInfoWithRulesetIdsDTO, securityContext);
    }

    @DELETE
    @Path("/{policyId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a specific governance policy", notes = "Deletes an existing governance policy identified by the policyId.", response = Void.class, authorizations = {
        @Authorization(value = "OAuth2Security", scopes = {
            @AuthorizationScope(scope = "apim:gov_policy_manage", description = "Manage governance policies")
        })
    }, tags={ "Governance Policies", "External",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "OK. Governance policy deleted successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "Client error.", response = ErrorDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDTO.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDTO.class),
        @ApiResponse(code = 500, message = "Internal Server Error.", response = ErrorDTO.class) })
    public Response deleteGovernancePolicy(@ApiParam(value = "UUID of the governance policy.",required=true) @PathParam("policyId") String policyId) throws GovernanceException{
        return delegate.deleteGovernancePolicy(policyId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a list of all governance policies.", notes = "Retrieves a list of governance policies for the user's organization.", response = GovernancePolicyListDTO.class, authorizations = {
        @Authorization(value = "OAuth2Security", scopes = {
            @AuthorizationScope(scope = "apim:gov_policy_read", description = "Read governance policies")
        })
    }, tags={ "Governance Policies", "External",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK. Successful response with a list of governance policies.", response = GovernancePolicyListDTO.class),
        @ApiResponse(code = 400, message = "Client error.", response = ErrorDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDTO.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDTO.class),
        @ApiResponse(code = 500, message = "Internal Server Error.", response = ErrorDTO.class) })
    public Response getGovernancePolicies() throws GovernanceException{
        return delegate.getGovernancePolicies(securityContext);
    }

    @GET
    @Path("/{policyId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a specific governance policy", notes = "Retrieves details of a specific governance policy identified by the policyId.", response = GovernancePolicyInfoDTO.class, authorizations = {
        @Authorization(value = "OAuth2Security", scopes = {
            @AuthorizationScope(scope = "apim:gov_policy_read", description = "Read governance policies")
        })
    }, tags={ "Governance Policies", "External",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK. Governance policy details retrieved successfully.", response = GovernancePolicyInfoDTO.class),
        @ApiResponse(code = 400, message = "Client error.", response = ErrorDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDTO.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDTO.class),
        @ApiResponse(code = 500, message = "Internal Server Error.", response = ErrorDTO.class) })
    public Response getGovernancePolicyById(@ApiParam(value = "UUID of the governance policy.",required=true) @PathParam("policyId") String policyId) throws GovernanceException{
        return delegate.getGovernancePolicyById(policyId, securityContext);
    }

    @PUT
    @Path("/{policyId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a specific governance policy", notes = "Updates the details of an existing governance policy identified by the policyId.", response = GovernancePolicyInfoDTO.class, authorizations = {
        @Authorization(value = "OAuth2Security", scopes = {
            @AuthorizationScope(scope = "apim:gov_policy_manage", description = "Manage governance policies")
        })
    }, tags={ "Governance Policies", "External" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK. Governance policy updated successfully.", response = GovernancePolicyInfoDTO.class),
        @ApiResponse(code = 400, message = "Client error.", response = ErrorDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDTO.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDTO.class),
        @ApiResponse(code = 500, message = "Internal Server Error.", response = ErrorDTO.class) })
    public Response updateGovernancePolicyById(@ApiParam(value = "UUID of the governance policy.",required=true) @PathParam("policyId") String policyId, @ApiParam(value = "JSON object containing the updated governance policy details." ,required=true) GovernancePolicyInfoWithRulesetIdsDTO governancePolicyInfoWithRulesetIdsDTO) throws GovernanceException{
        return delegate.updateGovernancePolicyById(policyId, governancePolicyInfoWithRulesetIdsDTO, securityContext);
    }
}
