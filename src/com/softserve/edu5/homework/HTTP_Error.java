package com.softserve.edu5.homework;

public enum HTTP_Error {
    UNAUTHORIZED_ERROR,
    PAYMENT_REQUIRED,
    FORBIDDEN,
    NOT_FOUND;

    private HTTP_Error() {
    }

    public HTTP_Error nameOfError(int a) {
        if (a == 401) {
            return UNAUTHORIZED_ERROR;
        } else if (a == 402) {
            return PAYMENT_REQUIRED;
        } else {
            return a == 403 ? FORBIDDEN : NOT_FOUND;
        }
    }
}
