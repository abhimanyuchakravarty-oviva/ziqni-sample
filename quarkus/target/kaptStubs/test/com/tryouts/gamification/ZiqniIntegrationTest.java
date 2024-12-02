package com.tryouts.gamification;

@io.quarkus.test.junit.QuarkusTest()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/tryouts/gamification/ZiqniIntegrationTest;", "", "()V", "stompWebSocketService", "Lcom/tryouts/gamification/StompWebSocketService;", "getStompWebSocketService", "()Lcom/tryouts/gamification/StompWebSocketService;", "setStompWebSocketService", "(Lcom/tryouts/gamification/StompWebSocketService;)V", "should post event to ziqni", "", "ziqni-sample-quarkus"})
public final class ZiqniIntegrationTest {
    @jakarta.inject.Inject()
    public com.tryouts.gamification.StompWebSocketService stompWebSocketService;
    
    public ZiqniIntegrationTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tryouts.gamification.StompWebSocketService getStompWebSocketService() {
        return null;
    }
    
    public final void setStompWebSocketService(@org.jetbrains.annotations.NotNull()
    com.tryouts.gamification.StompWebSocketService p0) {
    }
}