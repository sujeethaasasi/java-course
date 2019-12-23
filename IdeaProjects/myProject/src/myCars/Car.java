package myCars;

import java.lang.reflect.Array;

public class Car {
    private String carName;

    public void setCarName(String name) {
        carName = name;
    }

    public String getCarName() {
        return carName;
    }

//    public Array getDataById(int id) {
//        return Array();
//    }
//    public Array getDataAll() {
//        return Array();
//    }

    private String userName = "root";
    private String password = "admin@123@pass";
    private String host = "193.168.0.22:8080";

//    public connect() {
//        this.connectDB(this.userName, this.password, this.host);
//    }

    public void connectDB(String username, String pasword, String host) {

    }
}
