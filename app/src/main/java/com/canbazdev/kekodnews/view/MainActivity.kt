package com.canbazdev.kekodnews.view

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.R
import com.canbazdev.kekodnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var firstFragment: FirstFragment
    private lateinit var secondFragment: SecondFragment
    private lateinit var secondFragment2: SecondFragment
    private lateinit var thirdFragment: SecondFragment
    private lateinit var fourthFragment: SecondFragment
    private lateinit var detailFragment: ThirdFragment
    private lateinit var fifthFragment: FourthFragment
    private lateinit var sixthFragment: FourthFragment
    private lateinit var seventhFragment: FourthFragment
    private lateinit var eighthFragment: FourthFragment
    private lateinit var ninthFragment: FifthFragment
    private lateinit var tenthFragment: FifthFragment
    private lateinit var eleventhFragment: FifthFragment
    private lateinit var twelfthFragment: FifthFragment
    private lateinit var thirteenthFragment: FifthFragment
    private lateinit var fragmentList: ArrayList<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.mainActivity = this

        firstFragment = FirstFragment.newInstance()
        secondFragment = SecondFragment.newInstance()
        secondFragment2 = SecondFragment.newInstance()
        thirdFragment = SecondFragment.newInstance()
        fourthFragment = SecondFragment.newInstance()
        detailFragment = ThirdFragment.newInstance()
        fifthFragment = FourthFragment.newInstance()
        sixthFragment = FourthFragment.newInstance()
        seventhFragment = FourthFragment.newInstance()
        eighthFragment = FourthFragment.newInstance()
        ninthFragment = FifthFragment.newInstance()
        tenthFragment = FifthFragment.newInstance()
        eleventhFragment = FifthFragment.newInstance()
        twelfthFragment = FifthFragment.newInstance()
        thirteenthFragment = FifthFragment.newInstance()


        fragmentList =
            arrayListOf(
                firstFragment,
                secondFragment,
                thirdFragment,
                fourthFragment,
                fifthFragment,
                sixthFragment,
                seventhFragment,
                eighthFragment,
                ninthFragment,
                tenthFragment,
                eleventhFragment,
                twelfthFragment,
                thirteenthFragment
            )

        addAllFragments()


    }

    fun onClickFragment(view: FrameLayout) {
        println(binding.firstFrameLayout.id)
        when (view.id) {
            binding.firstFrameLayout.id -> {
                fragmentList.remove(firstFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.firstFrameLayout,
                    firstFragment
                )
            }
            binding.secondFrameLayout.id -> {
                fragmentList.remove(secondFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.secondFrameLayout,
                    secondFragment
                )
            }
            binding.thirdFrameLayout.id -> {
                fragmentList.remove(thirdFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.thirdFrameLayout,
                    thirdFragment
                )
            }
            binding.fourthFrameLayout.id -> {
                fragmentList.remove(fourthFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.fourthFrameLayout,
                    fourthFragment
                )
            }
            binding.fifthFrameLayout.id -> {
                fragmentList.remove(fifthFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.fifthFrameLayout,
                    fifthFragment
                )
            }
            binding.sixthFrameLayout.id -> {
                fragmentList.remove(sixthFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.sixthFrameLayout,
                    sixthFragment
                )
            }
            binding.seventhFrameLayout.id -> {
                fragmentList.remove(seventhFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.seventhFrameLayout,
                    seventhFragment
                )
            }
            binding.eighthFrameLayout.id -> {
                fragmentList.remove(eighthFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.eighthFrameLayout,
                    eighthFragment
                )
            }
            binding.ninthFrameLayout.id -> {
                fragmentList.remove(ninthFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.ninthFrameLayout,
                    ninthFragment
                )
            }
            binding.tenthFrameLayout.id -> {
                fragmentList.remove(tenthFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.tenthFrameLayout,
                    tenthFragment
                )
            }
            binding.eleventhFrameLayout.id -> {
                fragmentList.remove(eleventhFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.eleventhFrameLayout,
                    eleventhFragment
                )
            }
            binding.twelfthFrameLayout.id -> {
                fragmentList.remove(twelfthFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.twelfthFrameLayout,
                    twelfthFragment
                )
            }
            binding.thirteenthFrameLayout.id -> {
                fragmentList.remove(thirteenthFragment)
                removeAllFragmentsAndAddDetailFragment(
                    fragmentList,
                    binding.thirteenthFrameLayout,
                    thirteenthFragment
                )
            }
            else -> {
                println("ah")
            }
        }

    }

    private fun addAllFragments() {

        val ft = supportFragmentManager
        val transaction = ft.beginTransaction()

        transaction.add(binding.firstFrameLayout.id, firstFragment)
        transaction.add(binding.secondFrameLayout.id, secondFragment)
        transaction.add(binding.thirdFrameLayout.id, thirdFragment)
        transaction.add(binding.fourthFrameLayout.id, fourthFragment)
        transaction.add(binding.fifthFrameLayout.id, fifthFragment)
        transaction.add(binding.sixthFrameLayout.id, sixthFragment)
        transaction.add(binding.seventhFrameLayout.id, seventhFragment)
        transaction.add(binding.eighthFrameLayout.id, eighthFragment)
        transaction.add(binding.ninthFrameLayout.id, ninthFragment)
        transaction.add(binding.tenthFrameLayout.id, tenthFragment)
        transaction.add(binding.eleventhFrameLayout.id, eleventhFragment)
        transaction.add(binding.twelfthFrameLayout.id, twelfthFragment)
        transaction.add(binding.thirteenthFrameLayout.id, thirteenthFragment)
        transaction.addToBackStack(null)
        transaction.commit()


    }


    private fun removeAllFragmentsAndAddDetailFragment(
        fragmentList: ArrayList<Fragment>,
        layout: FrameLayout,
        fragmentRemoved: Fragment
    ) {

        val frag = supportFragmentManager
        val tr = frag.beginTransaction()
        tr.setCustomAnimations(
            R.anim.exit_from_right,
            R.anim.exit_to_right,
            R.anim.exit_from_right,
            R.anim.exit_to_right
        )

        tr.replace(layout.id, detailFragment)

        fragmentList.forEach { fragment ->
            tr.remove(fragment)
        }
        tr.addToBackStack(null)
        tr.commit()
        fragmentList.add(fragmentRemoved)
    }

}