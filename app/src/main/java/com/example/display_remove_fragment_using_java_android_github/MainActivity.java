package com.example.display_remove_fragment_using_java_android_github;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "fragment_tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragment(View view){
        SampleFragment sampleFragment = new SampleFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.frame_container,sampleFragment,TAG)
                .commit();
    }

    public void removeFragment(View view){

        Fragment fragment = getSupportFragmentManager()
                .findFragmentByTag(TAG);
        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
