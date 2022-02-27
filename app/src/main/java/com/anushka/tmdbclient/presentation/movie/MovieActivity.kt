package com.anushka.tmdbclient.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.anushka.tmdbclient.R
import com.anushka.tmdbclient.databinding.ActivityMovieBinding
import com.anushka.tmdbclient.presentation.di.core.Injector
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {
    private val TAG = "MovieActivity"

    private lateinit var binding: ActivityMovieBinding
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var adapter: MovieAdapter

    @Inject
    lateinit var factory: MovieViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)
        (application as Injector).createMovieSubComponent().inject(this)

        movieViewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
        initRecyclerView()

    }

    private fun initRecyclerView() {
        binding.movieRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MovieAdapter()
        binding.movieRecyclerView.adapter = adapter
        displayPopularMovies()
    }

    fun displayPopularMovies() {
        binding.movieProgressBar.visibility = View.VISIBLE
        val responseLiveData = movieViewModel.getMovies()
        responseLiveData.observe(this, Observer {
            if (it != null) {
                adapter.apply {
                    //setMovieList(it)
                    notifyDataSetChanged()
                    binding.movieProgressBar.visibility = View.GONE
                }
            } else {
                binding.movieProgressBar.visibility = View.GONE
                Toast.makeText(this, "No data available", Toast.LENGTH_SHORT).show()
            }
        })
    }

}