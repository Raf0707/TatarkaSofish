package ru.tabiin.tatarkasofish.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.tabiin.tatarkasofish.R
import ru.tabiin.tatarkasofish.objects.QuranItemModel

class QuranPlayerAdapter : RecyclerView.Adapter<QuranPlayerAdapter.ViewHolder>() {

    lateinit var context: Context
    lateinit var sureList: ArrayList<QuranItemModel>

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): QuranPlayerAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: QuranPlayerAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleTextView: TextView
        var iconImageView: ImageView

        init {
            titleTextView = itemView.findViewById<TextView>(R.id.sure_title_text)
            iconImageView = itemView.findViewById<ImageView>(R.id.icon_view)
        }
    }
}