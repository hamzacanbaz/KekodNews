package com.canbazdev.kekodnews.view

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.Briefing
import com.canbazdev.kekodnews.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
//        val profileImage = ResourcesCompat.getDrawable(resources, R.drawable.use2r, null)
        val icon = BitmapFactory.decodeResource(
            requireContext().resources,
            com.canbazdev.kekodnews.R.drawable.use2r
        )

        binding.briefingInfo = Briefing("Hamza's Briefing", "3 unread articles", icon)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}