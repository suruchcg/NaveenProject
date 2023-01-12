package com.labor.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;
import com.labor.R;
import com.labor.activity.AddLaborActivity;
import com.labor.activity.AddManagerActivity;
import com.labor.database.ModelHomeGrid;

import java.util.ArrayList;

public class HomeGirdListAdapter extends RecyclerView.Adapter<HomeGirdListAdapter.ViewHolder> implements View.OnClickListener {

    private ArrayList<ModelHomeGrid> list;
    private Context context;

    public HomeGirdListAdapter(ArrayList<ModelHomeGrid> _list, Context _context) {
        this.list = _list;
        this.context = _context;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_list, viewGroup, false);
        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        ModelHomeGrid model = list.get(position);
        if (model.getName() != null) {
            viewHolder.textView.setText(list.get(position).getName());
            viewHolder.menuIcon.setBackground(list.get(position).getImageIcon());
        } else {
            viewHolder.textView.setText("");
            viewHolder.menuIcon.setBackground(null);
        }
        viewHolder.relParent.setOnClickListener(this);
        viewHolder.relParent.setTag(R.id.TAG_HOME_MENU_CLICK, list.get(position));

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

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.relParent) {
            ModelHomeGrid tagObj = (ModelHomeGrid) v.getTag(R.id.TAG_HOME_MENU_CLICK);
            Intent intent;
            switch (tagObj.getId()){
                case 1:
                     intent = new Intent(context, AddLaborActivity.class);
                    context.startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(context, AddLaborActivity.class);
                    context.startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(context, AddManagerActivity.class);
                    context.startActivity(intent);
                    break;
                case 4:
                    intent = new Intent(context, AddLaborActivity.class);
                    context.startActivity(intent);
                    break;
            }
        }

    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView menuIcon;
        private final LinearLayout relParent;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            relParent = (LinearLayout) view.findViewById(R.id.relParent);
            textView = (TextView) view.findViewById(R.id.txtMenuName);
            menuIcon = (ImageView) view.findViewById(R.id.menuIcon);
        }
    }


}
