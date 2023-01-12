package com.labor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;

import com.labor.R;
import com.labor.adapter.HomeGirdListAdapter;
import com.labor.database.ModelHomeGrid;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMenu();
    }

    private void setMenu() {
        ArrayList<ModelHomeGrid> gridObj = new ArrayList<ModelHomeGrid>();
        ModelHomeGrid obj ;
        for (int i = 1; i < 5; i++) {
            switch (i) {
                case 1:
                    obj = new ModelHomeGrid();
                    obj.setId(i);
                    obj.setName("Add Labor");
                    obj.setImageIcon(getResources().getDrawable(R.drawable.ic_add_labor));
                    gridObj.add(obj);
                    break;
                case 2:
                    obj = new ModelHomeGrid();
                    obj.setId(i);
                    obj.setName("Attendance");
                    obj.setImageIcon(getResources().getDrawable(R.drawable.ic_attendance));
                    gridObj.add(obj);
                    break;
                case 3:
                    obj = new ModelHomeGrid();
                    obj.setId(i);
                    obj.setName("Manager");
                    obj.setImageIcon(getResources().getDrawable(R.drawable.ic_add_labor));
                    gridObj.add(obj);
                    break;
                case 4:
                    obj = new ModelHomeGrid();
                    obj.setId(i);
                    obj.setName("Profile");
                    obj.setImageIcon(getResources().getDrawable(R.drawable.ic_user));
                    gridObj.add(obj);
                    break;
            }
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.home_grid_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        // at last set adapter to recycler view.
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new HomeGirdListAdapter(gridObj, this));
    }

    @Override
    public void onClick(View v) {

    }
}