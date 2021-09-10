package com.canbazdev.kekodnews

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.canbazdev.kekodnews.databinding.ActivityMainBinding
import com.canbazdev.kekodnews.view.*

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
//    private lateinit var detailFragment: ThirdFragment

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
//        detailFragment = ThirdFragment.newInstance()

        //Handle when activity is recreated like on orientation Change
//        shouldDisplayHomeUp()

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

    fun onClickNews() {
        fragmentList.remove(firstFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.firstFrameLayout,
            firstFragment
        )
    }

    fun onClickNews1() {
        fragmentList.remove(secondFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.secondFrameLayout,
            secondFragment
        )

    }

    fun onClickNews2() {
        fragmentList.remove(thirdFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.thirdFrameLayout,
            thirdFragment
        )

    }

    fun onClickNews3() {
        fragmentList.remove(fourthFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.fourthFrameLayout,
            fourthFragment
        )

    }

    fun onClickNews4() {
        fragmentList.remove(fifthFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.fifthFrameLayout,
            fifthFragment
        )
    }

    fun onClickNews5() {
        fragmentList.remove(sixthFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.sixthFrameLayout,
            sixthFragment
        )

    }

    fun onClickNews6() {
        fragmentList.remove(seventhFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.seventhFrameLayout,
            seventhFragment
        )

    }

    fun onClickNews7() {
        fragmentList.remove(eighthFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.eighthFrameLayout,
            eighthFragment
        )

    }

    fun onClickNews8() {
        fragmentList.remove(ninthFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.ninthFrameLayout,
            ninthFragment
        )

    }

    fun onClickNews9() {
        fragmentList.remove(tenthFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.tenthFrameLayout,
            tenthFragment
        )

    }

    fun onClickNews10() {
        fragmentList.remove(eleventhFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.eleventhFrameLayout,
            eleventhFragment
        )
    }

    fun onClickNews11() {
        fragmentList.remove(twelfthFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.twelfthFrameLayout,
            twelfthFragment
        )

    }

    fun onClickNews12() {
        fragmentList.remove(thirteenthFragment)
        removeAllFragmentsAndAddDetailFragment(
            fragmentList,
            binding.thirteenthFrameLayout,
            thirteenthFragment
        )
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
//        transaction.addToBackStack(null)
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