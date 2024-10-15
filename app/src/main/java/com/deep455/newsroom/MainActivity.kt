package com.deep455.newsroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.deep455.newsroom.presentation.news_screen.NewsScreen
import com.deep455.newsroom.presentation.news_screen.NewsScreenViewModel
import com.deep455.newsroom.presentation.theme.NewsroomTheme
import com.deep455.newsroom.util.NavGraphSetup
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsroomTheme {
                    val navController = rememberNavController()
                    NavGraphSetup(navController = navController)
                }
            }
        }
    }

