package com.example.pr1819.ui.sloika

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pr1819.databinding.FragmentSloikaBinding

class SloikaFragment: Fragment() {


    private var _binding: FragmentSloikaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ramViewModel =
            ViewModelProvider(this).get(SloikaViewModel::class.java)

        _binding = FragmentSloikaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textview
        ramViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}