package com.vas.week3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat

class FacebookFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activity?.window?.statusBarColor = ResourcesCompat.getColor(resources,
            R.color.facebook, null)

        return inflater.inflate(R.layout.fragment_facebook2, container, false)
    }

}