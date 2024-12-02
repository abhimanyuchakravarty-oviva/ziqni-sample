package com.tryouts.gamification.admin;

@io.smallrye.config.ConfigMapping(prefix = "admin.client")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0014\u0010\u0002\u001a\u00020\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/tryouts/gamification/admin/AdminApiClientConfiguration;", "", "auth", "Lcom/tryouts/gamification/admin/AdminApiClientConfiguration$Auth;", "getAuth", "()Lcom/tryouts/gamification/admin/AdminApiClientConfiguration$Auth;", "server", "Lcom/tryouts/gamification/admin/AdminApiClientConfiguration$Server;", "getServer", "()Lcom/tryouts/gamification/admin/AdminApiClientConfiguration$Server;", "Auth", "Server", "ziqni-sample-quarkus"})
public abstract interface AdminApiClientConfiguration {
    
    @io.smallrye.config.WithName(value = "auth")
    @org.jetbrains.annotations.NotNull()
    public abstract com.tryouts.gamification.admin.AdminApiClientConfiguration.Auth getAuth();
    
    @io.smallrye.config.WithName(value = "server")
    @org.jetbrains.annotations.NotNull()
    public abstract com.tryouts.gamification.admin.AdminApiClientConfiguration.Server getServer();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lcom/tryouts/gamification/admin/AdminApiClientConfiguration$Auth;", "", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "realm", "getRealm", "resource", "getResource", "ziqni-sample-quarkus"})
    public static abstract interface Auth {
        
        @io.smallrye.config.WithName(value = "realm")
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getRealm();
        
        @io.smallrye.config.WithName(value = "resource")
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getResource();
        
        @io.smallrye.config.WithName(value = "api.key")
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getApiKey();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\u00a8\u0006\f"}, d2 = {"Lcom/tryouts/gamification/admin/AdminApiClientConfiguration$Server;", "", "host", "", "getHost", "()Ljava/lang/String;", "port", "", "getPort", "()I", "scheme", "getScheme", "ziqni-sample-quarkus"})
    public static abstract interface Server {
        
        @io.smallrye.config.WithName(value = "host")
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getHost();
        
        @io.smallrye.config.WithName(value = "port")
        public abstract int getPort();
        
        @io.smallrye.config.WithName(value = "scheme")
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getScheme();
    }
}