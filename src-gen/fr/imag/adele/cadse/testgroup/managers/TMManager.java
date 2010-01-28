package fr.imag.adele.cadse.testgroup.managers;


import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.cadseg.managers.dataModel.ItemManager;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.util.Convert;
import fr.imag.adele.cadse.testgroup.TestGroupCST;



/**
    @generated
*/
public class TMManager extends ItemManager {

	/**
	    @generated
	*/
	public TMManager() {
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
	public static final boolean isATMAttribute(Item tM) {
		return tM.getAttributeWithDefaultValue(TestGroupCST.TM_at_ATM_, false);
	}

	/**
		@generated
	*/
	public static final void setATMAttribute(Item tM, boolean value) {
		try {
			tM.setAttribute(TestGroupCST.TM_at_ATM_, value);
		} catch (Throwable t) {

		}
	}

}

