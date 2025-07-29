package com.mindmood.mimoo.ui.icon

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mindmood.mimoo.ui.R
import com.mindmood.mimoo.ui.theme.Gray600
import com.mindmood.mimoo.ui.theme.PreviewColor

@Composable
fun ButtonIcon(
    modifier: Modifier = Modifier,
    painterId: Int,
    iconSize: Int = 24,
    contentDescription: String,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }

    Box(
        modifier = modifier
            .clickable(
                interactionSource = interactionSource,
                indication = null, // Ripple 제거
                onClick = onClick
            )
            .semantics { role = Role.Button }, // 접근성 향상
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = painterId),
            contentDescription = contentDescription,
            tint = Gray600,
            modifier = Modifier.size(iconSize.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = PreviewColor.White)
@Composable
fun ButtonIconPreview() {
    ButtonIcon(
        painterId = R.drawable.ic_settings,
        contentDescription = "Preview",
        onClick = { }
    )
}