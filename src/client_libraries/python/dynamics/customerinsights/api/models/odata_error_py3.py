# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class ODataError(Model):
    """ODataError.

    :param error_code:
    :type error_code: str
    :param message:
    :type message: str
    :param target:
    :type target: str
    :param details:
    :type details:
     list[~dynamics.customerinsights.api.models.ODataErrorDetail]
    :param inner_error:
    :type inner_error: ~dynamics.customerinsights.api.models.ODataInnerError
    :param instance_annotations:
    :type instance_annotations:
     list[~dynamics.customerinsights.api.models.ODataInstanceAnnotation]
    :param type_annotation:
    :type type_annotation:
     ~dynamics.customerinsights.api.models.ODataTypeAnnotation
    """

    _attribute_map = {
        'error_code': {'key': 'errorCode', 'type': 'str'},
        'message': {'key': 'message', 'type': 'str'},
        'target': {'key': 'target', 'type': 'str'},
        'details': {'key': 'details', 'type': '[ODataErrorDetail]'},
        'inner_error': {'key': 'innerError', 'type': 'ODataInnerError'},
        'instance_annotations': {'key': 'instanceAnnotations', 'type': '[ODataInstanceAnnotation]'},
        'type_annotation': {'key': 'typeAnnotation', 'type': 'ODataTypeAnnotation'},
    }

    def __init__(self, *, error_code: str=None, message: str=None, target: str=None, details=None, inner_error=None, instance_annotations=None, type_annotation=None, **kwargs) -> None:
        super(ODataError, self).__init__(**kwargs)
        self.error_code = error_code
        self.message = message
        self.target = target
        self.details = details
        self.inner_error = inner_error
        self.instance_annotations = instance_annotations
        self.type_annotation = type_annotation
