# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class TrialInfo(Model):
    """The information for a trial instance.

    :param help_sections_visited: Gets the list of section were helped is
     disabled
    :type help_sections_visited: list[str]
    :param has_completed_initial_ingestion: Gets a value indicating whether
     the initial ingestion has completed
    :type has_completed_initial_ingestion: bool
    :param trial_activated: Gets a value indicating whether the trial
     environment is activated or not
    :type trial_activated: bool
    """

    _attribute_map = {
        'help_sections_visited': {'key': 'helpSectionsVisited', 'type': '[str]'},
        'has_completed_initial_ingestion': {'key': 'hasCompletedInitialIngestion', 'type': 'bool'},
        'trial_activated': {'key': 'trialActivated', 'type': 'bool'},
    }

    def __init__(self, **kwargs):
        super(TrialInfo, self).__init__(**kwargs)
        self.help_sections_visited = kwargs.get('help_sections_visited', None)
        self.has_completed_initial_ingestion = kwargs.get('has_completed_initial_ingestion', None)
        self.trial_activated = kwargs.get('trial_activated', None)