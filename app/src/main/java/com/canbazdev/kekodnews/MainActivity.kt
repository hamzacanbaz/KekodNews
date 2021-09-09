package com.canbazdev.kekodnews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.canbazdev.kekodnews.databinding.ActivityMainBinding
import com.canbazdev.kekodnews.view.*

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var firstFragment: FirstFragment
    private lateinit var secondFragment: SecondFragment
    private lateinit var secondFragment2: SecondFragment
    private lateinit var secondFragment3: SecondFragment
    private lateinit var secondFragment4: SecondFragment
    private lateinit var thirdFragment: ThirdFragment
    private lateinit var fourthFragment: FourthFragment
    private lateinit var fourthFragment2: FourthFragment
    private lateinit var fourthFragment3: FourthFragment
    private lateinit var fourthFragment4: FourthFragment
    private lateinit var fifthFragment: FifthFragment
    private lateinit var fifthFragment2: FifthFragment
    private lateinit var fifthFragment3: FifthFragment
    private lateinit var fifthFragment4: FifthFragment
    private lateinit var fifthFragment5: FifthFragment
    private lateinit var detailFragment: ThirdFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.mainActivity=this

        firstFragment = FirstFragment.newInstance()
        secondFragment = SecondFragment.newInstance()
        secondFragment2 = SecondFragment.newInstance()
        secondFragment3 = SecondFragment.newInstance()
        secondFragment4 = SecondFragment.newInstance()
        thirdFragment = ThirdFragment.newInstance()
        fourthFragment = FourthFragment.newInstance()
        fourthFragment2 = FourthFragment.newInstance()
        fourthFragment3 = FourthFragment.newInstance()
        fourthFragment4 = FourthFragment.newInstance()
        fifthFragment = FifthFragment.newInstance()
        fifthFragment2 = FifthFragment.newInstance()
        fifthFragment3 = FifthFragment.newInstance()
        fifthFragment4 = FifthFragment.newInstance()
        fifthFragment5 = FifthFragment.newInstance()
        detailFragment = ThirdFragment.newInstance()

        addAllFragments()

//        binding.firstFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//
//        }
//        binding.secondFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//
//        }
//        binding.secondFrameLayout2.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//
//        }
//        binding.secondFrameLayout3.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//
//        }
//        binding.thirdFrameLayout1.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.thirdFrameLayout2.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.thirdFrameLayout3.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.thirdFrameLayout4.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.fourthFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.fifthFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.firstFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.sixthFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.seventhFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.eighthFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }
//        binding.ninthFrameLayout.setOnClickListener {
//            removeAllFragmentsAndAddDetailFragment()
//        }


        // + TODO("Backstack")
        // + TODO("Details Design")
        // + TODO("Ana menü fazla fragment ekle")
        // + TODO("Font tipleri ekle")
        // + TODO("Geçişler arası animasyonlar ekle")
        // + TODO("Detaildan gelirken fragmentları ekle")
        //  TODO("Data Binding")


    }

    fun onClickNews(){
        removeAllFragmentsAndAddDetailFragment()

    }

    private fun addAllFragments() {

        val ft = supportFragmentManager
        val transaction = ft.beginTransaction()

        transaction.add(binding.firstFrameLayout.id, firstFragment)
        transaction.add(binding.secondFrameLayout.id, secondFragment)
        transaction.add(binding.secondFrameLayout2.id, secondFragment3)
        transaction.add(binding.secondFrameLayout3.id, secondFragment4)
        transaction.add(binding.thirdFrameLayout1.id, fourthFragment4)
        transaction.add(binding.thirdFrameLayout2.id, fourthFragment)
        transaction.add(binding.thirdFrameLayout3.id, fourthFragment3)
        transaction.add(binding.thirdFrameLayout4.id, fourthFragment2)
//        transaction.add(binding.fourthFrameLayout.id, secondFragment2)
        transaction.add(binding.fifthFrameLayout.id, fifthFragment)
        transaction.add(binding.sixthFrameLayout.id, fifthFragment2)
        transaction.add(binding.seventhFrameLayout.id, fifthFragment3)
        transaction.add(binding.eighthFrameLayout.id, fifthFragment4)
        transaction.add(binding.ninthFrameLayout.id, fifthFragment5)
//        transaction.addToBackStack(null)
        transaction.commit()


    }

    private fun removeAllFragmentsAndAddDetailFragment() {

        val frag = supportFragmentManager
        val tr = frag.beginTransaction()
        tr.setCustomAnimations(
            R.anim.exit_from_right,
            R.anim.exit_to_right,
            R.anim.exit_from_right,
            R.anim.exit_to_right
        )

        tr.replace(binding.fullScreenFrameLayout.id, thirdFragment)
        tr.remove(firstFragment)
        tr.remove(secondFragment)
        tr.remove(secondFragment3)
        tr.remove(secondFragment4)
        tr.remove(fourthFragment)
        tr.remove(fourthFragment2)
        tr.remove(fourthFragment3)
        tr.remove(fourthFragment4)
//        tr.remove(secondFragment2)
        tr.remove(fifthFragment)
        tr.remove(fifthFragment2)
        tr.remove(fifthFragment3)
        tr.remove(fifthFragment4)
        tr.remove(fifthFragment5)
        tr.addToBackStack(null)
        tr.commit()
    }

//    private fun addDetailFragment() {
//        ft.beginTransaction()
//            .replace(binding.fullScreenFrameLayout.id, thirdFragment).addToBackStack(null)
//            .commit()
//
//
//    }


}