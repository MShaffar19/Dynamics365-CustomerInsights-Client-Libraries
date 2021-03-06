# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class HistoricalSegmentStats(Model):
    """Represents historical Segment statistics.

    :param evaluation_date: Gets the segment ran date.
    :type evaluation_date: datetime
    :param entity_count: Gets the count of entity.
    :type entity_count: long
    :param job_status: Gets the segment evaluation job status.
    :type job_status: str
    :param error:
    :type error: ~dynamics.customerinsights.api.models.StringInfo
    """

    _attribute_map = {
        'evaluation_date': {'key': 'evaluationDate', 'type': 'iso-8601'},
        'entity_count': {'key': 'entityCount', 'type': 'long'},
        'job_status': {'key': 'jobStatus', 'type': 'str'},
        'error': {'key': 'error', 'type': 'StringInfo'},
    }

    def __init__(self, *, evaluation_date=None, entity_count: int=None, job_status: str=None, error=None, **kwargs) -> None:
        super(HistoricalSegmentStats, self).__init__(**kwargs)
        self.evaluation_date = evaluation_date
        self.entity_count = entity_count
        self.job_status = job_status
        self.error = error
