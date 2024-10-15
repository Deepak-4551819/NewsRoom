package com.deep455.newsroom.presentation.component

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.deep455.newsroom.R
import java.util.Locale

@Composable
fun ImageHolder(
    imageUrl: String?,
    modifier: Modifier = Modifier
) {
    AsyncImage(
        model = ImageRequest
            .Builder(LocalContext.current)
            .data(imageUrl)
            .crossfade(true) // help in transitioning from the placeholder to actual image. cross fade gives seamless transition effect.
            .build(),
        contentDescription = "Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(RoundedCornerShape(4.dp))
            .fillMaxWidth()
            .aspectRatio(16 / 9f),
        placeholder = painterResource(R.drawable.placeholder_loading),
        error = painterResource(R.drawable.placeholder_news)
    )

}