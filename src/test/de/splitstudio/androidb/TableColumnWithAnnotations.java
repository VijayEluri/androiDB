package de.splitstudio.androidb;

import android.database.sqlite.SQLiteDatabase;
import de.splitstudio.androidb.annotation.Column;

public class TableColumnWithAnnotations extends Table {

	public static final String SQL = "CREATE TABLE IF NOT EXISTS TableColumnWithAnnotations ( id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)";

	public TableColumnWithAnnotations(final SQLiteDatabase db) {
		super(db);
	}

	@Column(primaryKey = true, autoIncrement = true, notNull = true)
	protected Integer id;

	@Override
	public boolean isNew() {
		return id == null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

}
