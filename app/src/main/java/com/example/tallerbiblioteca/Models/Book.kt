package com.example.tallerbiblioteca.Models

import com.example.tallerbiblioteca.Database.Entities.AuthorEntity
import com.example.tallerbiblioteca.Database.Entities.BookEntity
import com.example.tallerbiblioteca.Database.Entities.TagEntity

data class Book(val book: BookEntity, val authors:List<AuthorEntity>, val tags: List<TagEntity>?)