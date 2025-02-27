package com.example.a30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30days.data.Item
import com.example.a30days.data.Items
import com.example.a30days.ui.theme._30DaysTheme
import androidx.compose.ui.unit.dp
import androidx.core.app.NotificationCompat.Style

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysTheme {

            }
        }
    }
}

@Composable
fun DayItem(
    dayItem: Item,
    modifier: Modifier = Modifier)
{
    Card(
        modifier = modifier.height(450.dp)
    ) {
        Column(

        ) {
            Text(
                text = stringResource(dayItem.description),
                style = MaterialTheme.typography.displayLarge
            )
            Image(
                painter = painterResource(dayItem.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DayAppPreview()
{
    _30DaysTheme {
        DayItem(Items.itemList[0],Modifier.padding(top = 50.dp)
        )
    }
}