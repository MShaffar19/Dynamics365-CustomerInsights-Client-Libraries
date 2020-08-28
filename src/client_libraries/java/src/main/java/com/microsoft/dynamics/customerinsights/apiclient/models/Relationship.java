/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.dynamics.customerinsights.apiclient.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Relationship model.
 */
public class Relationship {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The annotations property.
     */
    @JsonProperty(value = "annotations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Annotation> annotations;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Relationship object itself.
     */
    public Relationship withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the Relationship object itself.
     */
    public Relationship withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the annotations value.
     *
     * @return the annotations value
     */
    public List<Annotation> annotations() {
        return this.annotations;
    }

}