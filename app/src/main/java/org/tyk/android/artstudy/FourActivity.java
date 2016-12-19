package org.tyk.android.artstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FourActivity extends AppCompatActivity {

    private MyParentView myParentView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        myParentView = (MyParentView) findViewById(R.id.parent_view);

    }


}
