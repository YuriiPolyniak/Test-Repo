package com.project.yura.testgit;

import android.app.Fragment;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction()
                .add(R.id.fragment, BlankFragment.newInstance("Text1", "Text2"))
                .commit();
    }

    @Override
    public void onFragmentInteraction(String message) {
        //some action from fragment
    }
}
