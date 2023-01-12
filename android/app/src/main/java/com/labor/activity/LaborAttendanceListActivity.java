package com.labor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.labor.R;
//available labor will be display and miller will be take labor attendance again
public class LaborAttendanceListActivity extends AppCompatActivity {

    RecyclerView recycleLaborList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labor_list);
    }
}