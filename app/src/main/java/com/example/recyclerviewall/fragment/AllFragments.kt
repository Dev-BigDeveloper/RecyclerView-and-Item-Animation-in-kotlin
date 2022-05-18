package com.example.recyclerviewall.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.recyclerviewall.R
import com.example.recyclerviewall.databinding.FragmentAllFragmentsBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class AllFragments : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding:FragmentAllFragmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllFragmentsBinding.inflate(inflater,container,false)
        val bundle = Bundle()
        binding.apply {
            alfa.setOnClickListener {
                bundle.putSerializable("anim","alfa")
                findNavController().navigate(R.id.alfaAnimationFragment,bundle)
            }
            rotate.setOnClickListener {
                bundle.putSerializable("anim","rotate")
                findNavController().navigate(R.id.alfaAnimationFragment,bundle)
            }
            scale.setOnClickListener {
                bundle.putSerializable("anim","scale")
                findNavController().navigate(R.id.alfaAnimationFragment,bundle)
            }
            translate.setOnClickListener {
                bundle.putSerializable("anim","translate")
                findNavController().navigate(R.id.alfaAnimationFragment,bundle)
            }
            customer1.setOnClickListener {
                bundle.putSerializable("anim","customer1")
                findNavController().navigate(R.id.alfaAnimationFragment,bundle)
            }
            customer2.setOnClickListener {
                bundle.putSerializable("anim","customer2")
                findNavController().navigate(R.id.alfaAnimationFragment,bundle)
            }
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AllFragments().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}