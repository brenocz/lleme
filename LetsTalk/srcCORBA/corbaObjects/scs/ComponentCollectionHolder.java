package corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentCollectionHolder.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from deployment.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min28s BRST
 */

public final class ComponentCollectionHolder implements
		org.omg.CORBA.portable.Streamable {
	public corbaObjects.scs.ComponentCollection value = null;

	public ComponentCollectionHolder() {
	}

	public ComponentCollectionHolder(
			corbaObjects.scs.ComponentCollection initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = corbaObjects.scs.ComponentCollectionHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		corbaObjects.scs.ComponentCollectionHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return corbaObjects.scs.ComponentCollectionHelper.type();
	}

}