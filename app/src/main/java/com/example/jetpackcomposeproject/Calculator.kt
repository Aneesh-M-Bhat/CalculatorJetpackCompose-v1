package com.example.jetpackcomposeproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(state: CalcState,
               modifier: Modifier,
               buttonSpacing:Dp =8.dp,
                onAction: (CalcActions) -> Unit){
    Box(modifier = modifier){
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter), verticalArrangement = Arrangement.spacedBy(buttonSpacing)) {
            Text(text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.Black,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalcButton(symbol = "AC", modifier = Modifier
                    .background(Color.LightGray)
                    .aspectRatio(2f)
                    .weight(2f),
                    onClick = {onAction(CalcActions.Clear)}
                )
                CalcButton(symbol = "Del", modifier = Modifier
                    .background(Color.LightGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Clear)}
                )
                CalcButton(symbol = "/", modifier = Modifier
                    .background(Color.Blue)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Operation(CalcOperations.Div))}
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalcButton(symbol = "7", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(7))}
                )
                CalcButton(symbol = "8", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(8))}
                )
                CalcButton(symbol = "9", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(9))}
                )
                CalcButton(symbol = "*", modifier = Modifier
                    .background(Color.Blue)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Operation(CalcOperations.Mul))}
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalcButton(symbol = "4", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(4))}
                )
                CalcButton(symbol = "5", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(5))}
                )
                CalcButton(symbol = "6", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(6))}
                )
                CalcButton(symbol = "-", modifier = Modifier
                    .background(Color.Blue)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Operation(CalcOperations.Sub))}
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalcButton(symbol = "1", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(1))}
                )
                CalcButton(symbol = "2", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(2))}
                )
                CalcButton(symbol = "3", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Number(3))}
                )
                CalcButton(symbol = "+", modifier = Modifier
                    .background(Color.Blue)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Operation(CalcOperations.Add))}
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalcButton(symbol = "0", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(2f)
                    .weight(2f),
                    onClick = {onAction(CalcActions.Number(0))}
                )
                CalcButton(symbol = ".", modifier = Modifier
                    .background(Color.DarkGray)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Decimal)}
                )
                CalcButton(symbol = "=", modifier = Modifier
                    .background(Color.Blue)
                    .aspectRatio(1f)
                    .weight(1f),
                    onClick = {onAction(CalcActions.Calculate)}
                )
            }
        }
        
    }
}