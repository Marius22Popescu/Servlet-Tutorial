package com.marius;
import java.util.Properties;
import java.io.FileInputStream;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

public class MySQLDatasourceFactory {
	
		public static DataSource getMySQLDataSource(){
			Properties p = new Properties();
			FileInputStream fis = null;
			BasicDataSource bs = null;
			
			try {
				
				fis = new FileInputStream("db.properties");
				p.load(fis);
				bs=new BasicDataSource();
				bs.setUrl(p.getProperty("MYSQL_DB_URL"));
				bs.setUsername(p.getProperty("MYSQL_DB_USERNAME"));
				bs.setPassword(p.getProperty("MYSQL_DB_PASSWORD"));
			}catch(Exception e) {
				e.printStackTrace();
				}
			return bs;
		}
	

}
