package com.example.rateyourmensa.ui.newpage

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.rateyourmensa.R

class NewPage : Fragment() {

    companion object {
        fun newInstance() = NewPage()
    }

    private lateinit var viewModel: NewPageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_newpage, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NewPageViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
