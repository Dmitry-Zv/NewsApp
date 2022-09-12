package by.zharikov.newsapp.ui.detailed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.zharikov.newsapp.R
import by.zharikov.newsapp.databinding.FragmentDetailedBinding


class DetailedFragment : Fragment() {

    private var _binding : FragmentDetailedBinding? = null
    private val mBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailedBinding.inflate(inflater, container, false)
        return mBinding.root
    }


}