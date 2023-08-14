package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = DB.getConnection(); // CONNECTA AO BANCO
		DB.closeConnection(); // FECHA A CONEXÃO AO BANCO
		
	}

}
