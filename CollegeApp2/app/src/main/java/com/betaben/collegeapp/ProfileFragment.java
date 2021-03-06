package com.betaben.collegeapp;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.backendless.Backendless;
import com.backendless.async.callback.BackendlessCallback;

/**
 * Created by Ben on 10/26/16.
 */

public class ProfileFragment extends Fragment {

    private Button submit;
    private Profile profile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);

        profile = new Profile("first", "last", "mail");

        submit = (Button) getView().findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                save();
            }
        });

        View rootView = inflater.inflate(R.layout.profile_fragment, container, false);
        return rootView;
    }

    @Override
    public void onPause() {
        super.onPause();
        save();
    }

    public void save() {
        Backendless. Persistence.save(profile, new BackendlessCallback<Profile>() {
            @Override
            public void handleResponse(Profile response){
                Log.i("Hello: ", "Saved profile to Backendless.");
            }
        });
    }
}
