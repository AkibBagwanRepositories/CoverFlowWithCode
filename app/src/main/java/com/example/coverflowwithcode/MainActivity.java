package com.example.coverflowwithcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.coverflowwithcode.coverflow.CoverFlowAdapter;
import com.example.coverflowwithcode.coverflow.containers.FeatureCoverFlow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<CoverFlowAdapter.GameEntity> mData = new ArrayList<>(0);
        FeatureCoverFlow mCoverFlow = findViewById(R.id.coverflow);
        CoverFlowAdapter mAdapter = new CoverFlowAdapter(this, R.layout.coverflow_item, R.id.label_text, R.id.image_cover_flow);
        mData.add(new CoverFlowAdapter.GameEntity(R.drawable.ic_launcher_foreground, R.string.app_name));
//        mData.add(new CoverFlowAdapter.GameEntity(R.drawable.ic_launcher_foreground, R.string.app_name));
//        mData.add(new CoverFlowAdapter.GameEntity(R.drawable.ic_launcher_foreground, R.string.app_name));
        mData.add(new CoverFlowAdapter.GameEntity(R.drawable.ic_launcher_background, R.string.app_name));
//        mData.add(new CoverFlowAdapter.GameEntity(R.drawable.ic_launcher_foreground, R.string.app_name));
//        mData.add(new CoverFlowAdapter.GameEntity(R.drawable.ic_launcher_foreground, R.string.app_name));
//        mData.add(new CoverFlowAdapter.GameEntity(R.drawable.ic_launcher_foreground, R.string.app_name));

        mAdapter.setData(mData);
        mCoverFlow.setAdapter(mAdapter);
        mCoverFlow.scrollToPositionIfEndless(0);
        mCoverFlow.setSelection(0);

        mCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO CoverFlow item clicked
            }
        });

        mCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                //TODO CoverFlow stopped to position
            }

            @Override
            public void onScrolling() {
                //TODO CoverFlow began scrolling
            }
        });
    }
}
