/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a SourceLocation.
 */
class SourceLocation {
  /**
   * Create a SourceLocation.
   * @property {number} [line]
   * @property {number} [column]
   */
  constructor() {
  }

  /**
   * Defines the metadata of SourceLocation
   *
   * @returns {object} metadata of SourceLocation
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'SourceLocation',
      type: {
        name: 'Composite',
        className: 'SourceLocation',
        modelProperties: {
          line: {
            required: false,
            serializedName: 'line',
            type: {
              name: 'Number'
            }
          },
          column: {
            required: false,
            serializedName: 'column',
            type: {
              name: 'Number'
            }
          }
        }
      }
    };
  }
}

module.exports = SourceLocation;