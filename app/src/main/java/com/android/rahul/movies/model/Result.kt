package com.android.rahul.movies.model

import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Keep
@Entity(tableName = "result")
data class Result(
    @PrimaryKey val id: Int?,
    @ColumnInfo(name = "adult") val adult: Boolean?=false,
    @ColumnInfo(name = "backdrop_path") val backdrop_path: String?="",
    @ColumnInfo(name = "original_language") val original_language: String?="",
    @ColumnInfo(name = "original_title") val original_title: String?="",
    @ColumnInfo(name = "overview") val overview: String?="",
    @ColumnInfo(name = "popularity") val popularity: Double?=0.0,
    @ColumnInfo(name = "poster_path") val poster_path: String?="",
    @ColumnInfo(name = "release_date") val release_date: String?="",
    @ColumnInfo(name = "title") val title: String?="",
    @ColumnInfo(name = "video") val video: Boolean?=false,
    @ColumnInfo(name = "vote_average") val vote_average: String?="",
    @ColumnInfo(name = "vote_count") val vote_count: Int?=0
): Serializable