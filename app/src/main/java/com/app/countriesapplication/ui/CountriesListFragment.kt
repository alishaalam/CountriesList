package com.app.countriesapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.app.countriesapplication.databinding.FragmentListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CountriesListFragment : Fragment() {

    private val viewModel by viewModels<CountriesListViewModel>()
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        val countryListAdapter = CountryListAdapter()
        binding.countriesList.adapter = countryListAdapter

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getCountriesList().observe(viewLifecycleOwner) {
                countryListAdapter.submitData(lifecycle, it)
            }
        }

        return binding.root
    }
}