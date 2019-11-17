package com.example.finalexam07590519.adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalexam07590519.R;
import com.example.finalexam07590519.db.LedgerItem;

import java.util.List;

public class LedgerRecyclerViewAdapter extends RecyclerView.Adapter<LedgerRecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private int mLayoutResId;
    private List<LedgerItem> mLedgerItemList;

    public LedgerRecyclerViewAdapter(Context mContext, int mLayoutResId, List<LedgerItem> mLedgerItemList) {
        this.mContext = mContext;
        this.mLayoutResId = mLayoutResId;
        this.mLedgerItemList = mLedgerItemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mLayoutResId, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        LedgerItem item = mLedgerItemList.get(position);

        holder.descriptionTextView.setText(item.fullname);
        holder.amountTextView.setText(item.usermname);


        //holder.ledgerTypeImageView.setImageResource(item.amount > 0 ? R.drawable.ic_income : R.drawable.ic_expense);
    }

    @Override
    public int getItemCount() {
        return mLedgerItemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        private TextView descriptionTextView;
        private TextView amountTextView;

        private LedgerItem ledgerItem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            this.descriptionTextView = itemView.findViewById(R.id.description_text_view);
            this.amountTextView = itemView.findViewById(R.id.amount_text_view);

        }


    }

}
