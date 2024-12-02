package com.tryouts.gamification;

@jakarta.enterprise.context.ApplicationScoped()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u0007\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/tryouts/gamification/StompWebSocketService;", "", "configuration", "Lcom/tryouts/gamification/admin/AdminApiClientConfiguration;", "(Lcom/tryouts/gamification/admin/AdminApiClientConfiguration;)V", "sendMessage", "", "T", "message", "(Ljava/lang/Object;)V", "Companion", "ziqni-sample-quarkus"})
public final class StompWebSocketService {
    @org.jetbrains.annotations.NotNull()
    private final com.tryouts.gamification.admin.AdminApiClientConfiguration configuration = null;
    @org.jetbrains.annotations.NotNull()
    private static final io.github.oshai.kotlinlogging.KLogger logger = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EVENTS_API = "/aapi/createEvents";
    @org.jetbrains.annotations.NotNull()
    public static final com.tryouts.gamification.StompWebSocketService.Companion Companion = null;
    
    public StompWebSocketService(@org.jetbrains.annotations.NotNull()
    com.tryouts.gamification.admin.AdminApiClientConfiguration configuration) {
        super();
    }
    
    public final <T extends java.lang.Object>void sendMessage(T message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/tryouts/gamification/StompWebSocketService$Companion;", "", "()V", "EVENTS_API", "", "logger", "Lio/github/oshai/kotlinlogging/KLogger;", "ziqni-sample-quarkus"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}