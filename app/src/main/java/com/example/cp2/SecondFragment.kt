package com.example.cp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        val view = inflater.inflate(R.layout.fragment_second, container, false)


        val nomeUser: TextView = view.findViewById<TextView>(R.id.NomeUser)
        val TaskUser:TextView = view.findViewById(R.id.TaskUser)
        val PriorityUser: TextView = view.findViewById<TextView>(R.id.Priority)

        val data = arguments
        nomeUser.text = data?.getString("text")
        TaskUser.text = data?.getString("task")
        PriorityUser.text = data?.getString("priority")



        return view
    }
}
