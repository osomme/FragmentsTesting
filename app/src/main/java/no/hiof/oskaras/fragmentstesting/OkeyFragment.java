package no.hiof.oskaras.fragmentstesting;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class OkeyFragment extends Fragment{
    private TextView textView;
    private ImageView imageView;

    public OkeyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the Fragment to the containing activity view.
        View view = inflater.inflate(R.layout.fragment_okey, container, false);

        // Get ViewModel object
        FragmentViewModel fragmentViewModel = ViewModelProviders.of(getActivity()).get(FragmentViewModel.class);

        // Get TextView
        textView = view.findViewById(R.id.okeyFragmentTextView);
        // Get ImageView
        imageView = view.findViewById(R.id.fragmentImageView);

        // Creates observers
        fragmentViewModel.getText().observe(this, text -> textView.setText(text));
        fragmentViewModel.getImage().observe(this, drawable -> imageView.setImageDrawable(drawable));

        return view;
    }
}
