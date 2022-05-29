package com.android.testapp.adapter
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.testapp.PlanetsDetails
import com.android.testapp.R
import com.android.testapp.network.ImagesListModel
import com.android.testapp.network.PlanetInfo
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy


class PlanetsListAdapter( val context: Context?): RecyclerView.Adapter<PlanetsListAdapter.MyViewHolder>() {

    var planetsListData = ArrayList<PlanetInfo>()
    var imagesListData = ArrayList<ImagesListModel>()



    fun setupUpdatedData(items: ArrayList<PlanetInfo>?){
        if (items != null) {
            this.planetsListData = items
        }
        notifyDataSetChanged()
    }

    fun setupUpdatedDataForImages(items: ArrayList<ImagesListModel>?){
        if (items != null) {
            this.imagesListData = items
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_row, parent, false )
        return MyViewHolder(inflater, context)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(planetsListData[position],imagesListData[position])

        holder.itemView.setOnClickListener {
                view ->
            val intent = Intent(view.context, PlanetsDetails::class.java)
            intent.putExtra("id",(position + 1).toString())
            intent.putExtra("climate",planetsListData[position].climate)
            intent.putExtra("name",planetsListData[position].name)
            intent.putExtra("orbitalPeriod",planetsListData[position].orbital_period)
            view.context.startActivity(intent)




        }
    }

    override fun getItemCount(): Int {
        return planetsListData.size

    }

    class MyViewHolder(view: View, val context: Context?): RecyclerView.ViewHolder(view) {
        val imageThumb = view.findViewById<ImageView>(R.id.imageThumb)
        val planetName = view.findViewById<TextView>(R.id.planeName)
        val climate = view.findViewById<TextView>(R.id.climate)


        fun bind(data : PlanetInfo, imageData : ImagesListModel){
            data.name?.let{

                planetName.text = it
            }
            data.climate?.let{
                climate.text = it
            }
            imageData.url?.let{
                if (context != null) {
                    Glide.with(context)
                        .asDrawable()
                        .load(it) // image url
                        .diskCacheStrategy(DiskCacheStrategy.NONE)
                        .skipMemoryCache(true)
                        .centerCrop()
                        .into(imageThumb)
                };

            }


        }

    }
}