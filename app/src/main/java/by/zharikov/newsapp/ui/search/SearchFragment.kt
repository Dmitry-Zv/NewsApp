package by.zharikov.newsapp.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.zharikov.newsapp.R
import by.zharikov.newsapp.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {

    private var _binding : FragmentSearchBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return mBinding.root
    }
}