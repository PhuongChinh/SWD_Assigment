package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import models.Info;
import models.Intro;
import models.Product;

/**
 *
 * @author Admin
 */
public class DaoUtils {

    public Connection getConnection() throws Exception {
        Context initContext = new InitialContext();
        Context envContext = (Context) initContext.lookup("java:/comp/env");
        DataSource ds = (DataSource) envContext.lookup("jdbc/MARIA_CAFE");
        return ds.getConnection();
    }

    private void close(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
        if (conn != null) {
            conn.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (rs != null) {
            rs.close();
        }
    }

    public Info getInfo() throws Exception {
        String sql = "select * from Info";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return new Info(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
            return null;
        } finally {
            close(conn, stmt, rs);
        }
    }

    public Intro getIntro(String type) throws Exception {
        String sql = "select * from Intros where Type='" + type + "'";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        if (rs.next()) {
            return new Intro(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
        }
        return null;
        } finally {
            close(conn, stmt, rs);
        }
    }
    
    public Product getProduct(int id) throws Exception {
        String sql = "select * from Products where id=" + id;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        if (rs.next()) {
            return new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
        }
        return null;
        } finally {
            close(conn, stmt, rs);
        }
    }

    public List<Product> getTopTwoProducts() throws Exception {
        String sql = "select Top 2 * from Products order by CreatedTime DESC";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            List<Product> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        return list;
        } finally {
            close(conn, stmt, rs);
        }
    }
    
    public List<Product> getProductByPage(int pageId, int total) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            List<Product> list = new ArrayList<>();
            conn = getConnection();
            String sql = "select top " + total + " * from Products where ID not in (select top " + pageId + " ID from Products)";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(6)));
            }
            return list;
        } finally {
            close(conn, stmt, rs);
        }
    }

    public int getRowCount() throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            int count = -1;
            conn = getConnection();
            String sql = "select count(*) from Products";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } finally {
            close(conn, stmt, rs);
        }
    }
}
