/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LogMessage model.
 */
public class LogMessage {
    /**
     * The location property.
     */
    @JsonProperty(value = "location")
    private SourceLocation location;

    /**
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public SourceLocation location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the LogMessage object itself.
     */
    public LogMessage withLocation(SourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the LogMessage object itself.
     */
    public LogMessage withMessage(String message) {
        this.message = message;
        return this;
    }

}
