package com.alessandro.carbook.dataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alessandro.carbook.dataBase.dao.RouteDao
import com.alessandro.carbook.dataBase.entity.RouteEntity

@Database(entities = [RouteEntity::class], version = 1)
abstract class RouteDataBase : RoomDatabase() {
    abstract fun routeDao(): RouteDao
}