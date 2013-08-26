package com.liteapps.quizdrinkster;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Custom view implemented to indicate the user progress in the first use scenario.
 * @author rsb
 *
 */
public class ProgressIndicatorView extends LinearLayout
{
    private int opaqueWhite, transparentWhite;
    private Drawable transitionColor;
    static final int TRANSITION_TIME = 200;
    static final int AMOUNT_OF_SQUARES = 6;


    public ProgressIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ProgressIndicatorView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.setOrientation(LinearLayout.HORIZONTAL);

        opaqueWhite = getResources().getColor(R.color.white_opaque);
        transparentWhite = getResources().getColor(R.color.white_transparent);

        for (int i = 0; i < AMOUNT_OF_SQUARES; i++)
        {
            ImageView loadingPiece = new ImageView(context);
            //loadingPiece.setBackgroundColor(transparentWhite);
            //			loadingPiece.setBackgroundDrawable(transitionColor);
            loadingPiece.setImageDrawable(transitionColor);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0,
                    LinearLayout.LayoutParams.MATCH_PARENT, 1.0f);
            lp.setMargins(0, 15, 4, 15);
            this.addView(loadingPiece, lp);
        }
    }

    /**
     * Set the active step by changing the child view at index activeStep-1 and settings its background color to fully opaque.
     * @param activeStep
     */
    public void setProgressIndicator(int activeStep)
    {
        this.getChildAt(activeStep-1).setBackgroundColor(opaqueWhite);
        // Fade IN
        //		ImageView tempView = (ImageView) this.getChildAt(activeStep-1);
        //		TransitionDrawable transition = (TransitionDrawable)tempView.getDrawable();
        //		transition.startTransition(transitionTime);
    }
}