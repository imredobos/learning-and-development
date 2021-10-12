package com.agiledeveloper.airports

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CoroutineScope {
  override val coroutineContext: CoroutineContext
    get() = Dispatchers.Main

  private val airportCodes = mutableListOf<String>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    addAirportCode.isEnabled = false

    airportCode.addTextChangedListener(object: TextWatcher {
      override fun afterTextChanged(s: Editable) {
        addAirportCode.isEnabled = airportCode.text.isNotBlank()
      }

      override fun beforeTextChanged(
        s: CharSequence, start: Int, count: Int, after: Int) { /* no-op */ }

      override fun onTextChanged(
        s: CharSequence, start: Int, before: Int, count: Int) { /* no-op */ }
    })

    addAirportCode.setOnClickListener {
      airportCodes.add(airportCode.text.toString())
      airportCode.setText("")

      launch {
        updateAirportStatus()
      }
    }

    airportStatus.apply {
      setHasFixedSize(true)
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = AirportAdapter()
    }

  }

  private suspend fun updateAirportStatus() {
    val airports = getAirportStatus(airportCodes)
    val airportAdapter = airportStatus.adapter as AirportAdapter
    airportAdapter.updateAirportsStatus(airports)
  }
}
