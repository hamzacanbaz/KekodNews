package com.canbazdev.kekodnews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.R
import com.canbazdev.kekodnews.databinding.FragmentFifthBinding
import com.canbazdev.kekodnews.model.FifthNews


class FifthFragment : Fragment() {
    private var _binding: FragmentFifthBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_fifth,container,false)
        binding.fifthNews = FifthNews("8 mins read", "Jun 10, 2021", R.drawable.ren, "Canadian teen Leylah Fernandez's long shot")
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = FifthFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}