package com.example.jetpackcomposeproject

data class CalcState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalcOperations?=null
)
