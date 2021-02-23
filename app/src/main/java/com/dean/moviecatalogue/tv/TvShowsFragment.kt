package com.dean.moviecatalogue.tv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.dean.moviecatalogue.databinding.FragmentTvShowsBinding

class TvShowsFragment : Fragment() {

    private lateinit var tvShowsBinding: FragmentTvShowsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tvShowsBinding = FragmentTvShowsBinding.inflate(layoutInflater, container, false)
        return tvShowsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[TvShowsViewModel::class.java]
            val tv = viewModel.getTvShows()
            val tvShowsAdapter = TvShowsAdapter()
            tvShowsAdapter.setTvShows(tv)

            with(tvShowsBinding.rvTvShows) {
                layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowsAdapter
            }
        }
    }
}