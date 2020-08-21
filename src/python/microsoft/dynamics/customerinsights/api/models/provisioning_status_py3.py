# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class ProvisioningStatus(Model):
    """Represents the status of a provisioning operation.

    :param total_steps: Gets the total number of steps in the provisioning
     operation.
    :type total_steps: int
    :param current_step: Gets the current step in the provisioning operation.
    :type current_step: int
    :param current_operation: Possible values include: 'starting', 'creating',
     'loadingData', 'completed'
    :type current_operation: str or
     ~microsoft.dynamics.customerinsights.api.models.enum
    :param created_time_utc: Gets the instance created time.
    :type created_time_utc: datetime
    :param last_updated_time_utc: Gets the instance last updated time.
    :type last_updated_time_utc: datetime
    :param errors: Gets a list of provisioning errors.
    :type errors:
     list[~microsoft.dynamics.customerinsights.api.models.InstanceProvisioningError]
    """

    _attribute_map = {
        'total_steps': {'key': 'totalSteps', 'type': 'int'},
        'current_step': {'key': 'currentStep', 'type': 'int'},
        'current_operation': {'key': 'currentOperation', 'type': 'str'},
        'created_time_utc': {'key': 'createdTimeUtc', 'type': 'iso-8601'},
        'last_updated_time_utc': {'key': 'lastUpdatedTimeUtc', 'type': 'iso-8601'},
        'errors': {'key': 'errors', 'type': '[InstanceProvisioningError]'},
    }

    def __init__(self, *, total_steps: int=None, current_step: int=None, current_operation=None, created_time_utc=None, last_updated_time_utc=None, errors=None, **kwargs) -> None:
        super(ProvisioningStatus, self).__init__(**kwargs)
        self.total_steps = total_steps
        self.current_step = current_step
        self.current_operation = current_operation
        self.created_time_utc = created_time_utc
        self.last_updated_time_utc = last_updated_time_utc
        self.errors = errors