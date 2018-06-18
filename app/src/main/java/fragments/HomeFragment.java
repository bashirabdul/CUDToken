package fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import andriod.booking.token.cudtoken.LoginActivity;
import andriod.booking.token.cudtoken.MainActivity;
import andriod.booking.token.cudtoken.R;


public class HomeFragment extends Fragment {



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        Button studentBtn = (Button) rootView.findViewById(R.id.student_button);
        Button staffBtn = (Button) rootView.findViewById(R.id.staff_button);


        studentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( getActivity(), LoginActivity.class));
            }
        });

        return rootView ;
    }



}
