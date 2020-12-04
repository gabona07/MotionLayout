package com.example.animtest

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.transition.TransitionInflater
import com.google.android.material.transition.MaterialContainerTransform


class FragmentTwo : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val enterTransition = MaterialContainerTransform().apply {
            drawingViewId = R.id.nav_host_fragment_container
            scrimColor = Color.TRANSPARENT
        }
        sharedElementEnterTransition = enterTransition
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

}