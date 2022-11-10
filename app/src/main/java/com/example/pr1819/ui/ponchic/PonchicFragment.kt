package com.example.pr1819.ui.ponchic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pr1819.databinding.FragmentPonchicBinding

class PonchicFragment: Fragment() {
    private var _binding: FragmentPonchicBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val gpuViewModel =
            ViewModelProvider(this).get(PonchicViewModel::class.java)

        _binding = FragmentPonchicBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textview
        gpuViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}