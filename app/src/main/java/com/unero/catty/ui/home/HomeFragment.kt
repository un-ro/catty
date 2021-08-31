package com.unero.catty.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.unero.catty.adapter.CatAdapter
import com.unero.catty.data.ObjectGenerator
import com.unero.catty.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding =  FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = ObjectGenerator.catList
        val rv = binding.rvCats
        rv.adapter = CatAdapter(list)
        rv.setHasFixedSize(true)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}