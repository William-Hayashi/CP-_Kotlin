package com.example.cp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class FirstFragment : Fragment() {


    private lateinit var btnEnviarTarefa: Button
    private lateinit var textNome: EditText
    private lateinit var textTarefa: EditText
    private lateinit var spinnerPrioridade: Spinner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)


        btnEnviarTarefa = view.findViewById(R.id.btnEnviarTarefa)
        textNome = view.findViewById(R.id.textNome)
        textTarefa = view.findViewById(R.id.textTarefa)
        spinnerPrioridade = view.findViewById(R.id.spinnerPrioridade)


        val prioridade = listOf("Prioridade - Priority", "1", "2", "3", "4", "5")
        spinnerPrioridade.adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_dropdown_item,
            prioridade
        )

        val secondFragment = SecondFragment()

        btnEnviarTarefa.setOnClickListener {
            val bundle = Bundle()
            val escolha = spinnerPrioridade.selectedItem.toString()

            bundle.putString("text", textNome.text.toString())
            bundle.putString("task", textTarefa.text.toString())
            bundle.putString("priority", escolha)

            secondFragment.arguments = bundle

            parentFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, secondFragment)
                commit()
            }
        }

        return view
    }
}
