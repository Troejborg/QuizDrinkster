package com.liteapps.quizdrinkster;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created with IntelliJ IDEA.
 * User: rt
 * Date: 8/26/13
 * Time: 9:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class GamePackagesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.game_packages, container, false);
    }
}
