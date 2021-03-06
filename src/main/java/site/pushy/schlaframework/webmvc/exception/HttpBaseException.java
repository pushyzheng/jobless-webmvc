package site.pushy.schlaframework.webmvc.exception;

import io.netty.handler.codec.http.HttpResponseStatus;

/**
 * @author Pushy
 * @since 2019/3/7 20:34
 */
public class HttpBaseException extends BaseException {

    private HttpResponseStatus status;

    public HttpBaseException(String message, HttpResponseStatus status) {
        super(message);
        this.status = status;
    }

    public HttpResponseStatus getStatus() {
        return status;
    }
}
