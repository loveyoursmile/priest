package com.little.g.thirdpay.exception;

import com.little.g.common.exception.ServiceDataException;

public class PayException extends ServiceDataException {

    public PayException(Integer code, String message) {
        super(code, message);
    }

    public PayException(Throwable cause) {
        super(cause);
    }

    public PayException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayException(Integer code) {
        super(code);
    }
}
