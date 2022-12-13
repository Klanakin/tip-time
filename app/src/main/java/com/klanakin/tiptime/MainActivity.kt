package com.klanakin.tiptime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
<<<<<<< HEAD
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
=======
import androidx.compose.runtime.*
>>>>>>> reinforced
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.klanakin.tiptime.ui.theme.TipTimeTheme
import java.text.NumberFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipTimeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TipTimeScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TipTimeTheme {
<<<<<<< HEAD
=======
        // A surface container using the 'background' color from the theme
>>>>>>> reinforced
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            TipTimeScreen()
        }
    }
}

<<<<<<< HEAD
@Composable
fun TipTimeScreen() {
    var amountInput by remember { mutableStateOf("0") }
    val amount = amountInput.toDoubleOrNull() ?: 0.0
    val tip = calculateTip(amount)

    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
=======
@Suppress("OPT_IN_IS_NOT_ENABLED")
@Composable
fun TipTimeScreen() {
    var amountInput by remember { mutableStateOf("0") }
    val billingAmount = amountInput.toDoubleOrNull() ?: 0.0
    val tip = calcTip(billingAmount)

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .padding(32.dp)
>>>>>>> reinforced
    ) {
        Text(
            text = stringResource(id = R.string.calculate_tip),
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        EditNumberField(
            value = amountInput,
            onValueChange = { amountInput = it }
        )
<<<<<<< HEAD
        Spacer(Modifier.height(24.dp))
=======
        Spacer(modifier = Modifier.height(24.dp))
>>>>>>> reinforced
        Text(
            text = stringResource(R.string.tip_amount, tip),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
<<<<<<< HEAD

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditNumberField(
=======
@Suppress("OPT_IN_IS_NOT_ENABLED")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun EditNumberField(
>>>>>>> reinforced
    value: String,
    onValueChange: (String) -> Unit
) {
    TextField(
<<<<<<< HEAD
        modifier = Modifier.fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        label = { Text(text = stringResource(id = R.string.cost_of_service)) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

private fun calculateTip(amount: Double, tipPercent: Double = 15.0): String {
    val tip = tipPercent/100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}
=======
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        label = { Text(text = stringResource(id = R.string.cost_of_service)) },
        modifier = Modifier.fillMaxWidth()
    )
}

private fun calcTip(
    billingAmount: Double,
    tipPercent: Double = 15.0
): String {
    val tip: Double = tipPercent/100 * billingAmount
    return NumberFormat.getCurrencyInstance().format(tip)
}
>>>>>>> reinforced
