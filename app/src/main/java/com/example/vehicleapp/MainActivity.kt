package com.example.vehicleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.*

import android.view.MenuInflater as MenuInflater1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingTV: TextView = findViewById(R.id.TVrating)
        ratingTV.setOnClickListener{
            var dialog_var=CustomDialogFragment()
            dialog_var.show(supportFragmentManager,"Custom Dialog")
        }

        val spinner:Spinner = findViewById(R.id.spSelect)
        val spinnerVal: Spinner = findViewById(R.id.spSelect)
        var model = arrayOf("Mercedes E200", "Mercedes E300", "Mercedes C200", "Mercedes C-Class", "Mercedes S-Class",
        "BMW X3", "BMW X4", "BMW X5", "BMW X6", "BMW Z4",
        "Toyota Prius", "Toyota Yaris", "Toyota Corolla", "Toyota Camry", "Toyota C-HR",
        "Kia Optima", "Kia K5", "Kia K3", "Kia Rio", "Kia Cerato",
        "Lexus IS", "Lexus RX", "Lexus RC", "Lexus GX", "Lexus CT")
        spinnerVal.adapter=ArrayAdapter(this, android.R.layout.simple_list_item_1, model)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.vehicle_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.spSelect-> Toast.makeText(this,"You picked your car type. Please continue...",Toast.LENGTH_SHORT).show()
            R.id.subitemT1-> Toast.makeText(this, "Transmission - Made in: Germany",Toast.LENGTH_SHORT).show()
            R.id.subitemT2-> Toast.makeText(this, "Transmission - Made in: China",Toast.LENGTH_SHORT).show()
            R.id.subitemT3-> Toast.makeText(this, "Transmission - Made in: USA",Toast.LENGTH_SHORT).show()
            R.id.subitemT4-> Toast.makeText(this, "Transmission - Made in: Japan",Toast.LENGTH_SHORT).show()
            R.id.subitemB1-> Toast.makeText(this, "Battery - Made in: Germany",Toast.LENGTH_SHORT).show()
            R.id.subitemB2-> Toast.makeText(this, "Battery - Made in: China",Toast.LENGTH_SHORT).show()
            R.id.subitemB3-> Toast.makeText(this, "Battery - Made in: USA",Toast.LENGTH_SHORT).show()
            R.id.subitemB4-> Toast.makeText(this, "Battery - Made in: Japan",Toast.LENGTH_SHORT).show()
            R.id.subitemR1-> Toast.makeText(this, "Radiator - Made in: Germany",Toast.LENGTH_SHORT).show()
            R.id.subitemR2-> Toast.makeText(this, "Radiator - Made in: China",Toast.LENGTH_SHORT).show()
            R.id.subitemR3-> Toast.makeText(this, "Radiator - Made in: USA",Toast.LENGTH_SHORT).show()
            R.id.subitemR4-> Toast.makeText(this, "Radiator - Made in: Japan",Toast.LENGTH_SHORT).show()
            R.id.subitemF1-> Toast.makeText(this, "Front Axle - Made in: Germany",Toast.LENGTH_SHORT).show()
            R.id.subitemF2-> Toast.makeText(this, "Front Axle - Made in: China",Toast.LENGTH_SHORT).show()
            R.id.subitemF3-> Toast.makeText(this, "Front Axle - Made in: USA",Toast.LENGTH_SHORT).show()
            R.id.subitemF4-> Toast.makeText(this, "Front Axle - Made in: Japan",Toast.LENGTH_SHORT).show()
            R.id.subitemBR1-> Toast.makeText(this, "Brakes - Made in: Germany",Toast.LENGTH_SHORT).show()
            R.id.subitemBR2-> Toast.makeText(this, "Brakes - Made in: China",Toast.LENGTH_SHORT).show()
            R.id.subitemBR3-> Toast.makeText(this, "Brakes - Made in: USA",Toast.LENGTH_SHORT).show()
            R.id.subitemBR4-> Toast.makeText(this, "Brakes - Made in: Japan",Toast.LENGTH_SHORT).show()
        }
        return true;
    }

    fun receiveFeedback(feedback: String) {
        val ratingTV: TextView = findViewById(R.id.TVrating)
        ratingTV.text=feedback;
        val tSubmit: TextView = findViewById(R.id.txtSubmit)
        tSubmit.text = "Thank you! Your order has been Submitted"
    }
}
