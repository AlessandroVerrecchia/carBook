package com.alessandro.carbook.dataBase.service

import com.alessandro.carbook.dataBase.entity.RouteEntity

interface IDataBaseService {
    fun build()
    fun addRoute(route: RouteEntity)
    fun deleteRoute(route: RouteEntity)
    fun editRoute(route: RouteEntity)
    fun getRoutes(): List<RouteEntity>
}