package com.example.jetpackcomposeproject

sealed class CalcOperations(val symbol: String){
    object Add : CalcOperations("+")
    object Sub : CalcOperations("-")
    object Mul : CalcOperations("*")
    object Div : CalcOperations("/")
}
