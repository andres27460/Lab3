package com.example.laboratorio_3_entregar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.buttonnavigation.R
import com.example.buttonnavigation.databinding.FragmentMapConductorBinding
import com.google.android.material.bottomnavigation.BottomNavigationView



class Map_Conductor_Fragment : Fragment() {

    private lateinit var Map_Conductor_FragmentBinding: FragmentMapConductorBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        Map_Conductor_FragmentBinding = FragmentMapConductorBinding.inflate(inflater,container,false)
        Map_Conductor_FragmentBinding.button2.setOnClickListener(){
            findNavController().navigate(R.id.action_map_Conductor_Fragment_to_conductor_fragment)
        }
        return Map_Conductor_FragmentBinding.root
    }



}