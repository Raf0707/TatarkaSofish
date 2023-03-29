package ru.tabiin.tatarkasofish.ui.tatarka_sofish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.tabiin.tatarkasofish.R
import ru.tabiin.tatarkasofish.databinding.FragmentQuranPlayerBinding


class QuranPlayerFragment : Fragment() {
    lateinit var binding: FragmentQuranPlayerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_quran_player, container, false)
    }

}