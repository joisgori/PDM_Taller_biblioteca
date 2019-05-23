package com.example.tallerbiblioteca.Database.DAOs


import androidx.room.Dao
import com.example.tallerbiblioteca.Database.Entities.BookEntity
import com.example.tallerbiblioteca.Database.Entities.TagEntity

@Dao
interface TagDAO {

    fun getAllTags(): List<TagEntity>

    fun insert(tag: TagEntity)

    fun find(tag: String): TagEntity

    fun getAllBooksFromTag(tag: TagEntity): List<BookEntity>
}