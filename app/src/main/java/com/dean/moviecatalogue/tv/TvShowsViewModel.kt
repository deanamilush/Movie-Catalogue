package com.dean.moviecatalogue.tv

import androidx.lifecycle.ViewModel
import com.dean.moviecatalogue.DataDummy

class TvShowsViewModel : ViewModel(){
    fun getTvShows(): List<TvShowsData> =
        DataDummy.generateDummyTvShows()
}