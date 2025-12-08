package com.kodewala.strings;

class Query {
	StringBuilder query(int _employeID) {
		StringBuilder dbQuery = new StringBuilder("Select * from employe_details");

		try {
			if (_employeID > 0) {
				dbQuery.append(" where employeId " + _employeID);
			}
		} finally {
			dbQuery.append(";");
		}

		return dbQuery;
	}
}

public class SbSqlQuery {

	public static void main(String[] args) {

		Query q1 = new Query();
		System.out.println(q1.query(120));
		System.out.println(q1.query(0));

	}

}
