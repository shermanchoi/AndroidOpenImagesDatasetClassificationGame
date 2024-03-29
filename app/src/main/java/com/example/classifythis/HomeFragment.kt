package com.example.classifythis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.homeButtonStat).setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_StatisticsFragment)
        }

        view.findViewById<Button>(R.id.homeButtonPlay).setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_QuizFragment)
        }
    }
}