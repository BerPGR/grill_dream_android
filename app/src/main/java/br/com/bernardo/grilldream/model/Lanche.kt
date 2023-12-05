package br.com.bernardo.grilldream.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Lanche(
    val name: String,
    val image: Int,
    val preco: Double,
    val infos: InfoLanche
) : Parcelable