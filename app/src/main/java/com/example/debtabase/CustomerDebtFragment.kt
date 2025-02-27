package com.example.debtabase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.debtabase.databinding.FragmentCustomerDebtBinding


class CustomerDebtFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as AppCompatActivity).supportActionBar?.title = "Customer Debt"
        val binding = DataBindingUtil.inflate<FragmentCustomerDebtBinding>(
            inflater, R.layout.fragment_customer_debt, container, false
        )
        binding.btnUser.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_customerDebtFragment_to_customerInfoFragment)
        }
        return binding.root
    }


}