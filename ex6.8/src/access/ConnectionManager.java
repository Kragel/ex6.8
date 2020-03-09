package access;

public class ConnectionManager {
    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];
    {
        for(Connection x : ca)
            x = Connection.makeConnection();
    }
    public static Connection getConnection() {
        if(howManyLeft > 0)
            return ca[--howManyLeft];
        else {
            System.out.println("No more connections");
            return null;
        }
}
