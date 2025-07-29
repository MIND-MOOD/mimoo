package com.mindmood.mimoo.viewmodel

sealed class HomeIntent {
//    data class SendMessage(val message: String) : ChatIntent()
//    data object StartSpeechToText : ChatIntent()

    data object OnSettingsClick : HomeIntent()
    data object OnChartClick : HomeIntent()
    data object OnOverviewClick : HomeIntent()
}