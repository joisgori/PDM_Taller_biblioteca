package com.example.tallerbiblioteca.Database.DAOs

import androidx.room.Dao
import com.example.tallerbiblioteca.Database.Entities.Tag

@Dao
interface TagDAO {

    fun getAllTags()// tipo LiveData? O solo List?

    fun insert(tag: Tag)

    fun find(tag: Tag)
}