// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Project
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject projectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Project";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProjectName("ProjectName"),
		Number("Number"),
		ProjectType("ProjectType"),
		Location("Location"),
		Stage("Stage"),
		StartDate("StartDate"),
		EndDate("EndDate"),
		Photo("Photo"),
		Outline("Outline"),
		Memo("Memo");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Project(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Project"));
	}

	protected Project(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject projectMendixObject)
	{
		if (projectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Project", projectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Project");

		this.projectMendixObject = projectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Project.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Project initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Project.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Project initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Project(context, mendixObject);
	}

	public static myfirstmodule.proxies.Project load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Project.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Project> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Project> result = new java.util.ArrayList<myfirstmodule.proxies.Project>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Project" + xpathConstraint))
			result.add(myfirstmodule.proxies.Project.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ProjectName
	 */
	public final java.lang.String getProjectName()
	{
		return getProjectName(getContext());
	}

	/**
	 * @param context
	 * @return value of ProjectName
	 */
	public final java.lang.String getProjectName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProjectName.toString());
	}

	/**
	 * Set value of ProjectName
	 * @param projectname
	 */
	public final void setProjectName(java.lang.String projectname)
	{
		setProjectName(getContext(), projectname);
	}

	/**
	 * Set value of ProjectName
	 * @param context
	 * @param projectname
	 */
	public final void setProjectName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String projectname)
	{
		getMendixObject().setValue(context, MemberNames.ProjectName.toString(), projectname);
	}

	/**
	 * @return value of Number
	 */
	public final java.lang.String getNumber()
	{
		return getNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Number
	 */
	public final java.lang.String getNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Number.toString());
	}

	/**
	 * Set value of Number
	 * @param number
	 */
	public final void setNumber(java.lang.String number)
	{
		setNumber(getContext(), number);
	}

	/**
	 * Set value of Number
	 * @param context
	 * @param number
	 */
	public final void setNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String number)
	{
		getMendixObject().setValue(context, MemberNames.Number.toString(), number);
	}

	/**
	 * Set value of ProjectType
	 * @param projecttype
	 */
	public final myfirstmodule.proxies.ProjectType getProjectType()
	{
		return getProjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of ProjectType
	 */
	public final myfirstmodule.proxies.ProjectType getProjectType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProjectType.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.ProjectType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProjectType
	 * @param projecttype
	 */
	public final void setProjectType(myfirstmodule.proxies.ProjectType projecttype)
	{
		setProjectType(getContext(), projecttype);
	}

	/**
	 * Set value of ProjectType
	 * @param context
	 * @param projecttype
	 */
	public final void setProjectType(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.ProjectType projecttype)
	{
		if (projecttype != null)
			getMendixObject().setValue(context, MemberNames.ProjectType.toString(), projecttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProjectType.toString(), null);
	}

	/**
	 * @return value of Location
	 */
	public final java.lang.String getLocation()
	{
		return getLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of Location
	 */
	public final java.lang.String getLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Location.toString());
	}

	/**
	 * Set value of Location
	 * @param location
	 */
	public final void setLocation(java.lang.String location)
	{
		setLocation(getContext(), location);
	}

	/**
	 * Set value of Location
	 * @param context
	 * @param location
	 */
	public final void setLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String location)
	{
		getMendixObject().setValue(context, MemberNames.Location.toString(), location);
	}

	/**
	 * @return value of Stage
	 */
	public final java.lang.Integer getStage()
	{
		return getStage(getContext());
	}

	/**
	 * @param context
	 * @return value of Stage
	 */
	public final java.lang.Integer getStage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Stage.toString());
	}

	/**
	 * Set value of Stage
	 * @param stage
	 */
	public final void setStage(java.lang.Integer stage)
	{
		setStage(getContext(), stage);
	}

	/**
	 * Set value of Stage
	 * @param context
	 * @param stage
	 */
	public final void setStage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer stage)
	{
		getMendixObject().setValue(context, MemberNames.Stage.toString(), stage);
	}

	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	  * The contents of the binary field will be written to the output stream.
	  * The output stream will be closed at the end.
	  *
	  * @param context
	  * @param outputStream
	  */
	public final void getPhoto(com.mendix.systemwideinterfaces.core.IContext context, java.io.OutputStream outputStream)
	{
		com.mendix.core.objectmanagement.member.MendixBinary binary = (com.mendix.core.objectmanagement.member.MendixBinary) getMendixObject().getMember(context, MemberNames.Photo.toString());
		binary.retrieveValue(context, outputStream);
	}

	/**
	  * Stores the bytes from the given InputStream.
	  *
	  * Please note that the input stream will be immediately sent to the data store,
	  * whether you commit the Mendix object or not.
	  *
	  * @param context
	  * @param inputStream
	  * @param length the number of bytes in the stream
	  */
	public final void setPhoto(com.mendix.systemwideinterfaces.core.IContext context, java.io.InputStream inputStream, long length)
	{
		if (getMendixObject().getState() == com.mendix.systemwideinterfaces.core.IMendixObject.ObjectState.INSTANTIATED)
			try { commit(); } catch (com.mendix.core.CoreException ex) { }
		com.mendix.core.objectmanagement.member.MendixBinary binary = (com.mendix.core.objectmanagement.member.MendixBinary) getMendixObject().getMember(context, MemberNames.Photo.toString());
		binary.storeValue(context, inputStream, length);
	}

	/**
	 * @return value of Outline
	 */
	public final java.lang.String getOutline()
	{
		return getOutline(getContext());
	}

	/**
	 * @param context
	 * @return value of Outline
	 */
	public final java.lang.String getOutline(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Outline.toString());
	}

	/**
	 * Set value of Outline
	 * @param outline
	 */
	public final void setOutline(java.lang.String outline)
	{
		setOutline(getContext(), outline);
	}

	/**
	 * Set value of Outline
	 * @param context
	 * @param outline
	 */
	public final void setOutline(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String outline)
	{
		getMendixObject().setValue(context, MemberNames.Outline.toString(), outline);
	}

	/**
	 * @return value of Memo
	 */
	public final java.lang.String getMemo()
	{
		return getMemo(getContext());
	}

	/**
	 * @param context
	 * @return value of Memo
	 */
	public final java.lang.String getMemo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Memo.toString());
	}

	/**
	 * Set value of Memo
	 * @param memo
	 */
	public final void setMemo(java.lang.String memo)
	{
		setMemo(getContext(), memo);
	}

	/**
	 * Set value of Memo
	 * @param context
	 * @param memo
	 */
	public final void setMemo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String memo)
	{
		getMendixObject().setValue(context, MemberNames.Memo.toString(), memo);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return projectMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Project that = (myfirstmodule.proxies.Project) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Project";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
