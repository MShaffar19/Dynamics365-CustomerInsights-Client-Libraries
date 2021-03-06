// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Dynamics.CustomerInsights.Api.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class DependencyValidationIssue
    {
        /// <summary>
        /// Initializes a new instance of the DependencyValidationIssue class.
        /// </summary>
        public DependencyValidationIssue()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DependencyValidationIssue class.
        /// </summary>
        /// <param name="type">Possible values include: 'mapInvalid',
        /// 'matchRuleInvalid', 'mergePolicyInvalid', 'relationshipInvalid',
        /// 'measureDefinitionInvalid', 'segmentDefinitionInvalid',
        /// 'unifiedActivitiyMappingInvalid', 'generic'</param>
        /// <param name="severity">Possible values include: 'error',
        /// 'warning'</param>
        public DependencyValidationIssue(string type = default(string), string severity = default(string), string id = default(string), string description = default(string))
        {
            Type = type;
            Severity = severity;
            Id = id;
            Description = description;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets possible values include: 'mapInvalid',
        /// 'matchRuleInvalid', 'mergePolicyInvalid', 'relationshipInvalid',
        /// 'measureDefinitionInvalid', 'segmentDefinitionInvalid',
        /// 'unifiedActivitiyMappingInvalid', 'generic'
        /// </summary>
        [JsonProperty(PropertyName = "type")]
        public string Type { get; set; }

        /// <summary>
        /// Gets or sets possible values include: 'error', 'warning'
        /// </summary>
        [JsonProperty(PropertyName = "severity")]
        public string Severity { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "id")]
        public string Id { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "description")]
        public string Description { get; set; }

    }
}
