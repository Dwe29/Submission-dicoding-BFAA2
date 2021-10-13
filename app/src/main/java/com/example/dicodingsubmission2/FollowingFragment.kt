package com.example.dicodingsubmission2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dicodingsubmission2.R
import com.example.dicodingsubmission2.adapter.UserAdapter
import com.example.dicodingsubmission2.data.User
import com.example.dicodingsubmission2.databinding.FragmentFollowingBinding

class FollowingFragment : Fragment() {
    private var list: ArrayList<User> = arrayListOf()
    private lateinit var binding: FragmentFollowingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFollowingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvFollowing.layoutManager = LinearLayoutManager(activity)
        val adapter = UserAdapter(list)
        binding.rvFollowing.adapter = adapter
    }
}