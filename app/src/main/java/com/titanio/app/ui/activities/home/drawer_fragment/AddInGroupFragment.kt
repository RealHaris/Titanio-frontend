package com.titanio.app.ui.activities.home.drawer_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.titanio.app.R
import com.titanio.app.databinding.FragmentAddInGroupBinding
import com.titanio.app.databinding.FragmentAddPostBinding
import com.titanio.app.ui.activities.home.DrawerActivity

class AddInGroupFragment : Fragment() {


    private lateinit var mBinding: FragmentAddInGroupBinding
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentAddInGroupBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        initUI()

    }

    fun initUI() {
        (activity as DrawerActivity?)?.hidebottomBar()
        mBinding.imgBack.setOnClickListener(View.OnClickListener {

            navController.navigateUp()
        })
        mBinding.btnAddUser.setOnClickListener(View.OnClickListener {

            navController.navigateUp()
        })
    }
}