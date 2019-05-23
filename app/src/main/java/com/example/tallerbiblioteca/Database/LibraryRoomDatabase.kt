package com.example.tallerbiblioteca.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tallerbiblioteca.Database.DAOs.AuthorDAO
import com.example.tallerbiblioteca.Database.DAOs.BookDAO
import com.example.tallerbiblioteca.Database.DAOs.TagDAO
import com.example.tallerbiblioteca.Database.Entities.AuthorEntity
import com.example.tallerbiblioteca.Database.Entities.BookEntity
import com.example.tallerbiblioteca.Database.Entities.TagEntity

@Database(entities = [BookEntity::class, AuthorEntity::class, TagEntity::class], version = 1, exportSchema = false)
public abstract class LibraryRoomDatabase: RoomDatabase() {

    //Aqui se puede ver como se hacen las relaciones entre tablas.
    //https://developer.android.com/reference/android/arch/persistence/room/Relation

    abstract fun bookDao(): BookDAO
    abstract fun authorDAO(): AuthorDAO
    abstract fun tagDAO(): TagDAO
}