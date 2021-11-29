package kj.car.info;

import android.app.Activity;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;

public class ListAdapter extends ArrayAdapter<String> {  

    private final Activity context;  
    private final String[] maintitle;  
    private final Integer[] imgid;  

    public ListAdapter(Activity context, String[] maintitle, Integer[] imgid) {  
        super(context, R.layout.custom_list, maintitle);  
        // TODO Auto-generated constructor stub  

        this.context=context;  
        this.maintitle=maintitle;   
        this.imgid=imgid;  

    }  

    public View getView(int position,View view,ViewGroup parent) {  
        LayoutInflater inflater=context.getLayoutInflater();  
        View rowView=inflater.inflate(R.layout.custom_list, null,true);  

        TextView titleText = (TextView) rowView.findViewById(R.id.title);  
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);  

        titleText.setText(maintitle[position]);  
        imageView.setImageResource(imgid[position]);   

        return rowView;  
    };  
}  
