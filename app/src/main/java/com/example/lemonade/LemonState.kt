package com.example.lemonade

enum class LemonState(val value: String) {
    SELECT("select"),
    SQUEEZE("squeeze"),
    DRINK("drink"),
    RESTART("restart")
}