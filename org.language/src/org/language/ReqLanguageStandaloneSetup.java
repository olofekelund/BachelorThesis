/*
* generated by Xtext
*/
package org.language;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ReqLanguageStandaloneSetup extends ReqLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new ReqLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
