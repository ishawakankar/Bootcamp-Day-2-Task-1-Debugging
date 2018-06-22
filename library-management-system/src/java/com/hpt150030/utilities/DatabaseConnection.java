/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpt150030.utilities;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hardik
 */
public class DatabaseConnection {

    public Connection connect = null;
    private Statement statement = null;
    public PreparedStatement preparedStatement = null;
    public ResultSet resultSet = null;

    public DatabaseConnection() {
    }

    public void openConnection() throws SQLException, ClassNotFoundException, NullPointerException {
        try{
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
        connect = DriverManager
                .getConnection("jdbc:derby://localhost:1527/lms?"
                        +"user=root&password=hardik460");
        
        System.out.print(connect);
    }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }

    public void closeConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception exp) {

        }
    }
}
