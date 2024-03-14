package com.site.suinpj.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSockConf implements WebSocketConfigurer {
    private final WebSocketHandler webSocketHandler;
    
 // 생성자를 추가하여 webSocketHandler를 초기화
    public WebSockConf(WebSocketHandler webSocketHandler) {
        this.webSocketHandler = webSocketHandler;
    }
  
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // chat 경로를 통해 들어오는 웹 소켓 통신 요청에 대한 처리를 위한 Handler 추가
        registry.addHandler(webSocketHandler, "chat").setAllowedOrigins("*");
    }
}
