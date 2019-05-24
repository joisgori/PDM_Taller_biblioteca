package com.example.tallerbiblioteca.Database.Entities


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(tableName = BookEntityXAuthorEntity.TABLE_NAME,
        primaryKeys = ["bookIdX", "authorIdX"],
        foreignKeys = [
            ForeignKey(
                entity = BookEntity::class,
                parentColumns = ["bookId"],
                childColumns = ["bookIdX"],
                onDelete = ForeignKey.CASCADE
            ),
            ForeignKey(
                entity = AuthorEntity::class,
                parentColumns = ["authorId"],
                childColumns = ["authorIdX"],
                onDelete = ForeignKey.CASCADE
            )
        ]
)
data class BookEntityXAuthorEntity (
    @ColumnInfo(name = "book_id") var bookIdX: Int = 0,
    @ColumnInfo(name = "author_id") var authorIdX: Int = 0
){
    companion object{
        const val TABLE_NAME = "bookXauthor"
    }
}

// https://itnext.io/how-to-create-m-n-relationship-with-room-and-kotlin-ddbdebf0ee38