package com.example.tallerbiblioteca.Database.DAOs


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.tallerbiblioteca.Database.Entities.AuthorEntity
import com.example.tallerbiblioteca.Database.Entities.BookEntity
import com.example.tallerbiblioteca.Database.Entities.TagEntity

@Dao
interface TagDAO {
    @Query("SELECT * FROM " + TagEntity.TABLE_NAME)
    fun getAllTags(): List<TagEntity>

    @Insert
    fun insert(tag: TagEntity)

    @Query("SELECT * FROM " + AuthorEntity.TABLE_NAME +"WHERE " + AuthorEntity.TABLE_NAME +".tag_Text")
    fun find(tag: String): TagEntity

    //fun getAllBooksFromTag(tag: TagEntity): List<BookEntity>
}

// https://github.com/munozkessler/PDM_Taller_biblioteca.git