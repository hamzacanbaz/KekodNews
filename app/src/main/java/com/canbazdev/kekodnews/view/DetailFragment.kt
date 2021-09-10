package com.canbazdev.kekodnews.view

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.databinding.FragmentDetailBinding


class ThirdFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
//        return inflater.inflate(R.layout.fragment_detail, container, false)
        val icon = BitmapFactory.decodeResource(
            requireContext().resources,
            com.canbazdev.kekodnews.R.drawable.taxi
        )
        binding.title="Denmark tells some migrants to work for benefits"
        binding.image = icon
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = ThirdFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}