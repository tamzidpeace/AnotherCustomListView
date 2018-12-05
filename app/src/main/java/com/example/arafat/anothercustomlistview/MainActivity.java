package com.example.arafat.anothercustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] image = {R.drawable.movie_after_earth, R.drawable.movie_baby_driver, R.drawable.movie_deadpool};

    String[] Name = {"After Earth", "Baby Driver", "Deadpool"};
    String[] release = {"2013", "2017", "2016"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter customAdapter = new CustomAdapter();

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_layout, null);

            ImageView imageView = view.findViewById(R.id.imageView);
            TextView name = view.findViewById(R.id.textView_name);
            TextView description = view.findViewById(R.id.textView_description);

            imageView.setImageResource(image[i]);
            name.setText(Name[i]);
            description.setText(release[i]);

            return view;
        }
    }
}
