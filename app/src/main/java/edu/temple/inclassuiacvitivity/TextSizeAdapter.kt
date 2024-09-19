package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val resource: Int, private val sizes: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return sizes.size
    }

    override fun getItem(position: Int): Any {
        return  sizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.textSize = getItem(position) as Float

        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = getView(position, convertView, parent)
        (view as TextView).textSize = sizes[position].toFloat()

        return view
    }
}