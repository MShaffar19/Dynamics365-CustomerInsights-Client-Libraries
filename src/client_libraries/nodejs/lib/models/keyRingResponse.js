/*
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Class representing a KeyRingResponse.
 */
class KeyRingResponse {
  /**
   * Create a KeyRingResponse.
   * @property {uuid} [instanceId]
   * @property {string} [customerId]
   * @property {object} [keyRing]
   */
  constructor() {
  }

  /**
   * Defines the metadata of KeyRingResponse
   *
   * @returns {object} metadata of KeyRingResponse
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'KeyRingResponse',
      type: {
        name: 'Composite',
        className: 'KeyRingResponse',
        modelProperties: {
          instanceId: {
            required: false,
            serializedName: 'instanceId',
            type: {
              name: 'String'
            }
          },
          customerId: {
            required: false,
            serializedName: 'customerId',
            type: {
              name: 'String'
            }
          },
          keyRing: {
            required: false,
            serializedName: 'keyRing',
            type: {
              name: 'Object'
            }
          }
        }
      }
    };
  }
}

module.exports = KeyRingResponse;
