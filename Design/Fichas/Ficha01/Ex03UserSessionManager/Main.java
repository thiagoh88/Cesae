package Ex03UserSessionManager;

public class Main {
    public static void main(String[] args) {
UserSessionManager sessionManager = UserSessionManager.getInstance();
        System.out.println("Token de Acesso:"+sessionManager.getSessionToken());
        System.out.println("Ultimo Acesso:"+sessionManager.getLastAcessTime());

        sessionManager.updateLastAcessTime();

        System.out.println("Token de Acesso:"+sessionManager.getSessionToken());
        System.out.println("Ultimo Acesso:" +sessionManager.getLastAcessTime());
    }
}
