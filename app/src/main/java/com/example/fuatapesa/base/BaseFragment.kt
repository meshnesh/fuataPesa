package com.example.fuatapesa.base

import android.content.Intent
import android.os.Build
import android.provider.Settings
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.fuatapesa.R

abstract class BaseFragment : Fragment() {

//    fun requireCompatActivity(): AppCompatActivity {
//        requireActivity()
//        val activity = requireActivity()
//        if (activity is AppCompatActivity) {
//            return activity
//        } else {
//            throw TypeCastException("Main activity should extend from 'AppCompatActivity'")
//        }
//    }
//
//    open fun goBackToHome() {
//        val startDestination = findNavController().graph.startDestinationId
//        val navBuilder = NavOptions.Builder()
//        val navOptions = navBuilder.setPopUpTo(startDestination, true).build()
//        findNavController().navigate(startDestination, null, navOptions)
//    }
//
//    open fun goBackToJourneyHome() {
//        val startDestination = findNavController().previousBackStackEntry?.destination?.id!!
//        val navBuilder = NavOptions.Builder()
//        val navOptions = navBuilder.setPopUpTo(startDestination, true).build()
//        findNavController().navigate(startDestination, null, navOptions)
//    }

//    fun navigateBack(destinationId: Int) {
//        val host = requireActivity().findViewById<View>(R.id.nav_host_container)
//        /** Navigate the custoner when the host is not null */
//        if (host != null) {
//            Navigation.findNavController(host).popBackStack(destinationId, false)
//        }
//    }

//    fun openNetworkSettings() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//            val connectivityIntent = Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY)
//            startActivityForResult(connectivityIntent, 1000)
//        } else {
//            val connectivityIntent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//                Intent(Settings.ACTION_DATA_USAGE_SETTINGS)
//            } else {
//                Intent(Settings.ACTION_WIRELESS_SETTINGS)
//            }
//            startActivity(connectivityIntent)
//        }
//    }
//
//    fun openWifiSettings() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//            val wifiSettingsIntent = Intent(Settings.Panel.ACTION_WIFI)
//            startActivityForResult(wifiSettingsIntent, 1000)
//        } else {
//            val wifiSettingsIntent = Intent(Settings.ACTION_WIFI_SETTINGS)
//            startActivity(wifiSettingsIntent)
//        }
//    }
}