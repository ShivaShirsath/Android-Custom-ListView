package kj.car.info;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;

public class Catalogue extends Activity 
{  
    ListView list;  

    String[] maintitle ={  
		"Title 1","Title 2",  
		"Title 3","Title 4",  
		"Title 5",  
    };    

    Integer[] imgid={  
		android.R.drawable.stat_sys_phone_call_forward,
		android.R.drawable.star_big_on,
		android.R.drawable.presence_away,
		android.R.drawable.ic_menu_myplaces,
		android.R.drawable.btn_star_big_on,
    };  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.catalogue);  

        ListAdapter adapter=new ListAdapter(this, maintitle, imgid);  
        list=(ListView)findViewById(R.id.list);  
        list.setAdapter(adapter);  


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {  
				@Override  
				public void onItemClick(AdapterView<?> parent, View view,int position, long id) {  
					// TODO Auto-generated method stub    
				}  
			});  
    }  
}  
