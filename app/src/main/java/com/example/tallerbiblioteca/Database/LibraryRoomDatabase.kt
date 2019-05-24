package com.example.tallerbiblioteca.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tallerbiblioteca.Database.DAOs.AuthorDAO
import com.example.tallerbiblioteca.Database.DAOs.BookDAO
import com.example.tallerbiblioteca.Database.DAOs.TagDAO
import com.example.tallerbiblioteca.Database.Entities.AuthorEntity
import com.example.tallerbiblioteca.Database.Entities.BookEntity
import com.example.tallerbiblioteca.Database.Entities.TagEntity
import java.security.AccessControlContext

@Database(entities = [BookEntity::class, AuthorEntity::class, TagEntity::class], version = 1, exportSchema = false)
public abstract class LibraryRoomDatabase: RoomDatabase() {

    //Aqui se puede ver como se hacen las relaciones entre tablas.
    //https://developer.android.com/reference/android/arch/persistence/room/Relation

    abstract fun bookDao(): BookDAO
    abstract fun authorDAO(): AuthorDAO
    abstract fun tagDAO(): TagDAO

    companion object {
        private var INSTANCE : LibraryRoomDatabase? = null

        fun getInstance(context: Context): LibraryRoomDatabase{
            val tempInstace = INSTANCE
            if (tempInstace != null) return tempInstace

            synchronized(this){
                val instance = Room
                    .databaseBuilder(context, LibraryRoomDatabase::class.java, "LibrosDB")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
