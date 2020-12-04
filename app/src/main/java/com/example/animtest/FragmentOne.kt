package com.example.animtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.google.android.material.transition.Hold
import com.google.android.material.transition.MaterialElevationScale

class FragmentOne : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        val button = view.findViewById<Button>(R.id.button)
        val image = view.findViewById<ImageView>(R.id.imageView1)
        button.setOnClickListener {
            val exitTransition = Hold()
            setExitTransition(exitTransition)

            val reenterTransition = Hold()
            setReenterTransition(reenterTransition)

            val extras = FragmentNavigatorExtras(image to "image_transition_two")
            findNavController().navigate(R.id.transition_to_second_fragment, null, null, extras)


        }
        return view
    }


}