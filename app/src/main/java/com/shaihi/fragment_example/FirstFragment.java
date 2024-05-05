package com.shaihi.fragment_example;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    private static final String ARG_TEXT_1ST = "TEXT_1ST";
    private static final String ARG_TEXT_2ND = "TEXT_2ND";

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment newInstance(String text) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT_2ND, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        TextView tvText = view.findViewById(R.id.tvFirstFragment);
        String data = getArguments().getString(ARG_TEXT_1ST, "First");
        // Inflate the layout for this fragment
        tvText.setText(data);

        EditText etFragmentOne = view.findViewById(R.id.etFragmentOne);
        etFragmentOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                assert getArguments() != null;
                getArguments().putString(ARG_TEXT_2ND, s.toString());
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}