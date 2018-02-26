package com.hendercine.android.jokerdroid;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by James Henderson on 2/25/18.
 */

public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_joke, container, false);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView jokeTextView = root.findViewById(R.id.joke_text_view);
        if (!TextUtils.isEmpty(joke)) {
            jokeTextView.setText(joke);
        }
        return root;
    }
}
