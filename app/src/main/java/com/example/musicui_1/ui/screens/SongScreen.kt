package com.example.musicui_1.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicui_1.R
import com.example.musicui_1.ui.theme.MusicUI_1Theme

/** Each individual song screen */
@Composable
fun SongScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        // song name
        Text(
            text = stringResource(id = R.string.song_name).uppercase(),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

        // artist's name
        Text(
            text = stringResource(id = R.string.artist_name),
        )

        Spacer(modifier = Modifier.height(50.dp))

        // album art & player controls
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .wrapContentSize()
                .padding(end = 10.dp, bottom = 10.dp)
        ) {
            Box(modifier = Modifier.weight(1f)) {
                // album art
                Image(
                    painter = painterResource(id = R.drawable.brave),
                    contentDescription = stringResource(id = R.string.song_name),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(300.dp)
                        .border(BorderStroke(2.dp, Color.Cyan), CircleShape)
                        .padding(5.dp)
                        .clip(CircleShape)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Box(
                modifier = Modifier
                    .clip(
                        CutCornerShape(
                        topStart = 20.dp,
                        bottomEnd = 20.dp,
                    )
                    )
                    .background(Color.Cyan)
                    .padding(horizontal = 3.dp, vertical = 6.dp),
            ) {
                // controls
                Column(verticalArrangement = Arrangement.SpaceAround) {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Rounded.Refresh,
                            contentDescription = stringResource(id = R.string.replay_btn))
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.skip_previous),
                            contentDescription = stringResource(id = R.string.skip_prev_btn))
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Rounded.PlayArrow,
                            contentDescription = stringResource(id = R.string.play_btn))
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.skip_next),
                            contentDescription = stringResource(id = R.string.skip_next_btn))
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Rounded.Favorite,
                            contentDescription = stringResource(id = R.string.fav_btn))
                    }
                }
            }
        }
    }
}


/** SongScreen Preview */
@Preview(showBackground = true)
@Composable
fun SongScreenPreview() {
    MusicUI_1Theme {
        SongScreen()
    }
}