package com.example.tallerbiblioteca.Database.DAOs

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tallerbiblioteca.Database.Entities.BookEntity

@Dao
interface BookDAO {
    //TODO implementar los metodos de manejo de base de datos para BookEntity

    @Query("SELECT * FROM " + BookEntity.TABLE_NAME)
    fun getAllBooks(): List<BookEntity>

    @Insert
    fun insert(book: BookEntity)

    @Query("SELECT * FROM " + BookEntity.TABLE_NAME + "WHERE book_Isbn=:isbn")
    fun search(isbn: String): BookEntity


}




