package com.dean.moviecatalogue.movies

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MoviesData(
    var title: String,
    var genre: String,
    var poster: Int,
    var description: String,
    var diretor: String,

    ): Parcelable