package com.joseph.tmdb_mvvm.model

import com.google.gson.annotations.SerializedName

data class MovieDetail(
    @SerializedName("adult")
    var adult: Boolean,
    @SerializedName("backdrop_path")
    var backdropPath: String?,
    @SerializedName("budget")
    var budget: Int,
    @SerializedName("genres")
    var genres: List<Genre>,
    @SerializedName("homepage")
    var homepage: String,
    @SerializedName("id")
    var id: Int,
    @SerializedName("imdb_id")
    var imdbId: String,
    @SerializedName("original_language")
    var originalLanguage: String,
    @SerializedName("original_title")
    var originalTitle: String,
    @SerializedName("overview")
    var overview: String,
    @SerializedName("popularity")
    var popularity: Double,
    @SerializedName("poster_path")
    var posterPath: String,
    @SerializedName("release_date")
    var releaseDate: String,
    @SerializedName("revenue")
    var revenue: Int,
    @SerializedName("runtime")
    var runtime: Int,
    @SerializedName("spoken_languages")
    var spokenLanguages: List<SpokenLanguage>,
    @SerializedName("status")
    var status: String,
    @SerializedName("tagline")
    var tagline: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("video")
    var video: Boolean,
    @SerializedName("vote_average")
    var voteAverage: Double,
    @SerializedName("vote_count")
    var voteCount: Int
) {
    data class Genre(
        @SerializedName("id")
        var id: Int,
        @SerializedName("name")
        var name: String
    )

    data class SpokenLanguage(
        @SerializedName("english_name")
        var englishName: String,
        @SerializedName("iso_639_1")
        var iso6391: String,
        @SerializedName("name")
        var name: String
    )
}
