package com.ahmed3elshaer.moviesdecade.data

import android.content.Context
import com.ahmed3elshaer.moviesdecade.data.models.Movie
import com.ahmed3elshaer.moviesdecade.data.models.MoviesResponse
import com.ahmed3elshaer.moviesdecade.network.FlickerApi
import com.ahmed3elshaer.moviesdecade.utils.readAssetsFile
import com.squareup.moshi.Moshi
import io.reactivex.Observable
import java.util.*
import javax.inject.Inject


class MoviesRepository @Inject constructor(var flickerApi: FlickerApi, var context: Context) {
    fun getMovies(): Observable<List<Movie>> {
        return Observable.just(mutableListOf())
    }

    fun searchMovies(query: String): Observable<List<Movie>> {
        return Observable.just(mutableListOf())

    }

}