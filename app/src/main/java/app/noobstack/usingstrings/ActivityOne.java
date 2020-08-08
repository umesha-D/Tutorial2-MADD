package app.noobstack.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        TextView txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }


    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle" , "onStart() invoked");
    }


    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle" , "onRestart() invoked");
    }


    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle" , "onResume() invoked");
    }


    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle" , "onPause() invoked");
    }


    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle" , "onStop() invoked");
    }


    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle" , "onDestroy() invoked");
    }

}