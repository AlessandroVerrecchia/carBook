package com.alessandro.carbook.dataBase.service

import android.content.Context
import androidx.room.Room
import com.alessandro.carbook.dataBase.RouteDataBase

class DataBaseService(private val context: Context) : IDataBaseService {
    lateinit var db: RouteDataBase
    override fun build() {
        db = Room.databaseBuilder(
            context,
            RouteDataBase::class.java, "route-database"
        ).build()
    }

    override fun addRoute() {
        db.routeDao().insertAll()
    }

    override fun deleteRoute() {
        db.routeDao().delete()
    }

    override fun editRoute() {
        db.routeDao().insertAll()
    }

    override fun getRoutes() {
        db.routeDao().getAll()
    }
}