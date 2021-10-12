package com.agiledeveloper.airports

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.airport_info.view.*

class AirportAdapter : RecyclerView.Adapter<AirportViewHolder>() {

  private val airports = mutableListOf<Airport>()

  override fun getItemCount() = airports.size + 1

  override fun onCreateViewHolder(
    parent: ViewGroup, position: Int): AirportViewHolder {
      
    val view = LayoutInflater.from(parent.context)
      .inflate(R.layout.airport_info, parent, false)

    return AirportViewHolder(view)
  }

  override fun onBindViewHolder(viewHolder: AirportViewHolder, position: Int) {
    if (position > 0) viewHolder.bind(airports[position - 1])
  }

  fun updateAirportsStatus(updatedAirports: List<Airport>) {
    airports.apply {
      clear()
      addAll(updatedAirports)
    }

    notifyDataSetChanged()
  }

}


class AirportViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  fun bind(airport: Airport) {
    val (code, name, delay, weather) = airport
    val clock = if (delay) "\uD83D\uDD52" else ""

    itemView.apply {
      airportCode.text = code
      airportName.text = name
      airportTemperature.text = weather.temperature.firstOrNull()
      airportDelay.text = clock
    }
  }
}
