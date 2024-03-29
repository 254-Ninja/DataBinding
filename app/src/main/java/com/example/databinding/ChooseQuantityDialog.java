package com.example.databinding;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import codingwithmitch.com.databindinggettingstarted.databinding.DialogChooseQuantityBinding;


public class ChooseQuantityDialog extends DialogFragment {

    private static final String TAG = "ChooseQuantityDialog";

    // data binding
    DialogChooseQuantityBinding mBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DialogChooseQuantityBinding.inflate(inflater);
        mBinding.listView.setOnItemClickListener(mOnItemClickListener);
        mBinding.closeDialog.setOnClickListener(mCloseDialogListener);

        return mBinding.getRoot();
    }

    public AdapterView.OnItemClickListener mOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Log.d(TAG, "onItemSelected: selected: " + adapterView.getItemAtPosition(i));

            getDialog().dismiss();
        }
    };

    public View.OnClickListener mCloseDialogListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getDialog().dismiss();
        }
    };
}


























