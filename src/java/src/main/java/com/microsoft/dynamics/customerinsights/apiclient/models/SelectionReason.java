/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SelectionReason model.
 */
public class SelectionReason {
    /**
     * Possible values include: 'unknown', 'requested', 'firstRun',
     * 'unsuccessful', 'lastRunSkipped', 'alreadyRunning', 'modifiedInputs',
     * 'upstreamRerunning', 'dependantSystemNode', 'dependsOnMerge'.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The details property.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Get possible values include: 'unknown', 'requested', 'firstRun', 'unsuccessful', 'lastRunSkipped', 'alreadyRunning', 'modifiedInputs', 'upstreamRerunning', 'dependantSystemNode', 'dependsOnMerge'.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set possible values include: 'unknown', 'requested', 'firstRun', 'unsuccessful', 'lastRunSkipped', 'alreadyRunning', 'modifiedInputs', 'upstreamRerunning', 'dependantSystemNode', 'dependsOnMerge'.
     *
     * @param code the code value to set
     * @return the SelectionReason object itself.
     */
    public SelectionReason withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the SelectionReason object itself.
     */
    public SelectionReason withDetails(String details) {
        this.details = details;
        return this;
    }

}