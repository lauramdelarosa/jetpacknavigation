package com.example.fragmentdesign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.basicos_fragment.*

class FragmentBasicos : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.basicos_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        ingresosContinuar.setOnClickListener {
            if (findNavController().currentDestination?.id == CURRENT_DESTINATION) {
                findNavController().navigate(R.id.fragmentBasicos_to_fragmentIngresos)
            }
        }

    }

    companion object {
        const val CURRENT_DESTINATION = R.id.fragmentBasicos

    }

}