package com.pro100svitlo.lockpattern.interfaces;

/**
 * Created by pro100svitlo on 1/24/16.
 */
public interface LPV_Interface {
    void isPatternExist(boolean isExist);
    void patternConfirmed(boolean isFirstEnter, String patternPass);
    void patternFailed();
    void setPatternCanceled();
}
