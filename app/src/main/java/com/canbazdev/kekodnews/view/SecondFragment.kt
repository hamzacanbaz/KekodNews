package com.canbazdev.kekodnews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.model.SecondNews
import com.canbazdev.kekodnews.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding =
            DataBindingUtil.inflate(layoutInflater, com.canbazdev.kekodnews.R.layout.fragment_second, container, false)

        binding.secondNews = SecondNews(
            "Hamza Canbaz",
            "5 hours ago",
            com.canbazdev.kekodnews.R.drawable.taxi,
            "Denmark tells some migrants to work for benefits Lebanon gets new government amid deepening crisis"
        )

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}