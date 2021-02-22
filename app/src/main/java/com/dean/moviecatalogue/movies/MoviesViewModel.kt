package com.dean.moviecatalogue.movies

import androidx.lifecycle.ViewModel
import com.dean.moviecatalogue.DataDummy

class MoviesViewModel : ViewModel(){
    fun getMovies(): List<MoviesData> = DataDummy.generateDummyMovies()
}