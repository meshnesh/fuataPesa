package com.example.fuatapesa.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fuatapesa.R
import com.example.fuatapesa.model.SMS

class SMSAdapter : ListAdapter<SMS, SMSAdapter.SMSViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SMSViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_sms, parent, false)
        return SMSViewHolder(view)
    }

    override fun onBindViewHolder(holder: SMSViewHolder, position: Int) {
        val sms = getItem(position)
        holder.bind(sms)
    }

    class SMSViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.textView)

        fun bind(sms: SMS) {
            textView.text = "${sms.sender}: ${sms.body}"
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<SMS>() {
        override fun areItemsTheSame(oldItem: SMS, newItem: SMS): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: SMS, newItem: SMS): Boolean {
            return oldItem == newItem
        }
    }
}