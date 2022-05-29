public class User {
    package Cinema.Objects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

    public class User {
        static public Level loggedInUserLevel;

        String firstName;
        String lastName;
        String userName;
        String password;
        String confirmPassword;

        public User(String userName, String password){
            this.userName = userName;
            this.password = password;
        }

        public User(String firstName, String lastName, String userName, String password, String confirmPassword){
            this(userName, password);
            this.firstName = firstName;
            this.lastName = lastName;
            this.confirmPassword = confirmPassword;
        }

        public String register(){
            if( firstName.isEmpty() || lastName.isEmpty() || userName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){ return "Fill in All Data";}
            try{
                Connection c = Database.getCon();
                PreparedStatement s = c.prepareStatement("Select user_name from Users where user_name = ?");
                s.setString(1, userName);
                ResultSet r = s.executeQuery();
                int rowCount = 0;
                while(r.next()){
                    rowCount++;
                }

                if(rowCount != 0) return "Username Already Exists!";

                if(!password.equals(confirmPassword)) return "Passwords Don't Match";
                PreparedStatement insert = c.prepareStatement("insert into Users values (default, ?, ?, ?, ?, ?)");
                insert.setString(1, firstName);
                insert.setString(2, lastName);
                insert.setString(3, userName);
                insert.setString(4, password);
                insert.setInt(5, Level.CUSTOMER.ordinal());
                insert.execute();
                loggedInUserLevel = Level.CUSTOMER;
            }catch (Exception e){
                e.printStackTrace();
            }
            return "";
        }

        public boolean login(){
            boolean state = false;
            if(userName.isEmpty() || password.isEmpty()){ return false;}
            try{
                Connection c = Database.getCon();
                PreparedStatement s = c.prepareStatement("Select * from Users WHERE user_name = ?");
                s.setString(1, this.userName);
                ResultSet r = s.executeQuery();
                while(r.next()){
                    if(r.getString("password").equals(this.password)){
                        loggedInUserLevel = Level.values()[r.getInt("level")];
                        state = true;
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return state;
        }
    }
}
