package com.example.viewbindingsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.viewbindingsample.databinding.FragmentBlankBinding


class BindFragment : Fragment(R.layout.fragment_blank) {

    private var fragmentBlankBinding: FragmentBlankBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentBlankBinding.bind(view)
        fragmentBlankBinding = binding
        binding.textViewFragment.text = getString(R.string.hello_from_vb_bindfragment)
    }

    override fun onDestroyView() {
        fragmentBlankBinding = null
        super.onDestroyView()
    }
}
