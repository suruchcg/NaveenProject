package com.labor.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.labor.R;
import com.labor.database.LaborModel;
import com.labor.database.ModelHomeGrid;

import java.util.ArrayList;

public class LaborListAdapter extends RecyclerView.Adapter<LaborListAdapter.ViewHolder> {

    private ArrayList<LaborModel> list;
    private Context context;

    public LaborListAdapter(ArrayList<LaborModel> _list, Context _context) {
        this.list = _list;
        this.context = _context;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_labor_list, viewGroup, false);
        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        LaborModel model = list.get(position);
        if (model.getLaborName() != null) {
            viewHolder.txtName.setText(list.get(position).getLaborName());
        } else {
            viewHolder.txtName.setText("");
        }
        if (model.getLaborMobile() != null) {
            viewHolder.txtPhone.setText(list.get(position).getLaborMobile());
        } else {
            viewHolder.txtPhone.setText("");
        }


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private  TextView txtName,txtPhone;
        private  ImageView laborProfile;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            txtName = (TextView) view.findViewById(R.id.txtName);
            txtPhone = (TextView) view.findViewById(R.id.txtPhone);
            laborProfile = (ImageView) view.findViewById(R.id.laborProfile);
        }
    }


}
