package com.example.tallerbiblioteca.Database.DAOs

import androidx.room.Dao
import com.example.tallerbiblioteca.Database.Entities.AuthorEntity
import com.example.tallerbiblioteca.Database.Entities.BookEntity

@Dao
interface AuthorDAO {

    fun findAllAuthors(): List<AuthorEntity>

    fun insert(author: AuthorEntity)

    fun search(name: String):AuthorEntity

    fun getAllBooksFromAuthor(name: AuthorEntity):List<BookEntity>
}