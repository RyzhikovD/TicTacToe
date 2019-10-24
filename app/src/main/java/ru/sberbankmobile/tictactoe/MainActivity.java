package ru.sberbankmobile.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ImageButton> mButtons = new ArrayList<>(9);

    private TicTacToeField mField = new TicTacToeField(3);

    private TicTacToeField.Figure mFigure = TicTacToeField.Figure.CROSS;

    private TextView mCirclePoints;
    private TextView mCrossPoints;
    private TextView mWinnerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtons.add((ImageButton) findViewById(R.id.button_1));
        mButtons.add((ImageButton) findViewById(R.id.button_2));
        mButtons.add((ImageButton) findViewById(R.id.button_3));
        mButtons.add((ImageButton) findViewById(R.id.button_4));
        mButtons.add((ImageButton) findViewById(R.id.button_5));
        mButtons.add((ImageButton) findViewById(R.id.button_6));
        mButtons.add((ImageButton) findViewById(R.id.button_7));
        mButtons.add((ImageButton) findViewById(R.id.button_8));
        mButtons.add((ImageButton) findViewById(R.id.button_9));

        mCirclePoints = findViewById(R.id.circle_points);
        mCrossPoints = findViewById(R.id.cross_points);

        mWinnerView = findViewById(R.id.winner);

        for (final ImageButton button : mButtons) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int row = mButtons.indexOf(button) / 3;
                    int column = mButtons.indexOf(button) % 3;
                    if (mField.isEmptyCell(row, column)) {
                        setFigure(row, column, button);
                        checkWinner();
                    }
                }
            });
        }
    }

    private void checkWinner() {
        switch (mField.getWinner()) {
            case CIRCLE:
                int points = Integer.parseInt(mCirclePoints.getText().toString());
                mCirclePoints.setText(String.valueOf(points + 1));
                startNewGame(TicTacToeField.Figure.CIRCLE);
                break;
            case CROSS:
                points = Integer.parseInt(mCrossPoints.getText().toString());
                mCrossPoints.setText(String.valueOf(points + 1));
                startNewGame(TicTacToeField.Figure.CROSS);
                break;
            case NONE:
                if (mField.isFull()) {
                    startNewGame(TicTacToeField.Figure.NONE);
                }
                break;
        }
    }

    private void setFigure(int row, int column, ImageButton button) {
        mField.setFigure(row, column, mFigure);
        switch (mFigure) {
            case CIRCLE:
                button.setImageResource(R.drawable.circle);
                mFigure = TicTacToeField.Figure.CROSS;
                break;
            case CROSS:
                button.setImageResource(R.drawable.cross);
                mFigure = TicTacToeField.Figure.CIRCLE;
                break;
        }
    }

    private void startNewGame(TicTacToeField.Figure winner) {
        mField = new TicTacToeField(3);
        mFigure = TicTacToeField.Figure.CROSS;
        for (ImageButton button : mButtons) {
            button.setImageResource(android.R.color.transparent);
        }

        String winnerText;
        switch (winner) {
            case NONE:
                winnerText = getResources().getString(R.string.draw);
                break;
            case CROSS:
                winnerText = getResources().getString(R.string.cross_win);
                break;
            case CIRCLE:
                winnerText = getResources().getString(R.string.circle_win);
                break;
            default:
                winnerText = getResources().getString(R.string.empty_string);
                break;
        }

        mWinnerView.setText(winnerText);
        mWinnerView.setVisibility(View.VISIBLE);

        mWinnerView.postDelayed(new Runnable() {
            public void run() {
                mWinnerView.setVisibility(View.INVISIBLE);
            }
        }, 3000);
    }
}
