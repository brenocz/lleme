package uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs;

/**
 * corbaObjects/scs/ComponentRepositoryOperations.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from deployment.idl
 * Sexta-feira, 9 de Dezembro de 2005 18h26min28s BRST
 */

public interface ComponentRepositoryOperations {
	void install(uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId id, String entry_point,
			boolean shared, byte[] file, String help_info)
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentAlreadyInstalled, 
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IOException;

	void uninstall(uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId id)
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotInstalled, 
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IOException;

	void copy(uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId id,
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentRepository rep)
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentAlreadyInstalled, 
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotInstalled;

	byte[] getComponentFile(uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId id)
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotInstalled, 
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.IOException;

	uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentDescription getComponentDescription(
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentId id)
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentNotInstalled;

	uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.ComponentDescription[] getInstalledComponents();
} // interface ComponentRepositoryOperations
