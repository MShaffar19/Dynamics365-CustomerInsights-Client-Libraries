// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// The information about an entity size
    /// </summary>
    public partial class EntitySize
    {
        /// <summary>
        /// Initializes a new instance of the EntitySize class.
        /// </summary>
        public EntitySize()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the EntitySize class.
        /// </summary>
        /// <param name="qualifiedEntityName">Gets the entity Name</param>
        /// <param name="size">Gets the size of the entire entity (in
        /// Bytes)</param>
        /// <param name="rowCount">Gets the row count of the entity</param>
        public EntitySize(string qualifiedEntityName = default(string), long? size = default(long?), long? rowCount = default(long?))
        {
            QualifiedEntityName = qualifiedEntityName;
            Size = size;
            RowCount = rowCount;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the entity Name
        /// </summary>
        [JsonProperty(PropertyName = "qualifiedEntityName")]
        public string QualifiedEntityName { get; set; }

        /// <summary>
        /// Gets the size of the entire entity (in Bytes)
        /// </summary>
        [JsonProperty(PropertyName = "size")]
        public long? Size { get; set; }

        /// <summary>
        /// Gets the row count of the entity
        /// </summary>
        [JsonProperty(PropertyName = "rowCount")]
        public long? RowCount { get; set; }

    }
}