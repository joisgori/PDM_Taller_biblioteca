package com.example.tallerbiblioteca.Database.DAOs

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.example.tallerbiblioteca.Database.Entities.BookEntity

@Dao
interface BookDAO {
    //TODO implementar los metodos de manejo de base de datos para BookEntity

    fun getAllBooks(): List<BookEntity>

    fun insert(book: BookEntity)

    fun search(isbn: String): BookEntity


}