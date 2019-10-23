package ru.sberbankmobile.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageButton mButton1;
    private ImageButton mButton2;
    private ImageButton mButton3;
    private ImageButton mButton4;
    private ImageButton mButton5;
    private ImageButton mButton6;
    private ImageButton mButton7;
    private ImageButton mButton8;
    private ImageButton mButton9;

    private List<ImageButton> mButtons = new ArrayList<>(9);

    private TicTacToeField mField = new TicTacToeField(3);

    private TicTacToeField.Figure mFigure = TicTacToeField.Figure.CROSS;

    private TextView mCirclePoints;
    private TextView mCrossPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mButton1 = findViewById(R.id.button_1);
//        mButton2 = findViewById(R.id.button_2);
//        mButton3 = findViewById(R.id.button_3);
//        mButton4 = findViewById(R.id.button_4);
//        mButton5 = findViewById(R.id.button_5);
//        mButton6 = findViewById(R.id.button_6);
//        mButton7 = findViewById(R.id.button_7);
//        mButton8 = findViewById(R.id.button_8);
//        mButton9 = findViewById(R.id.button_9);

        mButtons.add((ImageButton) findViewById(R.id.button_1));
        mButtons.add((ImageButton) findViewById(R.id.button_2));
        mButtons.add((ImageButton) findViewById(R.id.button_3));
        mButtons.add((ImageButton) findViewById(R.id.button_4));
        mButtons.add((ImageButton) findViewById(R.id.button_5));
        mButtons.add((ImageButton) findViewById(R.id.button_6));
        mButtons.add((ImageButton) findViewById(R.id.button_7));
        mButtons.add((ImageButton) findViewById(R.id.button_8));
        mButtons.add((ImageButton) findViewById(R.id.button_9));

        mButton1.setTag(TicTacToeField.Figure.CROSS);

        mCirclePoints = findViewById(R.id.circle_points);
        mCrossPoints = findViewById(R.id.cross_points);

        TicTacToeField.Figure i = TicTacToeField.Figure.CIRCLE;

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mField.isEmptyCell(0, 0)) {
                    mField.setFigure(0, 0, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton1.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton1.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mField.isEmptyCell(0, 1)) {
                    mField.setFigure(0, 1, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton2.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton2.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mField.isEmptyCell(0, 2)) {
                    mField.setFigure(0, 2, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton3.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton3.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mField.isEmptyCell(1, 0)) {
                    mField.setFigure(1, 0, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton4.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton4.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mField.isEmptyCell(1, 1)) {
                    mField.setFigure(1, 1, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton5.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton5.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mField.isEmptyCell(1, 2)) {
                    mField.setFigure(1, 2, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton6.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton6.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mField.isEmptyCell(2, 0)) {
                    mField.setFigure(2, 0, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton7.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton7.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mField.isEmptyCell(2, 1)) {
                    mField.setFigure(2, 1, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton8.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton8.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mField.isEmptyCell(2, 2)) {
                    mField.setFigure(2, 2, (TicTacToeField.Figure) mButton1.getTag());
                    if (mButton1.getTag().equals(TicTacToeField.Figure.CROSS)) {
                        mButton1.setTag(TicTacToeField.Figure.CIRCLE);
                        mButton9.setImageResource(R.drawable.cross);
                    } else if (mButton1.getTag().equals(TicTacToeField.Figure.CIRCLE)) {
                        mButton1.setTag(TicTacToeField.Figure.CROSS);
                        mButton9.setImageResource(R.drawable.circle);
                    }

                    checkWinner();
                }
            }
        });
    }

    private void checkWinner() {
        switch (mField.getWinner()) {
            case CIRCLE:
                int points = Integer.parseInt(mCirclePoints.getText().toString());
                mCirclePoints.setText(String.valueOf(points + 1));
                mField = new TicTacToeField(3);
                clearField();
                break;
            case CROSS:
                points = Integer.parseInt(mCrossPoints.getText().toString());
                mCrossPoints.setText(String.valueOf(points + 1));
                mField = new TicTacToeField(3);
                clearField();
                break;
        }
    }

    private void changeFigure() {
        switch (mFigure) {
            case CIRCLE:
                mFigure = TicTacToeField.Figure.CROSS;
                break;
            case CROSS:
                mFigure = TicTacToeField.Figure.CIRCLE;
                break;
        }
    }

    private void clearField() {
        mButton1.setImageResource(android.R.color.transparent);
        mButton2.setImageResource(android.R.color.transparent);
        mButton3.setImageResource(android.R.color.transparent);
        mButton4.setImageResource(android.R.color.transparent);
        mButton5.setImageResource(android.R.color.transparent);
        mButton6.setImageResource(android.R.color.transparent);
        mButton7.setImageResource(android.R.color.transparent);
        mButton8.setImageResource(android.R.color.transparent);
        mButton9.setImageResource(android.R.color.transparent);
    }
}
