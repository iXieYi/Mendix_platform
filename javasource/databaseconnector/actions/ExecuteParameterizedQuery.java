// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package databaseconnector.actions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;
import com.mendix.webui.CustomJavaAction;
import databaseconnector.impl.JdbcConnector;

/**
 * <p>
 * This Java action provides a consistent environment for Mendix projects to perform an arbitrary parameterized SELECT SQL query on relational external databases.
 * JDBC (Java Database Connectivity) API, a standard Java API, is used when this Java action attempts
 * to connect with a Relational Database for which a JDBC driver exists.
 * The JDBC drivers for the databases you want to connect to, must be placed inside the userlib directory of a project.
 * </p>
 * 
 * Do not use this Java action for INSERT, UPDATE, DELETE or DDL queries.
 * This action returns a list of Mendix objects based on the JDBC result set.
 * The jdbcUrl argument must specify a database URL address that points to your relational database and is dependent
 * upon the particular database and JDBC driver. It will always begin with "jdbc:" protocol, but the rest is up to particular vendor.
 * For example 'jdbc:mysql://hostname/databaseName' jdbcUrl format can be used for MySQL databases.
 * Note: Proper security must be applied as this action can allow SQL Injection in your Mendix application.
 * 
 * @see    JdbcConnector
 * @since  Mendix World 2016
 * @param <String> jdbcUrl
 *    A database URL address that points to your database.
 * 
 * @param <String> userName 
 *    The user name for logging into the database, relative to the jdbcUrl argument.
 * 
 * @param <String> password 
 *    The password for logging into the database, relative to the jdbcUrl argument.
 * 
 * @param <IStringTemplate> sql
 *    A string template containing the SELECT query to be performed and the query parameters, relative to the database type.
 * 
 * @param <String> resultObjectType
 *    A fully qualified name of the result object type. Concrete <IMetaObject> can be retrieved with a call to `Core.getMetaObject`.
 * 
 * @return <List<IMendixObject>>
 *    SELECT Query result as a list of objects.
 */
public class ExecuteParameterizedQuery extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String jdbcUrl;
	private java.lang.String userName;
	private java.lang.String password;
	private com.mendix.systemwideinterfaces.javaactions.parameters.IStringTemplate sql;
	private java.lang.String resultObjectType;

	public ExecuteParameterizedQuery(IContext context, java.lang.String jdbcUrl, java.lang.String userName, java.lang.String password, com.mendix.systemwideinterfaces.javaactions.parameters.IStringTemplate sql, java.lang.String resultObjectType)
	{
		super(context);
		this.jdbcUrl = jdbcUrl;
		this.userName = userName;
		this.password = password;
		this.sql = sql;
		this.resultObjectType = resultObjectType;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		IMetaObject metaObject = Core.getMetaObject(this.resultObjectType);
		Stream<IMendixObject> resultStream = connector.executeQuery(
				this.jdbcUrl, this.userName, this.password, metaObject, this.sql, this.getContext());
		List<IMendixObject> resultList = resultStream.collect(Collectors.toList());
		logNode.trace(String.format("Result list count: %d", resultList.size()));

		return resultList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ExecuteParameterizedQuery";
	}

	// BEGIN EXTRA CODE
	private final ILogNode logNode = Core.getLogger(this.getClass().getName());

	private final JdbcConnector connector = new JdbcConnector(logNode);
	// END EXTRA CODE
}
