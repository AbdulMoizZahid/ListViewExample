package com.example.moizzahid.mypakistan;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    int[] images = {
            R.drawable.hurbenfamousplaces,
            R.drawable.mohenjodaro250,
            R.drawable.camelsintha222rdesert,
            R.drawable.famousc011itylahore,
            R.drawable.multanc5888ityofsaints,
            R.drawable.sukku1111rbridge458,
            R.drawable.famousc011itylahore,
            R.drawable.islamabadfamousplace102468,
            R.drawable.chitralamous44places};

    String[] names = {
            "Bhurben",
            "Mohen Jo Daro",
            "Thar",
            "Lahore",
            "Multan",
            "Sukkur",
            "Uch Sharif",
            "Islamabad",
            "Chitral"};
    String[] desc = {
            "Bhurben is 20 minutes away from the Jhika Galli, Murree. It attracts the visitors due to its natural beauty and a 10 KM golf course. It is a nine room’s golf course on the mountains and attracts a huge number of golfers..",
            "It is 580 Kilometres (350 miles) away from the biggest city of Pakistan (Karachi). Mohenjo daro is situated on the Dadu road.",
            "This area of Pakistan is totally different from rest of the country. It truly is an interesting area of Sindh. Basically Thar is a desert area and this desert is very wide and large.," +
                    "Lahore is the provincial Capital and a large city with huge population. It remained as an important city for the rulers, scholars, politicians, historians, and archaeologist and also for the visitors etc.",
            "It is the city of Sufis and Saints who preached the Islam in this region. In the South Asia Multan is the oldest city.",
            "Sukkur is a historical place and a site of interest. Around this place you could find many historical structures and contains many tombs of famous Saints. Sukkur is carrying the tomb of Mir Masoom and a large number of attractive Mosques (Masajid) in it.",
            "Hundreds of visitors come in Uch Sharif at annual basis. It was another historical and important city of 13th century. It was a central point of religious scholars, Sufis, Saints and poets of Asia.",
            "On the feet of Margalla hills this is new Capital of Pakistan after the Karachi. Malka-e-Kohsar Murree and valley of Kashmir is not so far from the Islamabad. ",
            "Chitral is an area with allot of natural beauty and spectacular sceneries. Chitral offers the visitor to climb the mountains and do some trekking activity. It is a wonderful valley with gorges people and pure environment."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.listView1);
        customadapter ca = new customadapter();
        list.setAdapter(ca);
        ImageView btn1 = (ImageView) findViewById(R.id.imageView6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Close();
            }
        });


    }
    private void Close() {
        finish();
        System.exit(0);
    }

    class customadapter extends BaseAdapter {

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 8;
        }

        @Override
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getView(int position, View views, ViewGroup arg2) {
            // TODO Auto-generated method stub
        views = getLayoutInflater().inflate(R.layout.custom , null);
        ImageView img = (ImageView) (views.findViewById(R.id.imageView1));
        TextView txt1 = (TextView) (views.findViewById(R.id.textView1));
        TextView txt2 = (TextView) (views.findViewById(R.id.textView2));

        img.setImageResource(images[position]);
        txt1.setText(names[position]);
        txt2.setText(desc[position]);

        return views;
         }

    }

}