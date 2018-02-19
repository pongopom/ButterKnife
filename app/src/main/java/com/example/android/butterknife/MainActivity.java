package com.example.android.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //TODO 6 bind your views like this
    @BindView(R.id.my_tv)
    TextView myTextView;

    //TODO 7 bind your string resources like this
    @BindString(R.string.test_string)
    String testString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // mow we can start using butterknife note if you are using a fragment you need to call unbinder.unbind();in the on onDestroyView()
        // check the link below for more of what you can do
        // http://jakewharton.github.io/butterknife/
        //TODO 5 call ButterKnife.bind(this); in the onCreate after setContentView
        ButterKnife.bind(this);
       // TODO 8 test out you bindings
        myTextView.setText(testString);
    }
}
