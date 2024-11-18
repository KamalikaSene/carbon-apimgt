package org.wso2.carbon.apimgt.governance.rest.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.governance.rest.api.dto.RulesetIdDTO;
import javax.validation.constraints.*;

/**
 * Governance policy information with ruleset IDs.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;
import org.wso2.carbon.apimgt.rest.api.common.annotations.Scope;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.validation.Valid;

@ApiModel(description = "Governance policy information with ruleset IDs.")

public class GovernancePolicyInfoWithRulesetIdsDTO   {
  
    private String id = null;
    private String name = null;
    private String description = null;
    private List<RulesetIdDTO> rulesets = new ArrayList<RulesetIdDTO>();
    private List<String> labels = new ArrayList<String>();
    private String createdBy = null;
    private String createdTime = null;
    private String updatedBy = null;
    private String updatedTime = null;

  /**
   * UUID of the governance policy.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "987e6543-d21b-34d5-b678-912345678900", value = "UUID of the governance policy.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Name of the governance policy.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "API Security Policy", required = true, value = "Name of the governance policy.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A brief description of the governance policy.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Policy for enforcing security standards across all APIs.", value = "A brief description of the governance policy.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * List of ruleset IDs the governance policy.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO rulesets(List<RulesetIdDTO> rulesets) {
    this.rulesets = rulesets;
    return this;
  }

  
  @ApiModelProperty(value = "List of ruleset IDs the governance policy.")
      @Valid
  @JsonProperty("rulesets")
  public List<RulesetIdDTO> getRulesets() {
    return rulesets;
  }
  public void setRulesets(List<RulesetIdDTO> rulesets) {
    this.rulesets = rulesets;
  }

  /**
   * Labels or tags associated with the governance policy.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(example = "[\"security\"]", value = "Labels or tags associated with the governance policy.")
  @JsonProperty("labels")
  public List<String> getLabels() {
    return labels;
  }
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  /**
   * Identifier of the user who created the governance policy.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  
  @ApiModelProperty(example = "admin@gmail.com", value = "Identifier of the user who created the governance policy.")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Timestamp when the governance policy was created.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "2024-08-01T12:00:00Z", value = "Timestamp when the governance policy was created.")
  @JsonProperty("createdTime")
  public String getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Identifier of the user who last updated the governance policy.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  
  @ApiModelProperty(example = "admin@gmail.com", value = "Identifier of the user who last updated the governance policy.")
  @JsonProperty("updatedBy")
  public String getUpdatedBy() {
    return updatedBy;
  }
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  /**
   * Timestamp when the governance policy was last updated.
   **/
  public GovernancePolicyInfoWithRulesetIdsDTO updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(example = "2024-08-02T12:00:00Z", value = "Timestamp when the governance policy was last updated.")
  @JsonProperty("updatedTime")
  public String getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernancePolicyInfoWithRulesetIdsDTO governancePolicyInfoWithRulesetIds = (GovernancePolicyInfoWithRulesetIdsDTO) o;
    return Objects.equals(id, governancePolicyInfoWithRulesetIds.id) &&
        Objects.equals(name, governancePolicyInfoWithRulesetIds.name) &&
        Objects.equals(description, governancePolicyInfoWithRulesetIds.description) &&
        Objects.equals(rulesets, governancePolicyInfoWithRulesetIds.rulesets) &&
        Objects.equals(labels, governancePolicyInfoWithRulesetIds.labels) &&
        Objects.equals(createdBy, governancePolicyInfoWithRulesetIds.createdBy) &&
        Objects.equals(createdTime, governancePolicyInfoWithRulesetIds.createdTime) &&
        Objects.equals(updatedBy, governancePolicyInfoWithRulesetIds.updatedBy) &&
        Objects.equals(updatedTime, governancePolicyInfoWithRulesetIds.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, rulesets, labels, createdBy, createdTime, updatedBy, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernancePolicyInfoWithRulesetIdsDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rulesets: ").append(toIndentedString(rulesets)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

