package com.example.tallerbiblioteca.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.room.RoomDatabase
import com.example.tallerbiblioteca.Database.DAOs.AuthorDAO
import com.example.tallerbiblioteca.Database.DAOs.BookDAO
import com.example.tallerbiblioteca.Database.DAOs.TagDAO
import com.example.tallerbiblioteca.Database.LibraryRoomDatabase
import com.example.tallerbiblioteca.Models.Book
import com.example.tallerbiblioteca.Repository.BookRepository

class BookViewModel(app : Application) : AndroidViewModel(app) {

    private val repository : BookRepository

    init {

        val book : BookDAO = LibraryRoomDatabase.getInstance(app).bookDao()
        val autor : AuthorDAO = LibraryRoomDatabase.getInstance(app).authorDAO()
        val tag : TagDAO = LibraryRoomDatabase.getInstance(app).tagDAO()

        repository = BookRepository(book, autor, tag)

    }

    fun findBook(isbn: String): Book {

        return repository.findBook(isbn)
    }

    fun retrieveStarred(): LiveData<List<Book>> {

        return repository.retrieveStarred()
    }

    fun retrieveAllBooks():LiveData<List<Book>>{

        return repository.retrieveAllBooks()
    }
}
