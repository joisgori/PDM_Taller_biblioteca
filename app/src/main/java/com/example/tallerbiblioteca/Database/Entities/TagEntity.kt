package com.example.tallerbiblioteca.Database.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = TagEntity.TABLE_NAME)
data class TagEntity(
    @ColumnInfo(name = "tag_Text") @NotNull val tagText: String
){
    companion object {
        const val TABLE_NAME = "tag"
    }

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "tag_id") var tagId: Int = 0
}