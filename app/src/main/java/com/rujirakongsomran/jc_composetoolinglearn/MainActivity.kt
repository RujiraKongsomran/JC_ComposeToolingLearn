package com.rujirakongsomran.jc_composetoolinglearn

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.rujirakongsomran.jc_composetoolinglearn.ui.theme.JC_ComposeToolingLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_ComposeToolingLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Preview(
    name = "small font",
    group = "font scales",
    fontScale = 0.5f,
)
@Preview(
    name = "large font",
    group = "font scales",
    fontScale = 1.5f,
)
annotation class FontScalePreviews

@FontScalePreviews
@Composable
fun CreateMultiPreviewAnnotations() {
    Text(text = stringResource(R.string.name))
}

@Preview(locale = "ja", name = "Japanese")
@Preview(locale = "hu", name = "Hungarian")
annotation class LocalesPreview

@LocalesPreview
@Composable
fun LocaleParameter() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = stringResource(id = R.string.name))
    }
}

@Preview(showBackground = true)
@Preview(
    name = "dark theme",
    group = "themes",
    uiMode = UI_MODE_NIGHT_YES
)
annotation class ThemesPreview

@ThemesPreview
@Composable
fun ThemesPreviewDisplay() {
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "MaMa")
    }
}

@FontScalePreviews
@LocalesPreview
@ThemesPreview
annotation class CombinedPreview

@CombinedPreview
@Composable
fun CombinedPreviewDisplay(){
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "Combined")
    }
}



