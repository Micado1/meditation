package ru.example.mobilemdt.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import ru.example.mobilemdt.R
import ru.example.mobilemdt.databinding.FragmentHomeBinding
import ru.example.mobilemdt.recadapters.FeelRecycler
import ru.example.mobilemdt.recadapters.FeelState
import ru.example.mobilemdt.recadapters.MyFeel
import ru.example.mobilemdt.recadapters.MyState

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val feel_recycler : RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(), MyFeel().list)
        val feel_state : RecyclerView = root.findViewById(R.id.state_Rec)
        feel_state.adapter = FeelState(requireContext(), MyState().state_list)
        return root
    }
}