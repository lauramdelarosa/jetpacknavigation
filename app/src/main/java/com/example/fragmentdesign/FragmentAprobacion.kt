package com.example.fragmentdesign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.aprobacion_fragment.*

class FragmentAprobacion : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.aprobacion_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        aprobacionRegresar.setOnClickListener {
            if (findNavController().currentDestination?.id == CURRENT_DESTINATION) {
                findNavController().navigate(R.id.fragmentAprobacion_to_fragmentIngresos)
            }
        }

    }

    companion object {
        const val CURRENT_DESTINATION = R.id.fragmentAprobacion

    }
}