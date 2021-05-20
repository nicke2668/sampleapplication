package com.example.myapplication.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.MainFragmentBinding
import com.example.myapplication.model.DashboardModel
import com.example.myapplication.viewmodel.NameGameViewModel


class MainFragment : Fragment(), ImageSelectionCallback {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: NameGameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: MainFragmentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.main_fragment, container, false
        )

        binding.setVariable(BR.model, getModel())
        return binding.root
    }

    private fun getModel(): DashboardModel {
        viewModel.model
    }

    override fun onResume() {
        super.onResume()
        viewModel.onPageLoaded()
    }

    override fun onImageSelected() {
        viewModel.onImageSelected()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NameGameViewModel::class.java)
        // TODO: Use the ViewModel
    }

}