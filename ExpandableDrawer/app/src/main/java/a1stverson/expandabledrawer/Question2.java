package a1stverson.expandabledrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Question2 extends AppCompatActivity {
    private TextView question2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);


        question2 = (TextView)findViewById(R.id.txtQue2);
    }
}
