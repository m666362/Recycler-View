package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ArrayList<ExampleItem> examplelist = new ArrayList<>();
        examplelist.add( new ExampleItem( (R.drawable.ic_android), "Line 1", "Line 2") );
        examplelist.add( new ExampleItem( (R.drawable.ic_airplanemode_active), "Line 1", "Line 2") );
        examplelist.add( new ExampleItem( (R.drawable.ic_aspect_ratio), "Line 1", "Line 2") );

        mRecyclerview = findViewById( R.id.aRecyclerView );
        mRecyclerview.setHasFixedSize( true );
        mLayoutmanager = new LinearLayoutManager( this );
        mAdapter = new ExampleAdapter( examplelist );


        mRecyclerview.setLayoutManager( mLayoutmanager );
        mRecyclerview.setAdapter( mAdapter );
    }
}
