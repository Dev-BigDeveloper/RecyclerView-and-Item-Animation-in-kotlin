package com.example.recyclerviewall.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerviewall.adapter.UserAdapter
import com.example.recyclerviewall.databinding.FragmentAlfaAnimationBinding
import com.example.recyclerviewall.models.User

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class AlfaAnimationFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    private lateinit var binding:FragmentAlfaAnimationBinding
    private lateinit var adapter: UserAdapter

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlfaAnimationBinding.inflate(inflater,container,false)

        val bool: String? = arguments!!.getString("anim")

        var list = ArrayList<User>()
        for(i in 0..30){
            list.add(User("user $i","1452126784$i "))
        }
        adapter = UserAdapter(list,bool)
        binding.rv.adapter = adapter
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AlfaAnimationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}