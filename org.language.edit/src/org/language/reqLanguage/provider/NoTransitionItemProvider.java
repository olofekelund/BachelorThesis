/**
 */
package org.language.reqLanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.language.reqLanguage.NoTransition;
import org.language.reqLanguage.ReqLanguageFactory;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * This is the item provider adapter for a {@link org.language.reqLanguage.NoTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NoTransitionItemProvider 
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
	public NoTransitionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ReqLanguagePackage.Literals.NO_TRANSITION__STATE);
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
	 * This returns NoTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NoTransition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_NoTransition_type");
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

		switch (notification.getFeatureID(NoTransition.class)) {
			case ReqLanguagePackage.NO_TRANSITION__STATE:
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
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createReqID()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createPrefixRightOperand()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createPrefixState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createPrefixCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createPrefixEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createParamEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createActorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createParameterState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createMainFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createMainComposition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createMainStateTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createMainAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createOutTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createNoTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
				 ReqLanguageFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.NO_TRANSITION__STATE,
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
