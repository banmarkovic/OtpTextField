package com.ban.otptextfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ban.otptextfield.ui.theme.OtpTextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OtpTextFieldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(20.dp),
                    color = Color.White
                ) {
                    var otpValue by remember {
                        mutableStateOf("")
                    }

                    OtpTextField(
                        otpText = otpValue,
                        onOtpTextChange = { value, otpInputFilled ->
                            otpValue = value
                        }
                    )
                }
            }
        }
    }
}
