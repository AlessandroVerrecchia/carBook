package com.alessandro.carbook.dataBase.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.alessandro.carbook.dataBase.entity.RouteEntity

@Dao
interface RouteDao {
    @Query("SELECT * FROM RouteEntity")
    fun getAll(): List<RouteEntity>

    @Insert
    fun insertAll(vararg routes: RouteEntity)

    @Delete
    fun delete(route: RouteEntity)
}