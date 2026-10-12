package com.jayshil.jetpack_compose_24012021038_pr5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jayshil.jetpack_compose_24012021038_pr5.ui.theme.Jetpack_Compose_24012021038_pr5Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Jetpack_Compose_24012021038_pr5Theme {
                AppNavigation()
            }
        }
    }
}
