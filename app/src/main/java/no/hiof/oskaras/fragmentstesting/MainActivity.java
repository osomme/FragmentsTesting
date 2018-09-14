package no.hiof.oskaras.fragmentstesting;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FragmentViewModel fragmentViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ViewModel Testing");

        // Get ViewModel
        fragmentViewModel = ViewModelProviders.of(this).get(FragmentViewModel.class);
    }

    public void goButtonClicked(View view) {
        fragmentViewModel.setText("Go pressed");
        fragmentViewModel.setImage(getDrawable(R.drawable.checkmark));
    }

    public void stopButtonClicked(View view) {
        fragmentViewModel.setText("Stop pressed");
        fragmentViewModel.setImage(getDrawable(R.drawable.stop_sign));
    }
}
