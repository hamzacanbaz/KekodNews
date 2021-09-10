package com.canbazdev.kekodnews.view

import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.Briefing
import com.canbazdev.kekodnews.FifthNews
import com.canbazdev.kekodnews.R
import com.canbazdev.kekodnews.databinding.FragmentFifthBinding
import com.canbazdev.kekodnews.databinding.FragmentFirstBinding


class FifthFragment : Fragment() {
    private var _binding: FragmentFifthBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFifthBinding.inflate(layoutInflater, container, false)
//        val profileImage = ResourcesCompat.getDrawable(resources, R.drawable.use2r, null)
//        val icon = BitmapFactory.decodeResource(
//            requireContext().resources,
//            com.canbazdev.kekodnews.R.drawable.taxi
//        )
//
//        binding.fifthNews = FifthNews("8 mins read", "Jun 10, 2021", icon, "Canadian teen Leylah Fernandez's long shot")
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = FifthFragment()
    }
}