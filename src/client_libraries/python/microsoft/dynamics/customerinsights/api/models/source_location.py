# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class SourceLocation(Model):
    """SourceLocation.

    :param line:
    :type line: int
    :param column:
    :type column: int
    """

    _attribute_map = {
        'line': {'key': 'line', 'type': 'int'},
        'column': {'key': 'column', 'type': 'int'},
    }

    def __init__(self, **kwargs):
        super(SourceLocation, self).__init__(**kwargs)
        self.line = kwargs.get('line', None)
        self.column = kwargs.get('column', None)