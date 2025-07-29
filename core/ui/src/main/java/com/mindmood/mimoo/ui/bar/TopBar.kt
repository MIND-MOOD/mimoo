package com.mindmood.mimoo.ui.bar

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mindmood.mimoo.ui.R
import com.mindmood.mimoo.ui.icon.ButtonIcon
import com.mindmood.mimoo.ui.theme.DefaultBgColor
import com.mindmood.mimoo.ui.theme.PreviewColor

@Composable
fun TopBar(
    onSettingsClick: () -> Unit = {},
    onChartClick: () -> Unit = {},
    onOverviewClick: () -> Unit = {}
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp),
        color = DefaultBgColor,
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left side - Settings icon
            ButtonIcon(
                painterId = R.drawable.ic_settings,
                iconSize = 22,
                contentDescription = "Settings",
                onClick = onSettingsClick
            )

            // Right side - Chart and Menu icons
            Row(
                horizontalArrangement = Arrangement.spacedBy(18.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Chart icon (bar chart)
                ButtonIcon(
                    painterId = R.drawable.ic_chart,
                    iconSize = 20,
                    contentDescription = "Chart",
                    onClick = onChartClick
                )

                // Menu icon (table chart view)
                ButtonIcon(
                    painterId = R.drawable.ic_overview,
                    iconSize = 26,
                    contentDescription = "Overview",
                    onClick = onOverviewClick
                )

            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = PreviewColor.DefaultBgColor)
@Composable
fun TopBarPreview() {
    TopBar(
        onSettingsClick = {},
        onChartClick = {},
        onOverviewClick = {}
    )
}
