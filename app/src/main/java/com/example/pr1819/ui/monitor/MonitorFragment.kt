package com.example.pr1819.ui.monitor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pr1819.databinding.FragmentXlebBinding

class MonitorFragment : Fragment() {
    private var _binding: FragmentXlebBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val monitorViewModel =
            ViewModelProvider(this).get(MonitorViewModel::class.java)

        _binding = FragmentXlebBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textview
        monitorViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}