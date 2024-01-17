package br.com.bernardo.grilldream.model

data class CustomHamburger(
    val pao: String,
    val carne: String,
    val tamanhoCarne: Int,
    val queijo: Boolean,
    val alface: Boolean,
    val tomate: Boolean,
    val picles: Boolean,
    val cebola: Boolean,
)