package com.eremenko.splashscreen3

import android.content.Intent
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val stations: Array<bikeStation>): RecyclerView.Adapter<CustomViewHolder>() {

    var checkBoxStateArray = SparseBooleanArray()

    override fun getItemCount(): Int {
        return stations.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.recycler_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val bikestation = stations.get(position)
        holder?.view?.address?.text = bikestation.address

        holder?.view?.countryName?.text = bikestation.contract_name

        holder?.bikestation = bikestation

        holder.checkbox.isChecked = checkBoxStateArray.get(position, false)

    }
}

class CustomViewHolder(val view: View, var bikestation: bikeStation? = null): RecyclerView.ViewHolder(view) {

    var checkBoxStateArray = SparseBooleanArray()
    val checkbox = itemView.checkBox

    companion object {
        val CITY_KEY = "CITY"
        val ADDRESS_KEY = "ADDRESS"
        val POSITION_KEY = "POSITION"
        val ABIKESTAND = "AVAILABLE_BIKE_STNADS"
        val ABIKE = "AVAILABLE_BIKES"
    }

    init {
        view.setOnClickListener {

            val intent = Intent(view.context, StationDetail::class.java)

            intent.putExtra(CITY_KEY, bikestation?.contract_name)
            intent.putExtra(ADDRESS_KEY, bikestation?.address)
            intent.putExtra(ABIKESTAND, bikestation?.available_bike_stands)
            intent.putExtra(ABIKE, bikestation?.available_bikes)

            view.context.startActivity(intent)
        }

        checkbox.setOnClickListener{
            if(!checkBoxStateArray.get(adapterPosition, false)) {
                checkbox.isChecked = true
                checkBoxStateArray.put(adapterPosition, true)
            }
            else {
                checkbox.isChecked = false
                checkBoxStateArray.put(adapterPosition, false)
            }
        }
    }

}
