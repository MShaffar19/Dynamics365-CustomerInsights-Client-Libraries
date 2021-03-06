# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class EmbeddedReport(Model):
    """Represents a embedded PowerBI report.

    :param report_type: Possible values include: 'overview', 'sales',
     'marketing', 'service', 'instanceZero'
    :type report_type: str or ~dynamics.customerinsights.api.models.enum
    :param embed_url: Gets the Uri used for Power BI report embedding.
    :type embed_url: str
    :param report_id: Gets the id used for Power BI report embedding.
    :type report_id: str
    """

    _attribute_map = {
        'report_type': {'key': 'reportType', 'type': 'str'},
        'embed_url': {'key': 'embedUrl', 'type': 'str'},
        'report_id': {'key': 'reportId', 'type': 'str'},
    }

    def __init__(self, *, report_type=None, embed_url: str=None, report_id: str=None, **kwargs) -> None:
        super(EmbeddedReport, self).__init__(**kwargs)
        self.report_type = report_type
        self.embed_url = embed_url
        self.report_id = report_id
