package com.shaihi.fragment_example;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    private static final String ARG_TEXT_1ST = "TEXT_1ST";
    private static final String ARG_TEXT_2ND = "TEXT_2ND";

    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment newInstance(String text) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT_1ST, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView tvText = view.findViewById(R.id.tvSecondFragment);
        String data = getArguments().getString(ARG_TEXT_2ND, "Second");
        // Inflate the layout for this fragment
        tvText.setText(data);

        EditText etFragmentTwo = view.findViewById(R.id.etFragmentTwo);
        etFragmentTwo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                assert getArguments() != null;
                getArguments().putString(ARG_TEXT_1ST, s.toString());
            }
        });
        return view;
    }
}