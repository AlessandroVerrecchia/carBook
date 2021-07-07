package com.alessandro.carbook.dataBase.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RouteEntity(
    @PrimaryKey val id: Int,
    val title: String?,
    val date: String?
)
