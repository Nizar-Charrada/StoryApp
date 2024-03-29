package com.example.storieapp.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.storieapp.databinding.FragmentStoriesListDetailsBinding


class storiesListDetailsFragment : Fragment() {

    private var _binding: FragmentStoriesListDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =  FragmentStoriesListDetailsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}