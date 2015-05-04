package chapter10_Class.sql;

public abstract class SqlAbs {
	public SqlAbs(String table, String[] columns) {
	}
	abstract public String generate();
}
