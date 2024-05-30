package com.prince.adsmanager

data class Sum(val x: Int, val y: Int)

fun Sum.getAnswer(): Int {
    return x + y
}