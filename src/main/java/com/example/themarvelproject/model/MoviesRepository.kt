package com.example.themarvelproject.model

import com.example.themarvelproject.R


object MoviesRepository {
    val Movies = listOf(
        Movie(
            movieName =  R.string.Movie_1,
            dateRes = R.string.Date_1,
            posterRes = R.drawable.iron_man_1,
        ),
        Movie(
            movieName =  R.string.Movie_2,
            dateRes = R.string.Date_2,
            posterRes = R.drawable.the_incredible_hulk,
        ),
    )
}
