/*
* generated by Xtext
*/
package org.language;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ReqLanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.language.ui.internal.ReqLanguageActivator.getInstance().getInjector("org.language.ReqLanguage");
	}
	
}
