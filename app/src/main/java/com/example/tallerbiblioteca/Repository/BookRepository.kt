package com.example.tallerbiblioteca.Repository

import androidx.lifecycle.LiveData
import com.example.tallerbiblioteca.Database.DAOs.AuthorDAO
import com.example.tallerbiblioteca.Database.DAOs.BookDAO
import com.example.tallerbiblioteca.Database.DAOs.TagDAO
import com.example.tallerbiblioteca.Database.Entities.AuthorEntity
import com.example.tallerbiblioteca.Database.Entities.TagEntity
import com.example.tallerbiblioteca.Models.Book



class BookRepository(private val bookDAO: BookDAO, private val authorDAO: AuthorDAO, private val tagDAO: TagDAO){

    fun insertBook(book: Book){

    }


    fun findBook(isbn: String): Book{
        var book = bookDAO.search(isbn)
        var authors = mutableListOf<AuthorEntity>()
        for(author in book.authors){
            authors.add(authorDAO.search(author))
        }
        var tags = mutableListOf<TagEntity>()
        for(tag in book.tags){
            tags.add(tagDAO.find(tag))
        }

        return Book(book, authors, tags)

    }

    fun retrieveStarred(): LiveData<List<Book>>{

    }

    fun retrieveAllBooks():LiveData<List<Book>>{

    }

    fun updateBookStarred(isbn: String){

    }


}