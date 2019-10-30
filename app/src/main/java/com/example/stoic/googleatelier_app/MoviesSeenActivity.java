package com.example.stoic.googleatelier_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MoviesSeenActivity extends AppCompatActivity {

    private static final String TAG = MoviesSeenActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);
        Log.d(TAG, "On create called");
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            MovieDetailsFragment fragment = new MovieDetailsFragment();
            fragment.setArguments(bundle);
            System.out.println(bundle);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
        }else{
            Toast.makeText(this,"no bundle was recived",Toast.LENGTH_LONG).show();
        }

    }
}
