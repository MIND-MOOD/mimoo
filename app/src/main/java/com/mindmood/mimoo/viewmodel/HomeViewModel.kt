package com.mindmood.mimoo.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state: StateFlow<HomeState> = _state.asStateFlow()

    fun handleIntent(intent: HomeIntent) {
        when (intent) {
            is HomeIntent.OnSettingsClick -> topBarIconClick(SelectedIcon.SETTINGS)
            is HomeIntent.OnChartClick -> topBarIconClick(SelectedIcon.CHART)
            is HomeIntent.OnOverviewClick -> topBarIconClick(SelectedIcon.LIST)
        }
    }

    /* ================================ Top Bar ================================ */
    // TopBar에서 선택한 ICON
    private fun topBarIconClick(selectedIcon: SelectedIcon) {
        _state.update { it.copy(selectedIcon = selectedIcon) }
    }

    /* ================================ Date Picker ================================ */


    /* ================================ 기타 ================================ */


}