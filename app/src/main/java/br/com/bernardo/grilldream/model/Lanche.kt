package br.com.bernardo.grilldream.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Lanche(
    val name: String,
    val image: Int,
    val price: Double,
    val desc: String,
    val rating: Float,
    val infos: InfoLanche,
) : Parcelable