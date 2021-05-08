package registerSystemHW.googleAuthenticationModule;

public class GoogleUserDb {
    public GoogleUserDetails[] getUsers(){
        GoogleUserDetails user1 = new GoogleUserDetails(1, "Mehmet", "Dızcı", "xKralTr@hotmail.com", "1356498");
        GoogleUserDetails user2 = new GoogleUserDetails(2, "Doğukan", "Koyunkesen", "sigara@Bore.com", "koyuncu");
        GoogleUserDetails user3 = new GoogleUserDetails(2, "Bora", "Lark", "sigara@Bore.com", "sdfgadfg");
        GoogleUserDetails[] googleUsers = {user1,user2, user3};
        return googleUsers;
}
}
