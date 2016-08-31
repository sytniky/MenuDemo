package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.hillel.menudemo.R;

public class BlankFragment extends Fragment {

    private TextView tvFragmentText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        tvFragmentText = (TextView) v.findViewById(R.id.tvFragmentText);
        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        MenuItem item = menu.add("Добавить");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        tvFragmentText.setText("Фрагмент добавить");
        return true;
    }
}
