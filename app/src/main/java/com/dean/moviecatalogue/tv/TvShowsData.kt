package com.dean.moviecatalogue.tv

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowsData(
    var title: String,
    var genre: String,
    var poster: Int,
    var description: String,
    var creator: String,

    ): Parcelable