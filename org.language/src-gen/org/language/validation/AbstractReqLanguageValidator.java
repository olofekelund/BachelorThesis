/*
 * generated by Xtext
 */
package org.language.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractReqLanguageValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.language.reqLanguage.ReqLanguagePackage.eINSTANCE);
		return result;
	}
}
