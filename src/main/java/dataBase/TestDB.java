package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DRIVER OK ! ");
			String url = "jdbc:mysql://127.0.0.1/sakila";
			String user = "root";
			String password = "toor";
			Connection connect = DriverManager.getConnection(url, user, password);

			// Cr�ation d'un objet Statement
			Statement state = connect.createStatement();
			// L'objet ResultSet contient le r�sultat de la requ�te SQL
			ResultSet accounts = state.executeQuery("SELECT * FROM compte");

			System.out.println("Affichage du contenu de la requete");

			System.out.println("\n**********************************");

			while (accounts.next()) {

				System.out.print(
						"\t" + accounts.getInt("nomCol1") + "     ||" + accounts.getString("nomCol2") + "     \t |");

				System.out.println("\n---------------------------------");

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
