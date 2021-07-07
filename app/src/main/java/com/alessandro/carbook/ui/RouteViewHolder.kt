package com.alessandro.carbook.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.route_item.view.*


class RouteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var title: TextView = itemView.routeTitleTextView
    var date: TextView = itemView.routeDateTextView
    var value: TextView = itemView.routeValueTextView
}