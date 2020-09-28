# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class ProfileStoreModuleRunInfo(Model):
    """ProfileStoreModuleRunInfo.

    :param run_info: Gets the LastSuccessfulRunId for every
     fullyQualifiedEntity.
    :type run_info: dict[str, str]
    """

    _attribute_map = {
        'run_info': {'key': 'runInfo', 'type': '{str}'},
    }

    def __init__(self, *, run_info=None, **kwargs) -> None:
        super(ProfileStoreModuleRunInfo, self).__init__(**kwargs)
        self.run_info = run_info