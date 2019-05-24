package com.example.tallerbiblioteca.Database.DAOs

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tallerbiblioteca.Database.Entities.BookEntity

@Dao
interface BookDAO {
    //TODO implementar los metodos de manejo de base de datos para BookEntity

    @Query("SELECT * FROM " + BookEntity.TABLE_NAME + " ORDER BY book_Title, book_Author")
    fun getAllBooks(): List<BookEntity>

    @Insert
    fun insert(book: BookEntity)

    @Query("SELECT * FROM " + BookEntity.TABLE_NAME + "WHERE book_Isb=:isbn")
    fun search(isbn: String): BookEntity


}




