package br.com.bernardo.grilldream.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class InfoLanche(
    val tipoPao: String,
    val tipoCarne: String,
    val tamanhoCarne: String
) : Parcelable