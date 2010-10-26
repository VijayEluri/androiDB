package de.splitstudio.androidb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import de.splitstudio.androidb.annotation.Column;

class Metadata extends Table {

	static final String SQL = "CREATE TABLE IF NOT EXISTS Metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, version INTEGER NOT NULL, table TEXT NOT NULL)";

	@Column(notNull = true)
	private int tableVersion;

	@Column(notNull = true)
	private String tableName;

	public Metadata(final SQLiteDatabase db) {
		super(db);
	}

	public boolean findByName(final String name) {
		Cursor c = db.query(getTableName(), getColumnNames(), "tableName='" + name + "'", null, null, null, null);
		return fillFirst(c);
	}

	public void setVersion(final int version) {
		this.tableVersion = version;
	}

	public int getTableVersion() {
		return tableVersion;
	}

	public void setTable(final String table) {
		this.tableName = table;
	}

	public String getTable() {
		return tableName;
	}

}
