package com.example.fuatapesa.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fuatapesa.R
import com.example.fuatapesa.base.BaseFragment
import com.example.fuatapesa.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    lateinit var binding: FragmentHomeBinding
    private lateinit var smsViewModel: SMSViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SMSAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        recyclerView = binding.smsRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = SMSAdapter()
        recyclerView.adapter = adapter

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize ViewModel
        smsViewModel = ViewModelProvider(this)[SMSViewModel::class.java]

        // Observe changes in SMS list
        smsViewModel.smsList.observe(viewLifecycleOwner) { smsList ->
            // Update UI with new SMS list
            adapter.submitList(smsList)
        }

        // Load SMS from sender
        val contentResolver = requireContext().contentResolver
        val senderPhoneNumber = "KENYA POWER"
        smsViewModel.loadSMSFromSender(contentResolver, senderPhoneNumber)
    }
}
