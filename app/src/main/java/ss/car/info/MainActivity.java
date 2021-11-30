package ss.car.info;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity { 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	public void next(View view){
		startActivity(new Intent(this, Catalogue.class));
	}
}
// © https://github.com/ShivaShirsath
