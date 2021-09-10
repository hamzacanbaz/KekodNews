package com.canbazdev.kekodnews.view

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.SecondNews
import com.canbazdev.kekodnews.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(layoutInflater, container, false)

//        val icon = BitmapFactory.decodeResource(
//            requireContext().resources,
//            com.canbazdev.kekodnews.R.drawable.taxi
//        )
//        binding.secondNews = SecondNews(
//            "Hamza Canbaz",
//            "5 hours ago",
//            icon,
//            "Denmark tells some migrants to work for benefits Lebanon gets new government amid deepening crisis"
//        )

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}