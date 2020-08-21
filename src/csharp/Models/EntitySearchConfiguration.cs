// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class EntitySearchConfiguration
    {
        /// <summary>
        /// Initializes a new instance of the EntitySearchConfiguration class.
        /// </summary>
        public EntitySearchConfiguration()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the EntitySearchConfiguration class.
        /// </summary>
        /// <param name="qualifiedEntityName">Gets unique entity name for this
        /// entity</param>
        /// <param name="attributes">Gets the attribute search config</param>
        public EntitySearchConfiguration(string qualifiedEntityName = default(string), IList<AttributeSearchConfiguration> attributes = default(IList<AttributeSearchConfiguration>))
        {
            QualifiedEntityName = qualifiedEntityName;
            Attributes = attributes;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets unique entity name for this entity
        /// </summary>
        [JsonProperty(PropertyName = "qualifiedEntityName")]
        public string QualifiedEntityName { get; set; }

        /// <summary>
        /// Gets the attribute search config
        /// </summary>
        [JsonProperty(PropertyName = "attributes")]
        public IList<AttributeSearchConfiguration> Attributes { get; set; }

    }
}