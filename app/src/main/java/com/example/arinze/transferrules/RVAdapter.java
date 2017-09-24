package com.example.arinze.transferrules;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Arinze on 9/23/2017.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.WalletsViewHolder>{
    List<Wallets> User_Wallets;

    public static class WalletsViewHolder extends RecyclerView.ViewHolder {
        TextView Wallet_Name,SN,Currency,Id,Balance;


        WalletsViewHolder(View itemView) {
            super(itemView);
            Wallet_Name = itemView.findViewById(R.id.wallet_name);
            SN = itemView.findViewById(R.id.SN);
            Currency = itemView.findViewById(R.id.currency);
            Id = itemView.findViewById(R.id.Id);
            Balance = itemView.findViewById(R.id.balance);
        }
    }

    RVAdapter(List<Wallets> user_wallet){
        this.User_Wallets = user_wallet;
    }

    @Override
    public WalletsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        WalletsViewHolder wvh= new WalletsViewHolder(v);
        return wvh;
    }

    @Override
    public void onBindViewHolder(WalletsViewHolder personViewHolder, int i) {

    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public int getItemCount() {
        return User_Wallets.size();
    }
}
