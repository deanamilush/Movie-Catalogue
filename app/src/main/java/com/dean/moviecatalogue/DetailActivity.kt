package com.dean.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dean.moviecatalogue.databinding.ActivityDetailBinding
import com.dean.moviecatalogue.movies.MoviesData
import com.dean.moviecatalogue.tv.TvShowsData

class DetailActivity : AppCompatActivity() {

    companion object{
        val EXTRA_DATA = "extra_data"
        val EXTRA_TV = "extra_tv"
    }

    private lateinit var detailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        getDetailTvShows()

        val detail = intent.getParcelableExtra<MoviesData>(EXTRA_DATA) as MoviesData
        Glide.with(this)
            .load(detail.poster)
            .apply(RequestOptions().override(350,250) )
            .into(detailBinding.detailPoster)
        detailBinding.detailTitle.text = detail.title
        detailBinding.detailGenre.text = detail.genre
        detailBinding.detailCreator.text = detail.diretor
        detailBinding.detailDescription.text = detail.description

    }

    fun getDetailTvShows(){
        val detailTv = intent.getParcelableExtra<TvShowsData>(EXTRA_TV) as TvShowsData
        Glide.with(this)
            .load(detailTv.poster)
            .apply(RequestOptions().override(350,250))
            .into(detailBinding.detailPoster)
        detailBinding.detailTitle.text = detailTv.title
        detailBinding.detailGenre.text = detailTv.genre
        detailBinding.detailCreator.text = detailTv.creator
        detailBinding.detailDescription.text = detailTv.description
    }
}