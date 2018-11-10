package cn.customs.h2018.sample;

import cn.customs.h2018.sample.utils.CustomBussinessRuntimeException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {

  private final ErrorDecoder defaultErrorDecoder = new Default();

  @Override
  public Exception decode(String methodKey, Response response) {
    if (response.status() >= 400 && response.status() <= 600) {
      return new CustomBussinessRuntimeException("ok", "ok2");
    }
    return defaultErrorDecoder.decode(methodKey, response);
  }
}
