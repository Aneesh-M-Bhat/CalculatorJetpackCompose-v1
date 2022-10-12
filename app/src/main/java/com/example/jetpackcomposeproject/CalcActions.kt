package com.example.jetpackcomposeproject

sealed class CalcActions{
    data class Number(val number:Int): CalcActions()
    object Clear: CalcActions()
    object Delete: CalcActions()
    object Decimal: CalcActions()
    object Calculate: CalcActions()
    data class Operation(val operation: CalcOperations):CalcActions()
}
