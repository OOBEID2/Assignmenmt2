package com.example.vehicleapp

import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import android.widget.*


class CustomDialogFragment: DialogFragment(R.layout.fragment_custom_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt: Button = view.findViewById(R.id.cancelBT);
        val submitbt: Button = view.findViewById(R.id.submitBT);
        val radioGroup = view.findViewById<RadioGroup>(R.id.RatingRadioGroup)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener{
            val selectOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectOption)
            Toast.makeText(context, radioButton.text,Toast.LENGTH_SHORT).show()
            val m1: MainActivity = getActivity() as MainActivity;
            m1.receiveFeedback(radioButton.text.toString())
            dismiss()
        }
    }
}