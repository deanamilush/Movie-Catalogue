package com.dean.moviecatalogue

import androidx.lifecycle.ViewModel

class MoviesViewModel : ViewModel(){
    fun getMovies(): List<MoviesData> = DataDummy.generateDummyCourses()
}