package com.example.kangbai.myokhttp;

/**
 * Created by kangbai on 2017/6/26.
 * 滴水穿石，铁杵成针
 */
public class Info {
    private String protocol;
    private int code;
    private String message;
    private String uri;

    @Override
    public String toString() {
        return "Response{" +
                "protocol='" + protocol + '\'' +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
