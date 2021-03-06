/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ODataEntityPayload model.
 */
public class ODataEntityPayload {
    /**
     * The odatacontext property.
     */
    @JsonProperty(value = "@odata\\.context")
    private String odatacontext;

    /**
     * The odatacount property.
     */
    @JsonProperty(value = "@odata\\.count")
    private Integer odatacount;

    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<Object> value;

    /**
     * Get the odatacontext value.
     *
     * @return the odatacontext value
     */
    public String odatacontext() {
        return this.odatacontext;
    }

    /**
     * Set the odatacontext value.
     *
     * @param odatacontext the odatacontext value to set
     * @return the ODataEntityPayload object itself.
     */
    public ODataEntityPayload withOdatacontext(String odatacontext) {
        this.odatacontext = odatacontext;
        return this;
    }

    /**
     * Get the odatacount value.
     *
     * @return the odatacount value
     */
    public Integer odatacount() {
        return this.odatacount;
    }

    /**
     * Set the odatacount value.
     *
     * @param odatacount the odatacount value to set
     * @return the ODataEntityPayload object itself.
     */
    public ODataEntityPayload withOdatacount(Integer odatacount) {
        this.odatacount = odatacount;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Object> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ODataEntityPayload object itself.
     */
    public ODataEntityPayload withValue(List<Object> value) {
        this.value = value;
        return this;
    }

}
