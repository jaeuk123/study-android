package com.example.study_android.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.study_android.R
import com.example.study_android.databinding.FragmentFirstBinding

class FirstFragment() : Fragment() {

    private var binding: FragmentFirstBinding? = null
    private val bind get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return bind.root
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}