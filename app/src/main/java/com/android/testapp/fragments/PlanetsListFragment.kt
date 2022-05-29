package com.android.testapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.testapp.R
import com.android.testapp.adapter.PlanetsListAdapter
import com.android.testapp.network.ImagesListModel
import com.android.testapp.network.PlanetsListModel
import com.android.testapp.viewmodel.ImagesViewModel
import com.android.testapp.viewmodel.MainActivityViewModel


class PlanetsListFragment : Fragment()  {

    private lateinit var planetsAdapter: PlanetsListAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_planets_list, container, false)
        initViewModel(view)
        initViewModel()
        return view
    }

    private fun initViewModel(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val docrtion = DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(docrtion)



        planetsAdapter = PlanetsListAdapter(this.context)
        recyclerView.adapter = planetsAdapter

    }



    private fun initViewModel() {


        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)



            viewModel.getPlanetsListObserver().observe(viewLifecycleOwner, Observer<PlanetsListModel>{
                if(it != null){
                    planetsAdapter.setupUpdatedData(it.results)
                }
                else{
                    Toast.makeText(activity,"Something went wrong", Toast.LENGTH_SHORT).show()
                }
            })
        viewModel.makeApiCall()




        val viewModelForImages = ViewModelProvider(this).get(ImagesViewModel::class.java)



        viewModelForImages.getImageObserver().observe(viewLifecycleOwner, Observer<List<ImagesListModel>>{
            if(it != null){
                planetsAdapter.setupUpdatedDataForImages(it as ArrayList<ImagesListModel>?)
            }
            else{
                Toast.makeText(activity,"Something went wrong", Toast.LENGTH_SHORT).show()
            }
        })



        viewModelForImages.makeApiCallForImages()
    }

    companion object {

        @JvmStatic
        fun newInstance() = PlanetsListFragment()

    }
}