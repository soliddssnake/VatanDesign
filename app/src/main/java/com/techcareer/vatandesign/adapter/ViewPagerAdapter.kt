package com.techcareer.vatandesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techcareer.vatandesign.databinding.ItemPageBinding
import com.techcareer.vatandesign.model.Product

class ViewPagerAdapter(var mContext: Context, var itemList: List<Product>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {
    inner class ViewHolder(binding: ItemPageBinding) : RecyclerView.ViewHolder(binding.root) {
        var binding: ItemPageBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = ItemPageBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = itemList[position]
        val b = holder.binding

        b.imageViewProduct.setImageResource(
            mContext.resources.getIdentifier(
                item.productImage, "drawable", mContext.packageName
            )
        )
        b.textViewModel.text = item.productModel
        b.textViewPrice.text = "${item.productPrice} TL"
        b.textViewExplanation.text = item.productExplanation
    }
}