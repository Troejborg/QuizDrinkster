package com.liteapps.quizdrinkster;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rt
 * Date: 8/26/13
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerAmountFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        List<Button> buttonList = new ArrayList<>();

        return inflater.inflate(R.layout.player_amount, container, false);
    }
}
