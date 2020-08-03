package layout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.row_date_of_birth_item.view.*

class  DateOfBirthRecyclerViewAdapter (val DOBList: List<Int>) :
RecyclerView.Adapter<DateOfBirthRecyclerViewAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DateOfBirthRecyclerViewAdapter.NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_date_of_birth_item, parent, false)
        return DateOfBirthRecyclerViewAdapter.NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return DOBList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvDateOfBirth.text = DOBList[position].toString()
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)

    fun onBindViewHolder(holder: NamesRecyclerViewAdapter.NamesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    fun onBindViewHolder(holder: AgeRecyclerViewAdapter.NamesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}
