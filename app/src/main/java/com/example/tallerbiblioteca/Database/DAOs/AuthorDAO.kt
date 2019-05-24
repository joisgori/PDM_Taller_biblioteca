package com.example.tallerbiblioteca.Database.DAOs

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tallerbiblioteca.Database.Entities.AuthorEntity
import com.example.tallerbiblioteca.Database.Entities.BookEntity

@Dao
interface AuthorDAO {
    @Query("SELECT * FROM " + AuthorEntity.TABLE_NAME)
    fun findAllAuthors(): List<AuthorEntity>

    @Insert
    fun insert(author: AuthorEntity)

    @Query("SELECT * FROM " + BookEntity.TABLE_NAME + "WHERE first_Name=:name")
    fun search(name: String):AuthorEntity

    //@Query("SELECT * FROM " + BookEntity.TABLE_NAME + "WHERE first_Name=:name")
    //fun getAllBooksFromAuthor(name: AuthorEntity):List<BookEntity>
}

