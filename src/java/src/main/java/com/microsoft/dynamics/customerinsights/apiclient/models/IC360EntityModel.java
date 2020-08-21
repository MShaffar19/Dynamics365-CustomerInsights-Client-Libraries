/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IC360EntityModel model.
 */
public class IC360EntityModel {
    /**
     * Gets the instance ID associated with the model.
     */
    @JsonProperty(value = "instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID instanceId;

    /**
     * Gets the dataflow ID associated with the model.
     */
    @JsonProperty(value = "dataflowId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID dataflowId;

    /**
     * Gets the datasource ID associated with the model.
     */
    @JsonProperty(value = "datasourceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID datasourceId;

    /**
     * Possible values include: 'dynamics365', 'salesforce',
     * 'conflationSortAndRefine', 'conflationDeduplication',
     * 'conflationMatchPairs', 'conflationResolveConflicts', 'enriched', 'kpi',
     * 'powerQuery', 'dataPreparation', 'intelligence', 'unifiedActivity',
     * 'segmentation', 'ingestion', 'attachCdm', 'genericPrediction',
     * 'attachCds', 'unknown', 'powerPlatform', 'datahub', 'insights',
     * 'derivedEntity'.
     */
    @JsonProperty(value = "dataflowType")
    private String dataflowType;

    /**
     * Gets entities in the model.
     */
    @JsonProperty(value = "entities", access = JsonProperty.Access.WRITE_ONLY)
    private List<IEntityMetadata> entities;

    /**
     * Get gets the instance ID associated with the model.
     *
     * @return the instanceId value
     */
    public UUID instanceId() {
        return this.instanceId;
    }

    /**
     * Get gets the dataflow ID associated with the model.
     *
     * @return the dataflowId value
     */
    public UUID dataflowId() {
        return this.dataflowId;
    }

    /**
     * Get gets the datasource ID associated with the model.
     *
     * @return the datasourceId value
     */
    public UUID datasourceId() {
        return this.datasourceId;
    }

    /**
     * Get possible values include: 'dynamics365', 'salesforce', 'conflationSortAndRefine', 'conflationDeduplication', 'conflationMatchPairs', 'conflationResolveConflicts', 'enriched', 'kpi', 'powerQuery', 'dataPreparation', 'intelligence', 'unifiedActivity', 'segmentation', 'ingestion', 'attachCdm', 'genericPrediction', 'attachCds', 'unknown', 'powerPlatform', 'datahub', 'insights', 'derivedEntity'.
     *
     * @return the dataflowType value
     */
    public String dataflowType() {
        return this.dataflowType;
    }

    /**
     * Set possible values include: 'dynamics365', 'salesforce', 'conflationSortAndRefine', 'conflationDeduplication', 'conflationMatchPairs', 'conflationResolveConflicts', 'enriched', 'kpi', 'powerQuery', 'dataPreparation', 'intelligence', 'unifiedActivity', 'segmentation', 'ingestion', 'attachCdm', 'genericPrediction', 'attachCds', 'unknown', 'powerPlatform', 'datahub', 'insights', 'derivedEntity'.
     *
     * @param dataflowType the dataflowType value to set
     * @return the IC360EntityModel object itself.
     */
    public IC360EntityModel withDataflowType(String dataflowType) {
        this.dataflowType = dataflowType;
        return this;
    }

    /**
     * Get gets entities in the model.
     *
     * @return the entities value
     */
    public List<IEntityMetadata> entities() {
        return this.entities;
    }

}