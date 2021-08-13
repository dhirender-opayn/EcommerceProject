package com.example.ecommerceproject.LoginSingup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.ecommerceproject.R
import kotlinx.android.synthetic.main.fragment_start.*


class StartFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        start_login_btn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_startFragment_to_loginFragment)
        }

        start_signup_btn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_startFragment_to_signUpFragment)
        }



    }




}