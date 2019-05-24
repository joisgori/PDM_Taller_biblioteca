package com.example.tallerbiblioteca.Database.Entities


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = AuthorEntity.TABLE_NAME)
data class AuthorEntity(
  //@ColumnInfo(name = "phone_Number") @NotNull val phoneNumber: String,
    @ColumnInfo(name = "first_Name") @NotNull val firstName: String,
    @ColumnInfo(name = "last_Name") @NotNull val lastName: String
  //@ColumnInfo(name = "last_Name") val lastName: String? = null
) {
    companion object {
        const val TABLE_NAME = "author"
    }

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "author_id") var authorId: Int = 0
}