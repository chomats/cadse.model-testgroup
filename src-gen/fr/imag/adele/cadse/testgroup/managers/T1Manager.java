package fr.imag.adele.cadse.testgroup.managers;


import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.cadseg.managers.dataModel.ItemManager;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.util.Convert;
import fr.imag.adele.cadse.testgroup.TestGroupCST;
import java.lang.String;



/**
    @generated
*/
public class T1Manager extends ItemManager {

	/**
	    @generated
	*/
	public T1Manager() {
		super();
	}

	/**
		@generated
	*/
	@Override
	public String computeQualifiedName(Item item, String name, Item parent, LinkType lt) {
		StringBuilder sb = new StringBuilder();
		try {
			Object value;
			Item currentItem;
			if (sb.length() != 0) {
				sb.append(".");
			}
			sb.append(name);
			return sb.toString();
		} catch (Throwable e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
		@generated
	*/
	@Override
	public String getDisplayName(Item item) {
		try {
			Object value;
			return item.getName();
		} catch (Throwable e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
		@generated
	*/
	public static final String getA0Attribute(Item t1) {
		return t1.getAttributeWithDefaultValue(TestGroupCST.T1_at_A0_, null);
	}

	/**
		@generated
	*/
	public static final void setA0Attribute(Item t1, String value) {
		try {
			t1.setAttribute(TestGroupCST.T1_at_A0_, value);
		} catch (Throwable t) {

		}
	}

	/**
		@generated
	*/
	public static final boolean isA1Attribute(Item t1) {
		return t1.getAttributeWithDefaultValue(TestGroupCST.T1_at_A1_, false);
	}

	/**
		@generated
	*/
	public static final void setA1Attribute(Item t1, boolean value) {
		try {
			t1.setAttribute(TestGroupCST.T1_at_A1_, value);
		} catch (Throwable t) {

		}
	}

}

