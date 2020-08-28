/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a CreatedResult.
 */
class CreatedResult {
  /**
   * Create a CreatedResult.
   * @property {string} [location]
   * @property {object} [value]
   * @property {array} [formatters]
   * @property {array} [contentTypes]
   * @property {string} [declaredType]
   * @property {number} [statusCode]
   */
  constructor() {
  }

  /**
   * Defines the metadata of CreatedResult
   *
   * @returns {object} metadata of CreatedResult
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'CreatedResult',
      type: {
        name: 'Composite',
        className: 'CreatedResult',
        modelProperties: {
          location: {
            required: false,
            serializedName: 'location',
            type: {
              name: 'String'
            }
          },
          value: {
            required: false,
            serializedName: 'value',
            type: {
              name: 'Object'
            }
          },
          formatters: {
            required: false,
            serializedName: 'formatters',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'ObjectElementType',
                  type: {
                    name: 'Object'
                  }
              }
            }
          },
          contentTypes: {
            required: false,
            serializedName: 'contentTypes',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'StringElementType',
                  type: {
                    name: 'String'
                  }
              }
            }
          },
          declaredType: {
            required: false,
            serializedName: 'declaredType',
            type: {
              name: 'String'
            }
          },
          statusCode: {
            required: false,
            nullable: true,
            serializedName: 'statusCode',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = CreatedResult;