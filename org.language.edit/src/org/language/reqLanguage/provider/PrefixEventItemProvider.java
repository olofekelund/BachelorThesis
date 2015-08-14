/**
 */
package org.language.reqLanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.language.reqLanguage.PrefixEvent;
import org.language.reqLanguage.ReqLanguageFactory;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * This is the item provider adapter for a {@link org.language.reqLanguage.PrefixEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrefixEventItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixEventItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPrefixFixedSyntaxPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prefix Fixed Syntax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixFixedSyntaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PrefixEvent_prefixFixedSyntax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PrefixEvent_prefixFixedSyntax_feature", "_UI_PrefixEvent_type"),
				 ReqLanguagePackage.Literals.PREFIX_EVENT__PREFIX_FIXED_SYNTAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PrefixEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrefixEvent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PrefixEvent)object).getPrefixFixedSyntax();
		return label == null || label.length() == 0 ?
			getString("_UI_PrefixEvent_type") :
			getString("_UI_PrefixEvent_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PrefixEvent.class)) {
			case ReqLanguagePackage.PREFIX_EVENT__PREFIX_FIXED_SYNTAX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ReqLanguagePackage.PREFIX_EVENT__EVENT_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createReqID()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createPrefixRightOperand()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createPrefixState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createPrefixCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createPrefixEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createParamEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createActorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createParameterState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createMainFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createMainComposition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createMainStateTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createMainAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createOutTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createNoTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_EVENT__EVENT_EXPRESSION,
				 ReqLanguageFactory.eINSTANCE.createTimingConstraint()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ReqLanguageEditPlugin.INSTANCE;
	}

}
