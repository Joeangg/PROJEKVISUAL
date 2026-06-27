package tampilan;

public class USERID {
private static String kd;
public static void setUserLogin(String kode){
    kd = kode;
}
public static String getUserLogin(){
    return kd;
}
}
