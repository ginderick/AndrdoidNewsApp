package com.example.andrdoidnewsapp.db

import androidx.room.TypeConverter
import com.example.andrdoidnewsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }

}