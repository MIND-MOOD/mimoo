package com.mindmood.mimoo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.mindmood.mimoo.ui.bar.TopBar
import com.mindmood.mimoo.viewmodel.HomeIntent
import com.mindmood.mimoo.viewmodel.HomeViewModel

@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    val context = LocalContext.current
    val state by viewModel.state.collectAsState()

    Scaffold(
        modifier = Modifier
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .imePadding(),
        containerColor = Color.White,
        topBar = {
            TopBar(
                onSettingsClick = {
                    viewModel.handleIntent(
                        HomeIntent.OnSettingsClick)
                },
                onChartClick = {
                    viewModel.handleIntent(
                        HomeIntent.OnChartClick)
                },

                onOverviewClick = {
                    viewModel.handleIntent(
                        HomeIntent.OnOverviewClick)
                },
                )
        },
        bottomBar = {
//            BottomBar()
        },
    ) { innerPadding ->

        if (state.diary.isEmpty()) { // 초기 홈 화면
            Box(
                modifier =
                    Modifier
                        .fillMaxSize()
                        .padding(innerPadding) // windowInsets를 적용
//                        .padding(12.dp)
                        .background(Color.White),
                contentAlignment = Alignment.Center,
            ) {

            }
        } else {

        }
    }

}