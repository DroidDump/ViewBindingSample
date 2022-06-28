package com.example.viewbindingsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewbindingsample.databinding.FragmentBlankBinding


class InflateFragment : Fragment() {

    private var fragmentBlankBinding: FragmentBlankBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentBlankBinding.inflate(inflater, container, false)
        fragmentBlankBinding = binding
        binding.textViewFragment.text = getString(R.string.hello_from_vb_inflatefragment)
        return binding.root
    }

    override fun onDestroyView() {
        fragmentBlankBinding = null
        super.onDestroyView()
    }
}
