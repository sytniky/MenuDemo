package edu.hillel.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

import layout.BlankFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private CheckBox chbCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView) findViewById(R.id.tvFragmentText);
        chbCheck = (CheckBox) findViewById(R.id.chbCheck);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.flContainer, new BlankFragment())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.miDelete) {
            tvText.setText("");
        } else if (item.getItemId() == R.id.miSave) {
            tvText.setText(item.getTitle());
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.getItem(0).setEnabled(!chbCheck.isChecked());
        return true;
    }
}
