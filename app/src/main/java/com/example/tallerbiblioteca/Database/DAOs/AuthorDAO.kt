package com.example.tallerbiblioteca.Database.DAOs

import androidx.room.Dao
import com.example.tallerbiblioteca.Database.Entities.Author

@Dao
interface AuthorDAO {

    fun findAllAuthors() //tipo liveData? o List?

    fun insert(author: Author)

    fun search(author: Author)
}