package com.jhl.base.filter;

import com.jhl.base.LogWriter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;
import java.net.URLDecoder;

public class FeatureHttpServletRequestWrapper extends HttpServletRequestWrapper {

    String requestBody;

    public String getBody() {
        return requestBody;
    }

    public ServletInputStream getServletInputStream() {
        return servletInputStream;
    }

    ServletInputStream servletInputStream;
    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public FeatureHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        dodo(request);
    }

    @Override
    public ServletRequest getRequest() {
        return super.getRequest();
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        ServletRequest request=getRequest();
        ServletInputStream servletInputStream=new ServletInputStream() {
            InputStream inputStream = new ByteArrayInputStream(requestBody.getBytes(StringUtils.isEmpty(request.getCharacterEncoding()) ? "UTF-8" : request.getCharacterEncoding()));
            @Override
            public int read() throws IOException {
                return inputStream.read();
            }

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener listener) {

            }
        };
        return servletInputStream;
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(getInputStream()));
    }
    private void dodo(HttpServletRequest request){
        try {
            ServletInputStream inputStream = request.getInputStream();
            String characterEncoding = request.getCharacterEncoding();
            if(StringUtils.isEmpty(characterEncoding)){
                characterEncoding="UTF-8";
            }
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream,characterEncoding);
            char cbuf[] =new char[10];
            StringBuffer stringBuffer=new StringBuffer();
            int read=0;
            while ((read = inputStreamReader.read(cbuf,0,10)) != -1){
                stringBuffer.append(new String (ArrayUtils.subarray(cbuf,0,read)));
            }
            String contentType = StringUtils.isNotEmpty(request.getContentType()) ? request.getContentType() : "";
            if(contentType.contains("application/x-www-form-urlencoded")){
                requestBody =   URLDecoder.decode(stringBuffer.toString(),characterEncoding);
            }else if(contentType.contains("multipart/form-data")){

            }else {
                requestBody =stringBuffer.toString();
            }
//            byte[] bytes = StreamUtils.copyToByteArray(inputStream);
//            body=new String (bytes,characterEncoding);

            LogWriter.info(this.getClass(),"dodo body:{}", requestBody);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
