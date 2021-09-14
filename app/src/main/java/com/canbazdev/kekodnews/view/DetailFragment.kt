package com.canbazdev.kekodnews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.R
import com.canbazdev.kekodnews.databinding.FragmentDetailBinding


class ThirdFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        binding.title="Denmark tells some migrants to work for benefits"
        binding.image = R.drawable.taxi
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