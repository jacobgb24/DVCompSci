package com.supermath.jacobgb24.supermath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.GridPagerAdapter;
import android.support.wearable.view.GridViewPager;
import android.support.wearable.view.WatchViewStub;
import android.support.wearable.view.WearableListView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

public class MainActivity extends Activity {
    GridViewPager gridViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        Intent launchAF = new Intent(this, Counter.class);
        startActivity(launchAF);
      /*  final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        final LayoutInflater inflater = getLayoutInflater();
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                gridViewPager = (GridViewPager) findViewById(R.id.pager);
                gridViewPager.setAdapter(new MyGridViewPagerAdapter());
                gridViewPager.setAdapter(new MyGridViewPagerAdapter(this, getFragmentManager()));
                ;
            }
        });
    }
    private class MyGridViewPagerAdapter extends GridPagerAdapter {
        @Override
        public int getColumnCount(int arg0) {
            return 2;
        }

        @Override
        public int getRowCount() {
            return 1;
        }

        @Override
        protected Object instantiateItem(ViewGroup container, int row, int col) {
            final View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.grid_view, container, false);
            final TextView textView = (TextView) view.findViewById(R.id.times_list_view);
            textView.setText(String.format("Page:\n%1$s, %2$s", row, col));
            container.addView(view);
            return view;
        }

        @Override
        protected void destroyItem(ViewGroup container, int row, int col, Object view) {
            container.removeView((View)view);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }*/
    }
}