package com.vas.week3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.vas.week3.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        activity?.window?.statusBarColor = ResourcesCompat.getColor(resources,
            R.color.yandex, null)

        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.buttonYandex1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_yandexFragment1)
        }
        binding.buttonYandex2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_yandexFragment2)
        }
        binding.buttonTelegram1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_telegramFragment1)
        }
        binding.buttonTelegram2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_telegramFragment2)
        }
        binding.buttonCalculator1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_calculatorFragment1)
        }
        binding.buttonCalculator2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_calculatorFragment2)
        }
        binding.buttonFacebook1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_facebookFragment1)
        }
        binding.buttonFacebook2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_facebookFragment2)
        }

        return binding.root
    }

}