package com.canbazdev.kekodnews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.R
import com.canbazdev.kekodnews.databinding.FragmentFirstBinding
import com.canbazdev.kekodnews.model.Briefing


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_first, container, false)
        binding.briefingInfo = Briefing("Hamza's Briefing", "3 unread articles", R.drawable.use2r)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}