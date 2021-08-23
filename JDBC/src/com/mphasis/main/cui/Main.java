package com.mphasis.main.cui;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Connection connection=null;
        //PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        CallableStatement callableStatement=null;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            //Establish Connection
            connection=DriverManager.getConnection("jdbc:oracle:thin:/DESKTOP-IAPGCGV:1521:orcl","hr","hrpass");
            System.out.println("Connected...");
            //connection.setAutoCommit(false);
            callableStatement=connection.prepareCall("{call USER_INSERT_PROC(?, ?, ?, ?)}");
            //Query the database

            callableStatement.registerOutParameter(1,Types.INTEGER);
            //callableStatement.setInt(1,9);
            callableStatement.setString(2, "Gaurav");
            callableStatement.setString(3, "3456");
            callableStatement.setString(4, "A");
            callableStatement.execute();
            System.out.println(callableStatement.getString(1));












            //Query the databse
            //preparedStatement=connection.prepareStatement("Select name from users");
            //preparedStatement=connection.prepareStatement("Select FIRST_NAME, LAST_NAME FROM EMPLOYEES WHERE DEPARTMENT_ID=?");
            //preparedStatement.setInt(1,30);

            //preparedStatement=connection.prepareStatement("UPDATE USERS SET STATUS=? WHERE ID=?");
           //preparedStatement.setString(1,"10");
           // preparedStatement.setInt(1,1);

            //int rowsEffected = preparedStatement.executeUpdate();
            //System.out.println(rowsEffected);
           // connection.commit();
            //resultSet=preparedStatement.executeQuery();
            //while(resultSet.next()){
              //  System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
            //}
            //resultSet.close();
            //preparedStatement.close();
            //connection.close();
            //callableStatement.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if (resultSet != null && ! resultSet.isClosed())
                    resultSet.close();
                if (callableStatement != null && ! callableStatement.isClosed())
                    callableStatement.close();
                if (connection != null && ! connection.isClosed())
                    connection.close();


            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }



    }


}
