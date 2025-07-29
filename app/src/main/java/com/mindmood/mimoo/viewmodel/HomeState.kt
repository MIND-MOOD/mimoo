package com.mindmood.mimoo.viewmodel

data class HomeState(
    val isLoading: Boolean = false, // 로딩중 표시
    val error: String? = null, // 에러 내용

    val selectedIcon: SelectedIcon? = null, // TopBar 선택한 icon
    val diary: String = "", // 오늘 일기 내용
)

enum class SelectedIcon {
    SETTINGS, CHART, LIST
}