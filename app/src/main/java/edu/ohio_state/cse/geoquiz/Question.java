package edu.ohio_state.cse.geoquiz;

/**
 * Created by anu yadav on 20-11-2016.
 */

public class Question {
    private int mTextRedId;
    private boolean mAnswerTrue;

    public Question(int textRedId, boolean answerTrue){
        mTextRedId = textRedId;
        mAnswerTrue = answerTrue;
    }

    public void setTextRedId(int textRedId) {
        mTextRedId = textRedId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public int getTextRedId() {
        return mTextRedId;
    }
}
