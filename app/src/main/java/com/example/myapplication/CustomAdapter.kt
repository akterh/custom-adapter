package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.util.ArrayList

class CustomAdapter( var arrayList: ArrayList<Data>) : BaseAdapter(){
    override fun getCount() = arrayList.size

    override fun getItem(position: Int) = arrayList [position]

    override fun getItemId(position: Int)= position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val context = parent?.context
        val inflater : LayoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                as LayoutInflater
        val rowView :View = inflater.inflate(R.layout.item_list,parent,false)
        val numberTextView :TextView = rowView.findViewById(R.id.number_text_view)
        numberTextView.text = arrayList[position].Number

        return  rowView
    }
}