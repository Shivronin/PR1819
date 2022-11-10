package com.example.pr1819.ui.blin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pr1819.databinding.FragmentBlinBinding


class BlinFragment: Fragment() {
    private var _binding: FragmentBlinBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val caseViewModel =
            ViewModelProvider(this).get(BlinViewModel::class.java)

        _binding = FragmentBlinBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textview
        caseViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}