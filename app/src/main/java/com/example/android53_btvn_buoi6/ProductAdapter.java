package com.example.android53_btvn_buoi6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<ProductModel> mListProducts;
    private Context mContext;

    public ProductAdapter(List<ProductModel> listProducts, MainActivity mainActivity) {
        this.mListProducts = listProducts;

    }



    public void updateList(List<ProductModel> listProducts){
        this.mListProducts = listProducts;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item_product,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int position) {
        ProductModel productModel = mListProducts.get(position);

        holder.tvTitle.setText(productModel.getTitle());
        holder.tvPrice.setText(String.valueOf(productModel.getPrice()));
        Glide.with(mContext).load(productModel.getImages()).into(holder.imgProduct);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi người dùng bấm vào sản phẩm
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListProducts != null ? mListProducts.size() :0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle;
        private TextView tvPrice;
        private ImageView imgProduct;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            imgProduct = itemView.findViewById(R.id.imgProduct);
        }
    }
}
