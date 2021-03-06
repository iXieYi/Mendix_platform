// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class BH
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject bHMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.BH";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		BHNumber("BHNumber"),
		Location("Location"),
		BHType("BHType"),
		X("X"),
		Y("Y"),
		Z("Z"),
		Depth("Depth"),
		StartDate("StartDate"),
		EndDate("EndDate"),
		InitialWaterLevels("InitialWaterLevels"),
		PermanentWaterLevels("PermanentWaterLevels"),
		BHOutline("BHOutline"),
		BH_Engineering("MyFirstModule.BH_Engineering"),
		DrillingTeam_BH("MyFirstModule.DrillingTeam_BH");

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

	public BH(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.BH"));
	}

	protected BH(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject bHMendixObject)
	{
		if (bHMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.BH", bHMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.BH");

		this.bHMendixObject = bHMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'BH.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.BH initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.BH.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.BH initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.BH(context, mendixObject);
	}

	public static myfirstmodule.proxies.BH load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.BH.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.BH> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.BH> result = new java.util.ArrayList<myfirstmodule.proxies.BH>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.BH" + xpathConstraint))
			result.add(myfirstmodule.proxies.BH.initialize(context, obj));
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
	 * @return value of BHNumber
	 */
	public final java.lang.String getBHNumber()
	{
		return getBHNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of BHNumber
	 */
	public final java.lang.String getBHNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BHNumber.toString());
	}

	/**
	 * Set value of BHNumber
	 * @param bhnumber
	 */
	public final void setBHNumber(java.lang.String bhnumber)
	{
		setBHNumber(getContext(), bhnumber);
	}

	/**
	 * Set value of BHNumber
	 * @param context
	 * @param bhnumber
	 */
	public final void setBHNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bhnumber)
	{
		getMendixObject().setValue(context, MemberNames.BHNumber.toString(), bhnumber);
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
	 * @return value of BHType
	 */
	public final java.lang.Integer getBHType()
	{
		return getBHType(getContext());
	}

	/**
	 * @param context
	 * @return value of BHType
	 */
	public final java.lang.Integer getBHType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.BHType.toString());
	}

	/**
	 * Set value of BHType
	 * @param bhtype
	 */
	public final void setBHType(java.lang.Integer bhtype)
	{
		setBHType(getContext(), bhtype);
	}

	/**
	 * Set value of BHType
	 * @param context
	 * @param bhtype
	 */
	public final void setBHType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer bhtype)
	{
		getMendixObject().setValue(context, MemberNames.BHType.toString(), bhtype);
	}

	/**
	 * @return value of X
	 */
	public final java.math.BigDecimal getX()
	{
		return getX(getContext());
	}

	/**
	 * @param context
	 * @return value of X
	 */
	public final java.math.BigDecimal getX(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.X.toString());
	}

	/**
	 * Set value of X
	 * @param x
	 */
	public final void setX(java.math.BigDecimal x)
	{
		setX(getContext(), x);
	}

	/**
	 * Set value of X
	 * @param context
	 * @param x
	 */
	public final void setX(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal x)
	{
		getMendixObject().setValue(context, MemberNames.X.toString(), x);
	}

	/**
	 * @return value of Y
	 */
	public final java.math.BigDecimal getY()
	{
		return getY(getContext());
	}

	/**
	 * @param context
	 * @return value of Y
	 */
	public final java.math.BigDecimal getY(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Y.toString());
	}

	/**
	 * Set value of Y
	 * @param y
	 */
	public final void setY(java.math.BigDecimal y)
	{
		setY(getContext(), y);
	}

	/**
	 * Set value of Y
	 * @param context
	 * @param y
	 */
	public final void setY(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal y)
	{
		getMendixObject().setValue(context, MemberNames.Y.toString(), y);
	}

	/**
	 * @return value of Z
	 */
	public final java.math.BigDecimal getZ()
	{
		return getZ(getContext());
	}

	/**
	 * @param context
	 * @return value of Z
	 */
	public final java.math.BigDecimal getZ(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Z.toString());
	}

	/**
	 * Set value of Z
	 * @param z
	 */
	public final void setZ(java.math.BigDecimal z)
	{
		setZ(getContext(), z);
	}

	/**
	 * Set value of Z
	 * @param context
	 * @param z
	 */
	public final void setZ(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal z)
	{
		getMendixObject().setValue(context, MemberNames.Z.toString(), z);
	}

	/**
	 * @return value of Depth
	 */
	public final java.math.BigDecimal getDepth()
	{
		return getDepth(getContext());
	}

	/**
	 * @param context
	 * @return value of Depth
	 */
	public final java.math.BigDecimal getDepth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Depth.toString());
	}

	/**
	 * Set value of Depth
	 * @param depth
	 */
	public final void setDepth(java.math.BigDecimal depth)
	{
		setDepth(getContext(), depth);
	}

	/**
	 * Set value of Depth
	 * @param context
	 * @param depth
	 */
	public final void setDepth(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal depth)
	{
		getMendixObject().setValue(context, MemberNames.Depth.toString(), depth);
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
	 * @return value of InitialWaterLevels
	 */
	public final java.math.BigDecimal getInitialWaterLevels()
	{
		return getInitialWaterLevels(getContext());
	}

	/**
	 * @param context
	 * @return value of InitialWaterLevels
	 */
	public final java.math.BigDecimal getInitialWaterLevels(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.InitialWaterLevels.toString());
	}

	/**
	 * Set value of InitialWaterLevels
	 * @param initialwaterlevels
	 */
	public final void setInitialWaterLevels(java.math.BigDecimal initialwaterlevels)
	{
		setInitialWaterLevels(getContext(), initialwaterlevels);
	}

	/**
	 * Set value of InitialWaterLevels
	 * @param context
	 * @param initialwaterlevels
	 */
	public final void setInitialWaterLevels(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal initialwaterlevels)
	{
		getMendixObject().setValue(context, MemberNames.InitialWaterLevels.toString(), initialwaterlevels);
	}

	/**
	 * @return value of PermanentWaterLevels
	 */
	public final java.math.BigDecimal getPermanentWaterLevels()
	{
		return getPermanentWaterLevels(getContext());
	}

	/**
	 * @param context
	 * @return value of PermanentWaterLevels
	 */
	public final java.math.BigDecimal getPermanentWaterLevels(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.PermanentWaterLevels.toString());
	}

	/**
	 * Set value of PermanentWaterLevels
	 * @param permanentwaterlevels
	 */
	public final void setPermanentWaterLevels(java.math.BigDecimal permanentwaterlevels)
	{
		setPermanentWaterLevels(getContext(), permanentwaterlevels);
	}

	/**
	 * Set value of PermanentWaterLevels
	 * @param context
	 * @param permanentwaterlevels
	 */
	public final void setPermanentWaterLevels(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal permanentwaterlevels)
	{
		getMendixObject().setValue(context, MemberNames.PermanentWaterLevels.toString(), permanentwaterlevels);
	}

	/**
	 * @return value of BHOutline
	 */
	public final java.lang.String getBHOutline()
	{
		return getBHOutline(getContext());
	}

	/**
	 * @param context
	 * @return value of BHOutline
	 */
	public final java.lang.String getBHOutline(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BHOutline.toString());
	}

	/**
	 * Set value of BHOutline
	 * @param bhoutline
	 */
	public final void setBHOutline(java.lang.String bhoutline)
	{
		setBHOutline(getContext(), bhoutline);
	}

	/**
	 * Set value of BHOutline
	 * @param context
	 * @param bhoutline
	 */
	public final void setBHOutline(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String bhoutline)
	{
		getMendixObject().setValue(context, MemberNames.BHOutline.toString(), bhoutline);
	}

	/**
	 * @return value of BH_Engineering
	 */
	public final myfirstmodule.proxies.Engineering getBH_Engineering() throws com.mendix.core.CoreException
	{
		return getBH_Engineering(getContext());
	}

	/**
	 * @param context
	 * @return value of BH_Engineering
	 */
	public final myfirstmodule.proxies.Engineering getBH_Engineering(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Engineering result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BH_Engineering.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Engineering.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BH_Engineering
	 * @param bh_engineering
	 */
	public final void setBH_Engineering(myfirstmodule.proxies.Engineering bh_engineering)
	{
		setBH_Engineering(getContext(), bh_engineering);
	}

	/**
	 * Set value of BH_Engineering
	 * @param context
	 * @param bh_engineering
	 */
	public final void setBH_Engineering(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Engineering bh_engineering)
	{
		if (bh_engineering == null)
			getMendixObject().setValue(context, MemberNames.BH_Engineering.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BH_Engineering.toString(), bh_engineering.getMendixObject().getId());
	}

	/**
	 * @return value of DrillingTeam_BH
	 */
	public final myfirstmodule.proxies.DrillingTeam getDrillingTeam_BH() throws com.mendix.core.CoreException
	{
		return getDrillingTeam_BH(getContext());
	}

	/**
	 * @param context
	 * @return value of DrillingTeam_BH
	 */
	public final myfirstmodule.proxies.DrillingTeam getDrillingTeam_BH(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.DrillingTeam result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DrillingTeam_BH.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.DrillingTeam.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DrillingTeam_BH
	 * @param drillingteam_bh
	 */
	public final void setDrillingTeam_BH(myfirstmodule.proxies.DrillingTeam drillingteam_bh)
	{
		setDrillingTeam_BH(getContext(), drillingteam_bh);
	}

	/**
	 * Set value of DrillingTeam_BH
	 * @param context
	 * @param drillingteam_bh
	 */
	public final void setDrillingTeam_BH(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.DrillingTeam drillingteam_bh)
	{
		if (drillingteam_bh == null)
			getMendixObject().setValue(context, MemberNames.DrillingTeam_BH.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DrillingTeam_BH.toString(), drillingteam_bh.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return bHMendixObject;
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
			final myfirstmodule.proxies.BH that = (myfirstmodule.proxies.BH) obj;
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
		return "MyFirstModule.BH";
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
